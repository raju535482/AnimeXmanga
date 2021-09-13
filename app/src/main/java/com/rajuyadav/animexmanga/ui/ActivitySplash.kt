package com.rajuyadav.animexmanga.ui

import android.graphics.Color
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.view.WindowManager
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.rajuyadav.animexmanga.BaseActivity
import com.rajuyadav.animexmanga.R
import com.rajuyadav.animexmanga.databinding.ActivitySplashBinding
import com.rajuyadav.animexmanga.viewmodel.MainViewModel

class ActivitySplash : BaseActivity() {

    private val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivitySplashBinding = DataBindingUtil
            .setContentView(this, R.layout.activity_splash)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        val uri: Uri =
            Uri.parse("android.resource://" + packageName + "/" + R.raw.video_manga)
        binding.activitySplashVideoview.setBackgroundColor(Color.WHITE); // Your color.
        binding.activitySplashVideoview.setVideoURI(uri)
        binding.activitySplashVideoview.requestFocus()
        binding.activitySplashVideoview.setOnCompletionListener {
            viewModel.transitTOMainActivity(
                this@ActivitySplash
            )
        }
        binding.activitySplashVideoview.setOnPreparedListener(MediaPlayer.OnPreparedListener {
            binding.activitySplashVideoview.setZOrderOnTop(false)
            binding.activitySplashVideoview.setBackgroundColor(Color.TRANSPARENT);
            binding.activitySplashVideoview.start()
        })
    }
}