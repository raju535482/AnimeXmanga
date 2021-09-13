package com.rajuyadav.animexmanga.ui

import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager.widget.ViewPager
import com.rajuyadav.animexmanga.BaseActivity
import com.rajuyadav.animexmanga.R
import com.rajuyadav.animexmanga.adapters.MangaDetailsViewPagertAdapter
import com.rajuyadav.animexmanga.databinding.ActivityMangaViewpagerDetailsBinding
import com.rajuyadav.animexmanga.utilities.ZoomOutPageTransformer
import com.rajuyadav.animexmanga.viewmodel.MainViewModel
import org.json.JSONArray

class MangaDetailsVIewPagerActivity : BaseActivity() {

    private var chapNum: Int = 0
    private lateinit var chapName: String
    private lateinit var chapLinks: String
    private val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMangaViewpagerDetailsBinding = DataBindingUtil
            .setContentView(this, R.layout.activity_manga_viewpager_details)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        if (intent.hasExtra("chapNum")) {
            chapNum = intent.getIntExtra("chapNum", 0)!!
        }
        if (intent.hasExtra("chapName")) {
            chapName = intent.getStringExtra("chapName")!!
        }
        if (intent.hasExtra("chapLinks")) {
            chapLinks = intent.getStringExtra("chapLinks")!!
        }

        var jsonObject = JSONArray(chapLinks)

        if (viewModel.arraylistDetailsInfo.size > 0) {
            viewModel.arraylistDetailsInfo.clear()
        }

        for (jsonIndex in 0 until jsonObject.length()) {
            viewModel.arraylistDetailsInfo.add(jsonObject.get(jsonIndex).toString())
        }
        //reverse arraylist
        viewModel.arraylistDetailsInfo.reverse()

        viewModel.mangaDetailsViewPagertAdapter =
            MangaDetailsViewPagertAdapter(viewModel, this, viewModel.arraylistDetailsInfo)
        binding.activityMangaViewpagerDetailsRecyclerviewList.adapter =
            viewModel.mangaDetailsViewPagertAdapter
        binding.activityMangaViewpagerDetailsRecyclerviewList.addOnPageChangeListener(
            viewPagerPageChangeListener
        )
        binding.activityMangaViewpagerDetailsRecyclerviewList.setPageTransformer(
            true,
            ZoomOutPageTransformer()
        )
        binding.activityMangaViewpagerDetailsRecyclerviewList.setCurrentItem(
            binding.activityMangaViewpagerDetailsRecyclerviewList.adapter!!.count - 1,
            false
        )
        // get data from intent, if it has
        subscribeDataCallBack()

        if (chapName.isNotEmpty()) {
            binding.activityMangaViewpagerDetailsTextviewAppTitle.text = "$chapName $chapNum"
        }
    }

    private fun subscribeDataCallBack() {
        viewModel.getDetailTrigger()?.observe(this, Observer {
            if (it != null) {
                val intentDetails = Intent(this, ZoomActivity::class.java)
                intentDetails.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                intentDetails.putExtra("chapLinks", it)
                startActivity(intentDetails)
            }
        })
    }

    // viewpager page change listener
    internal var viewPagerPageChangeListener: ViewPager.OnPageChangeListener =
        object : ViewPager.OnPageChangeListener {
            override fun onPageSelected(position: Int) {
                // set gallery title
            }

            override fun onPageScrolled(arg0: Int, arg1: Float, arg2: Int) {
            }

            override fun onPageScrollStateChanged(arg0: Int) {
            }
        }
}