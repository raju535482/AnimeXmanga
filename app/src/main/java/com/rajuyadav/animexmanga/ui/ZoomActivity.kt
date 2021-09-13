package com.rajuyadav.animexmanga.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.Target
import com.rajuyadav.animexmanga.BaseActivity
import com.rajuyadav.animexmanga.R
import com.rajuyadav.animexmanga.databinding.ActivityMainBinding
import com.rajuyadav.animexmanga.databinding.ActivityZoomBinding
import com.rajuyadav.animexmanga.viewmodel.MainViewModel

class ZoomActivity : BaseActivity() {

    private lateinit var chapLinks: String
    private val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityZoomBinding = DataBindingUtil
            .setContentView(this, R.layout.activity_zoom)
        binding.mainmodel = viewModel
        binding.lifecycleOwner = this

        if (intent.hasExtra("chapLinks")) {
            chapLinks = intent.getStringExtra("chapLinks")!!
        }
        val newURL: String = chapLinks.replace(".png", ".jpeg")
        println(">>> OLD URL $chapLinks")
        println(">>> NEW URL $newURL")
        Glide.with(this).load(chapLinks).override(Target.SIZE_ORIGINAL).error(
            Glide.with(this).load(newURL).override(Target.SIZE_ORIGINAL).fitCenter()
                .into(binding.largeImage)
        ).fitCenter().into(binding.largeImage)
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}