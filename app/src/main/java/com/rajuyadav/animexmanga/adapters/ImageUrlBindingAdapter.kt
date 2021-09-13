package com.rajuyadav.animexmanga.adapters

import android.text.Layout
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.target.Target

object ImageUrlBindingAdapter {
    @JvmStatic
    @BindingAdapter("android:img")
    fun setImageUrl(view: ImageView, url: String) {
        val newURL: String = url.replace(".png", ".jpeg")
        Glide.with(view.context).load(url).override(Target.SIZE_ORIGINAL).error(
            Glide.with(view.context).load(newURL).override(Target.SIZE_ORIGINAL).fitCenter()
                .into(view)
        ).fitCenter().into(view)
    }
}