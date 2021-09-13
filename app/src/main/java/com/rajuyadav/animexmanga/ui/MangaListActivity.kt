package com.rajuyadav.animexmanga.ui

import android.app.Dialog
import android.content.ActivityNotFoundException
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.RequestConfiguration
import com.rajuyadav.animexmanga.App
import com.rajuyadav.animexmanga.BaseActivity
import com.rajuyadav.animexmanga.R
import com.rajuyadav.animexmanga.databinding.ActivityMainBinding
import com.rajuyadav.animexmanga.utilities.Constants
import com.rajuyadav.animexmanga.viewmodel.MainViewModel

class MangaListActivity : BaseActivity() {

    private var dialogForceUpdate: Dialog? = null

    private val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    private fun inject() {
        App.appComponent.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil
            .setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        val categoryLinearLayoutManager = GridLayoutManager(this, 4)
        categoryLinearLayoutManager.orientation = GridLayoutManager.VERTICAL
        binding.activityMainRecyclerviewList.layoutManager = categoryLinearLayoutManager
        binding.activityMainRecyclerviewList.adapter = viewModel.mangalistAdapter

        inject()
        //loading banner ad
        initializeAdMod(binding.adView)

        subscribeDataCallBack()

        if (isNetworkAvailable(this)) {
            viewModel.getMangaAPI(this, binding)
        } else {
            Toast.makeText(
                applicationContext,
                getString(R.string.internet_text),
                Toast.LENGTH_SHORT
            ).show()

            viewModel.mangalistAdapter?.modelResponseMainMangaList = ArrayList()
            viewModel.mangalistAdapter?.modelResponseMangaList = ArrayList()
            viewModel.mangalistAdapter?.modelResponseFilterMangaList = ArrayList()

            val mangaList = viewModel.getMangaDataFromDB(this)
            if (viewModel.mangalistAdapter?.modelResponseMainMangaList?.size!! > 0) {
                viewModel.mangalistAdapter?.modelResponseMainMangaList?.clear()
                viewModel.mangalistAdapter?.modelResponseMainMangaList?.addAll(mangaList)
                viewModel.mangalistAdapter?.setDataToList(mangaList)
            } else {
                viewModel.mangalistAdapter?.modelResponseMainMangaList?.addAll(mangaList)
                viewModel.mangalistAdapter?.setDataToList(mangaList)
            }
        }

        binding.animeButton.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(Constants.ANIME_URL))
            startActivity(browserIntent)
        }

        binding.swipeRefreshView.setOnRefreshListener {
            if (binding.swipeRefreshView.isRefreshing) {
                binding.swipeRefreshView.isRefreshing = false
            }
            val mangaList = viewModel.getMangaDataFromDB(this)
            println("manga list >>> $mangaList")

            mangaList.reverse()

            println("reverse manga list >>> $mangaList")

            if (viewModel.mangalistAdapter?.modelResponseMainMangaList?.size!! > 0) {
                viewModel.mangalistAdapter?.modelResponseMainMangaList?.clear()
                viewModel.mangalistAdapter?.modelResponseMainMangaList?.addAll(mangaList)
                viewModel.mangalistAdapter?.setDataToList(mangaList)
            } else {
                viewModel.mangalistAdapter?.modelResponseMainMangaList?.addAll(mangaList)
                viewModel.mangalistAdapter?.setDataToList(mangaList)
            }
        }
        checkUpdate()
        filterList(binding.activityMainEdittextSearchManga)
    }

    private fun checkUpdate() {
        viewModel.modelResponseForceUpdate.observe(this, {
            if (it != null && it.success == "1") {
                if (it.data.normal_update == "1") {
                    showForceUpdateDialog(false, it.message)
                }

                if (it.data.force_update == "1") {
                    showForceUpdateDialog(true, it.message)
                }
            }
        })

    }

    override fun onPause() {
        super.onPause()

        dialogForceUpdate?.let {
            dialogForceUpdate!!.dismiss()
        }
    }

    private fun initializeAdMod(adView: AdView) {
        val testDeviceIds = listOf("559A47AE3F14018674DCBEE1B6694E3E")
        val configuration = RequestConfiguration.Builder()
//            .setTestDeviceIds(testDeviceIds)
            .build()
        MobileAds.setRequestConfiguration(configuration)
        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)
    }

    override fun onBackPressed() {
        val dialogBuilder = AlertDialog.Builder(this)

        // set message of alert dialog
        dialogBuilder.setMessage(R.string.exit_app_msg)
            // if the dialog is cancelable
            .setCancelable(false)
            // positive button text and action
            .setPositiveButton(R.string.yes_text) { _, _ ->
                finishAffinity()
            }
            // negative button text and action
            .setNegativeButton(R.string.no_text) { dialog, _ ->
                dialog.cancel()
            }
        val alert = dialogBuilder.create()
        // set title for alert dialog box
        alert.setTitle(R.string.exit_app_title)
        // show alert dialog
        alert.show()
    }

    private fun filterList(activityMainEdittextSearchManga: EditText) {
        viewModel.filterMangaList(activityMainEdittextSearchManga)
    }

    private fun subscribeDataCallBack() {
        viewModel.getMangaData()?.observe(this, {
            if (it != null) {
                if (viewModel.mangalistAdapter?.modelResponseMainMangaList?.size!! > 0) {
                    val mangaList = viewModel.getMangaDataFromDB(this)
                    println("manga list >>> $mangaList")

                    viewModel.mangalistAdapter?.modelResponseMainMangaList?.clear()
                    viewModel.mangalistAdapter?.modelResponseMainMangaList?.addAll(mangaList)
                    viewModel.mangalistAdapter?.setDataToList(mangaList)
                } else {
                    viewModel.mangalistAdapter?.modelResponseMainMangaList?.addAll(it)
                    viewModel.mangalistAdapter?.setDataToList(it)
                }
            } else {
                val mangaList = viewModel.getMangaDataFromDB(this)
                println("manga list >>> $mangaList")

                mangaList.reverse()

                println("reverse manga list >>> $mangaList")

                if (viewModel.mangalistAdapter?.modelResponseMainMangaList?.size!! > 0) {
                    viewModel.mangalistAdapter?.modelResponseMainMangaList?.clear()
                    viewModel.mangalistAdapter?.modelResponseMainMangaList?.addAll(mangaList)
                    viewModel.mangalistAdapter?.setDataToList(mangaList)
                } else {
                    viewModel.mangalistAdapter?.modelResponseMainMangaList?.addAll(mangaList)
                    viewModel.mangalistAdapter?.setDataToList(mangaList)
                }
            }
        })

        viewModel.getListTrigger()?.observe(this, {
            if (it != null) {
                val intentDetails = Intent(this, MangaDetailsVIewPagerActivity::class.java)
                intentDetails.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                intentDetails.putExtra("chapNum", it.manga_chap)
                intentDetails.putExtra("chapName", it.manga_name)
                intentDetails.putExtra("chapLinks", it.links)
                startActivity(intentDetails)
            }
        })
    }

    private fun showForceUpdateDialog(isForce: Boolean, strMessage: String) {

        val mAlertDialogBuilder = AlertDialog.Builder(this, R.style.AlertDialog_AppCompat)

        mAlertDialogBuilder.setTitle(resources.getString(R.string.app_name))
            .setMessage(strMessage) //Please update your app for better performance
            .setCancelable(false)
            .setPositiveButton("Update") { dialog, _ ->
                dialog.dismiss()
                openPlayStoreApp(strMessage)
            }

        if (!isForce) {
            mAlertDialogBuilder.setNegativeButton(
                "Later"
            ) { dialogInterface: DialogInterface, _: Int -> dialogInterface.dismiss() }
        }

        if (dialogForceUpdate == null) {
            dialogForceUpdate = mAlertDialogBuilder.create()
        }

        if (!dialogForceUpdate!!.isShowing) {
            dialogForceUpdate!!.show()
        }

    }

    private fun openPlayStoreApp(strLink: String) {
        val appPackageName =
            packageName // getPackageName() from Context or Activity object
        try {
            if (strLink.isNotBlank()) {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse(strLink)
                    )
                )
            } else {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("market://details?id=$appPackageName")
                    )
                )
            }

        } catch (anfe: ActivityNotFoundException) {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=$appPackageName")
                )
            )
        }
    }
}