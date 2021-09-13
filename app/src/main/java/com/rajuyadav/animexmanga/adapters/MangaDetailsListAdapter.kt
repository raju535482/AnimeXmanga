package com.rajuyadav.animexmanga.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rajuyadav.animexmanga.viewmodel.MainViewModel
import com.rajuyadav.animexmanga.databinding.MangaDetailsItemListBinding

/**
 * Author : Raju Yadav
 * Date : 21 Sept 2020
 * Description : Adapter class for Listing Manga ..
 */
class MangaDetailsListAdapter(private val mainViewModel: MainViewModel) :
    RecyclerView.Adapter<MangaDetailsListAdapter.HistoryListViewHolder>() {
    lateinit var modelResponseSearchCities: ArrayList<String>

    inner class HistoryListViewHolder(private val rawArrivalToListItemBinding: MangaDetailsItemListBinding) :
        RecyclerView.ViewHolder(rawArrivalToListItemBinding.root) {

        fun bind(animeinfo: String) {
            rawArrivalToListItemBinding.mainmodel = mainViewModel
            rawArrivalToListItemBinding.strArrayListImage = animeinfo
        }
    }

    fun setDataToList(modelResponseSearchCitie: ArrayList<String>) {
        if (!::modelResponseSearchCities.isInitialized) {
            modelResponseSearchCities = ArrayList()
        }
        for (item in modelResponseSearchCitie) {
            if (!modelResponseSearchCities.contains(item)) {
                modelResponseSearchCities.add(item)
                Log.i(" Added Item", item)
            } else {
                Log.i(" Duplicate Item", item)
            }
        }
        Log.i(" List Total ", modelResponseSearchCities.size.toString())
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MangaDetailsItemListBinding.inflate(inflater)
        return HistoryListViewHolder(binding)
    }

    override fun getItemCount(): Int {
        if (!::modelResponseSearchCities.isInitialized) {
            modelResponseSearchCities = ArrayList()
        }
        return modelResponseSearchCities.size
    }

    override fun onBindViewHolder(holder: HistoryListViewHolder, position: Int) {
        holder.bind(modelResponseSearchCities[position])
    }
}