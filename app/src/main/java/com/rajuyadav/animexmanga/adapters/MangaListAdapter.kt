package com.rajuyadav.animexmanga.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import androidx.recyclerview.widget.RecyclerView
import com.rajuyadav.animexmanga.R
import com.rajuyadav.animexmanga.databinding.ItemListBinding
import com.rajuyadav.animexmanga.modelclass.Animeinfo
import com.rajuyadav.animexmanga.viewmodel.MainViewModel

/**
 * Author : Raju Yadav
 * Date : 21 Sept 2020
 * Description : Adapter class for Listing Manga ..
 */
class MangaListAdapter(private val mainViewModel: MainViewModel) :
    RecyclerView.Adapter<MangaListAdapter.HistoryListViewHolder>() {
    lateinit var modelResponseMainMangaList: ArrayList<Animeinfo>
    lateinit var modelResponseMangaList: ArrayList<Animeinfo>
    lateinit var modelResponseFilterMangaList: ArrayList<Animeinfo>

    inner class HistoryListViewHolder(val rawArrivalToListItemBinding: ItemListBinding) :
        RecyclerView.ViewHolder(rawArrivalToListItemBinding.root) {

        fun bind(animeinfo: Animeinfo, imgUrl: Int, int: Int) {
            rawArrivalToListItemBinding.mainmodel = mainViewModel
            rawArrivalToListItemBinding.intPosition = int
            rawArrivalToListItemBinding.imgURL = imgUrl;
            rawArrivalToListItemBinding.modelanimeinfo = animeinfo
        }
    }

    fun setDataToList(modelResponseSearchCitie: ArrayList<Animeinfo>) {
        if (!modelResponseMangaList.isNullOrEmpty() && modelResponseMangaList.size > 0) {
            modelResponseMangaList.clear()
        }
        println(">>> SIZE ${modelResponseSearchCitie.size} & LOCAL SIZE ${modelResponseMangaList.size}")
        for (item in modelResponseSearchCitie) {
            if (!modelResponseMangaList.contains(item)) {
                modelResponseMangaList.add(item)
            }
        }
        Log.i(" List Total ", modelResponseMangaList.size.toString())
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemListBinding.inflate(inflater)
        return HistoryListViewHolder(binding)
    }

    override fun getItemCount(): Int {
        if (!::modelResponseMangaList.isInitialized) {
            modelResponseMangaList = ArrayList()
        }
        if (!::modelResponseMainMangaList.isInitialized) {
            modelResponseMainMangaList = ArrayList()
        }
        return modelResponseMangaList.size
    }

    override fun onBindViewHolder(holder: HistoryListViewHolder, position: Int) {
        holder.bind(
            modelResponseMangaList[position],
            R.drawable.wanoarc,
            position
        )
        holder.rawArrivalToListItemBinding.listItemTxtViewTitle.let {
            it.text = modelResponseMangaList[position].manga_name?.let { it1 -> getInitials(it1) }
        }
    }


    fun getInitials(args: String): String? {
        val stringArray = args.split(" ").toTypedArray()
        val stringInitialsOne = stringArray[0].first()
        val stringInitialsTwo = stringArray[1].first()
        return (stringInitialsOne + "" + stringInitialsTwo)
    }

    fun getFilter(): Filter {
        return object : Filter() {
            private val filterResults = FilterResults()
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                if (!::modelResponseFilterMangaList.isInitialized) {
                    modelResponseFilterMangaList = ArrayList()
                }
                modelResponseFilterMangaList.clear()
                if (constraint.isNullOrBlank()) {
                    modelResponseFilterMangaList.addAll(modelResponseMainMangaList)
                } else {
                    val filterPattern = constraint.toString().toLowerCase().trim { it <= ' ' }
                    for (item in modelResponseMainMangaList.indices) {
                        val stringChapter = modelResponseMainMangaList[item].manga_chap.toString()
                        if (stringChapter.contains(filterPattern)) {
                            modelResponseFilterMangaList.add(modelResponseMainMangaList[item])
                        }
                    }
                }
                return filterResults.also {
                    it.values = modelResponseFilterMangaList
                }
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                setDataToList(modelResponseFilterMangaList)
            }
        }
    }
}