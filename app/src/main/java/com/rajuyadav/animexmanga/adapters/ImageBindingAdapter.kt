package com.rajuyadav.animexmanga.adapters

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.Target

object ImageBindingAdapter {
    @JvmStatic
    @BindingAdapter("android:src2")
    fun setImageUrl(view: ImageView, url: Int) {
        Glide.with(view.context).load(url).override(Target.SIZE_ORIGINAL).into(view)
    }
}