package com.rajuyadav.animexmanga.adapters

import android.text.Layout
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.target.Target

object ImageUrlBindingAdapterNEW {
    @JvmStatic
    @BindingAdapter("android:img2")
    fun setImageUrl(view: ImageView, url: String) {
        Glide.with(view.context).load(url).fitCenter().into(view)
    }
}