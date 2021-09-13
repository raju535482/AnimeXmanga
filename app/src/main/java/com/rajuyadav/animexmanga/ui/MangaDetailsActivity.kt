package com.rajuyadav.animexmanga.ui

import android.app.Application
import android.content.Intent
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.rajuyadav.animexmanga.BaseActivity
import com.rajuyadav.animexmanga.R
import com.rajuyadav.animexmanga.databinding.ActivityMangaDetailsBinding
import com.rajuyadav.animexmanga.modelclass.Animeinfo
import com.rajuyadav.animexmanga.viewmodel.MainViewModel
import org.json.JSONArray
import org.json.JSONObject

class MangaDetailsActivity : BaseActivity() {

    private lateinit var chapNum: String
    private lateinit var chapName: String
    private lateinit var chapLinks: String
    private val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMangaDetailsBinding = DataBindingUtil
            .setContentView(this, R.layout.activity_manga_details)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        val categoryLinearLayoutManager = LinearLayoutManager(this)
        categoryLinearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
        categoryLinearLayoutManager.reverseLayout = true
        binding.activityMangaDetailsRecyclerviewList.layoutManager = categoryLinearLayoutManager
        binding.activityMangaDetailsRecyclerviewList.adapter = viewModel.mangaDetailslistAdapter

        // get data from intent, if it has

        if (intent.hasExtra("chapNum")) {
            chapNum = intent.getStringExtra("chapNum")!!
        }
        if (intent.hasExtra("chapName")) {
            chapName = intent.getStringExtra("chapName")!!
        }
        if (intent.hasExtra("chapLinks")) {
            chapLinks = intent.getStringExtra("chapLinks")!!
        }
        var jsonObject = JSONArray(chapLinks)

        for (jsonIndex in 0 until jsonObject.length()) {
            viewModel.arraylistDetailsInfo.add(jsonObject.get(jsonIndex).toString())
        }
        viewModel.mangaDetailslistAdapter?.setDataToList(viewModel.arraylistDetailsInfo)
        subscribeDataCallBack()
    }

    private fun subscribeDataCallBack() {
        viewModel.getDetailTrigger()?.observe(this, Observer {
            if (it != null) {
                println(">>> SENDING DATA")
                val intentDetails = Intent(this, ZoomActivity::class.java)
                intentDetails.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                intentDetails.putExtra("chapLinks", it)
                startActivity(intentDetails)
            }
        })
    }
}