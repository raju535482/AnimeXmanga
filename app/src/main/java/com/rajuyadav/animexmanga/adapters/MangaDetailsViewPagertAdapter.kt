package com.rajuyadav.animexmanga.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.Target
import com.rajuyadav.animexmanga.databinding.MangaDetailsItemListBinding
import com.rajuyadav.animexmanga.viewmodel.MainViewModel
import java.util.*

/**
 * Author : Raju Yadav
 * Date : 21 Sept 2020
 * Description : Adapter class for Listing Manga ..
 */
class MangaDetailsViewPagertAdapter(
    private val viewModel: MainViewModel,
    private val mContext: Context,
    private val arrayImagelist: ArrayList<String>
) : PagerAdapter() {
    override fun instantiateItem(collection: ViewGroup, position: Int): Any {
        val inflater = LayoutInflater.from(mContext)
        val binding = MangaDetailsItemListBinding.inflate(inflater)

        val newURL: String = arrayImagelist[position].replace(".png", ".jpeg")

        print(">>> IMAGE " + arrayImagelist[position])
        Glide.with(mContext).load(arrayImagelist[position])
            .override(Target.SIZE_ORIGINAL).error(
                Glide.with(mContext).load(newURL).override(Target.SIZE_ORIGINAL).fitCenter()
                    .into(binding.mangaDetailsListItemImgView)
            ).fitCenter().into(binding.mangaDetailsListItemImgView)

        val pos = count - position
        binding.mangaDetailsListItemTxtViewPageNum.text = "page: $pos"
        binding.mangaDetailsListItemImgView.setOnClickListener {
            viewModel.onDetailsItemClick(arrayImagelist[position])
        }
        collection.addView(binding.root)
        return binding.root
    }

    override fun destroyItem(collection: ViewGroup, position: Int, view: Any) {
        collection.removeView(view as View)
    }

    override fun getCount(): Int {
        return arrayImagelist.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun getPageTitle(position: Int): String {
        return arrayImagelist[position]
    }
}