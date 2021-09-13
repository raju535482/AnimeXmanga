package com.rajuyadav.animexmanga.modelclass

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(
    tableName = "ANIMEXMANGA_DB",
    indices = [Index(value = ["manga_id", "manga_chap"], unique = true)]
)
data class Animeinfo(
    @field:PrimaryKey(autoGenerate = true)
    var id: Int,

    var date_n_time: String? = "",

    var manga_chap: Int,

    var links: String? = "",

    var manga_id: String? = "",

    var manga_name: String? = "",
) : Serializable

//
//class Animeinfo : Serializable {
//    private var date_n_time: String? = null
//
//    private var manga_chap: String? = null
//
//    private var links: String? = null
//
//    private var manga_id: String? = null
//
//    private var manga_name: String? = null
//
//    fun getDate_n_time(): String? {
//        return date_n_time
//    }
//
//    fun setDate_n_time(date_n_time: String?) {
//        this.date_n_time = date_n_time
//    }
//
//    fun getManga_chap(): String? {
//        return manga_chap
//    }
//
//    fun setManga_chap(manga_chap: String?) {
//        this.manga_chap = manga_chap
//    }
//
//    fun getLinks(): String? {
//        return links
//    }
//
//    fun setLinks(links: String?) {
//        this.links = links
//    }
//
//    fun getManga_id(): String? {
//        return manga_id
//    }
//
//    fun setManga_id(manga_id: String?) {
//        this.manga_id = manga_id
//    }
//
//    fun getManga_name(): String? {
//        return manga_name
//    }
//
//    fun setManga_name(manga_name: String?) {
//        this.manga_name = manga_name
//    }
//
//    override fun toString(): String {
//        return "ClassPojo [date_n_time = $date_n_time, manga_chap = $manga_chap, links = $links, manga_id = $manga_id, manga_name = $manga_name]"
//    }
//}