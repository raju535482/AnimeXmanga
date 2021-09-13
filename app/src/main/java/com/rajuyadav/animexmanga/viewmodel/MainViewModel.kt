package com.rajuyadav.animexmanga.viewmodel

import android.app.Application
import android.content.Intent
import android.content.pm.PackageManager.NameNotFoundException
import android.os.Handler
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.rajuyadav.animexmanga.APIService
import com.rajuyadav.animexmanga.App
import com.rajuyadav.animexmanga.adapters.MangaDetailsListAdapter
import com.rajuyadav.animexmanga.adapters.MangaDetailsViewPagertAdapter
import com.rajuyadav.animexmanga.adapters.MangaListAdapter
import com.rajuyadav.animexmanga.database.MangaRoomDatabase
import com.rajuyadav.animexmanga.databinding.ActivityMainBinding
import com.rajuyadav.animexmanga.modelclass.Animeinfo
import com.rajuyadav.animexmanga.modelclass.ModelResponseForceUpdate
import com.rajuyadav.animexmanga.modelclass.VoMangaResult
import com.rajuyadav.animexmanga.ui.ActivitySplash
import com.rajuyadav.animexmanga.ui.MangaListActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.HttpException
import retrofit2.Response
import java.net.SocketTimeoutException
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList
import kotlin.collections.set


class MainViewModel(application: Application) : AndroidViewModel(application) {

    @Inject
    lateinit var applicationScope: CoroutineScope

    @Inject
    lateinit var apiService: APIService

    @Inject
    lateinit var mangaRoomDatabase: MangaRoomDatabase

    var mangalistAdapter: MangaListAdapter? = null
    var mangaDetailslistAdapter: MangaDetailsListAdapter? = null
    var mangaDetailsViewPagertAdapter: MangaDetailsViewPagertAdapter? = null
    private val mutablePostList: MutableLiveData<ArrayList<Animeinfo>> = MutableLiveData()
    private val mutableSinglePostData: MutableLiveData<Animeinfo> = MutableLiveData()
    private val mutableSingleImage: MutableLiveData<String> = MutableLiveData()
    lateinit var arraylistAnimeInfo: java.util.ArrayList<Animeinfo>
    lateinit var arraylistDetailsInfo: java.util.ArrayList<String>
    private var _userData = MutableLiveData<VoMangaResult?>()
    private lateinit var modelResponseFlightSearchItems: Animeinfo
    var modelResponseForceUpdate = MutableLiveData<ModelResponseForceUpdate>(null)
    private lateinit var subscription: Disposable

    init {
        inject()
        _userData.value = null
        mangalistAdapter = MangaListAdapter(this)
        mangaDetailslistAdapter = MangaDetailsListAdapter(this)

        if (!::arraylistAnimeInfo.isInitialized) {
            arraylistAnimeInfo = ArrayList()
        }
        if (!::arraylistDetailsInfo.isInitialized) {
            arraylistDetailsInfo = ArrayList()
        }
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        App.appComponent.inject(this)
    }

    //item click from recyclerview
    fun onItemClick(mmodelResponseFlightSearchItems: Animeinfo) {
        modelResponseFlightSearchItems = mmodelResponseFlightSearchItems
        mutableSinglePostData.postValue(mmodelResponseFlightSearchItems)
    }

    //item click from recyclerview
    fun onDetailsItemClick(mmodelResponseFlightSearchItems: String) {
        mutableSingleImage.postValue(mmodelResponseFlightSearchItems)
    }

    fun checkForceUpdate(mangaListActivity: MangaListActivity) {
        val mHashMap: HashMap<String, String?> = HashMap<String, String?>()
        try {
            val versionName: String = mangaListActivity.applicationContext.packageManager
                .getPackageInfo(
                    mangaListActivity.applicationContext.packageName,
                    0
                ).versionName
            mHashMap["app_version"] = versionName
            subscription = apiService.forceUpdate(mHashMap)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe {}
                .doOnTerminate {}
                .subscribe({
                    if (it != null && it.success == "1") {
                        modelResponseForceUpdate.value = it
                    }
                }, {
                    when (it) {
                        is HttpException -> {

                        }
                        is SocketTimeoutException -> {

                        }
                        else -> {

                        }
                    }
                })
        } catch (e: NameNotFoundException) {
            e.printStackTrace()
        }
    }

    fun getMangaAPI(mangaListActivity: MangaListActivity, binding: ActivityMainBinding) {
        val api = apiService.getMangaList()

        api.enqueue(object : Callback<VoMangaResult> {
            override fun onFailure(call: Call<VoMangaResult>, t: Throwable) {
                if (binding.swipeRefreshView.isRefreshing) {
                    binding.swipeRefreshView.isRefreshing = false
                }
                Log.d("TAG_TAG", "Failed :" + t.message)
            }

            override fun onResponse(call: Call<VoMangaResult>, response: Response<VoMangaResult>) {
                if (binding.swipeRefreshView.isRefreshing) {
                    binding.swipeRefreshView.isRefreshing = false
                }
                _userData.value = response.body()
                _userData.postValue(response.body())
                if (arraylistAnimeInfo.size > 0) {
                    arraylistAnimeInfo.clear()
                }
                for (item in _userData.value?.animeinfo!!.indices) {
                    arraylistAnimeInfo.add(_userData.value!!.animeinfo[item]!!)
                }
                mutablePostList.postValue(arraylistAnimeInfo)
                applicationScope.launch {
                    mangaRoomDatabase.MangaDao()?.let { it1 ->
                        for (item in arraylistAnimeInfo) {
                            it1.insert(item)
                        }
                    }
                }
            }
        })
    }

    fun getMangaDataFromDB(mangaListActivity: MangaListActivity): ArrayList<Animeinfo> {
        return mangaRoomDatabase.MangaDao()
            .getMangaList() as ArrayList<Animeinfo>
    }

    fun getMangaData(): LiveData<ArrayList<Animeinfo>>? {
        return mutablePostList
    }

    fun getListTrigger(): LiveData<Animeinfo>? {
        return mutableSinglePostData
    }

    fun getDetailTrigger(): LiveData<String>? {
        return mutableSingleImage
    }

    fun filterMangaList(activityMainEdittextSearchManga: EditText) {
        activityMainEdittextSearchManga.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                mangalistAdapter!!.getFilter().filter(charSequence.toString())
            }

            override fun afterTextChanged(editable: Editable) {}
        })
    }

    fun transitTOMainActivity(activitySplash: ActivitySplash) {
        Handler().postDelayed({
            val intent = Intent(activitySplash, MangaListActivity::class.java)
            activitySplash.startActivity(intent)
            activitySplash.finishAffinity()
        }, 1000) // 3000 is the delayed time in milliseconds.
    }
}