package com.rajuyadav.animexmanga

import com.rajuyadav.animexmanga.modelclass.ModelResponseForceUpdate
import com.rajuyadav.animexmanga.modelclass.VoMangaResult
import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import java.util.concurrent.TimeUnit

private const val BASE_URL = "http://www.raju1221.dx.am/adminpanel/"

private val retrofit = Retrofit.Builder()
    .client(provideClient())
    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

fun provideClient(): OkHttpClient {
    return OkHttpClient.Builder()
        .addInterceptor(provideHttpLoggingInterceptor())
        .callTimeout(5, TimeUnit.MINUTES)
        .connectTimeout(5, TimeUnit.MINUTES)
        .readTimeout(5, TimeUnit.MINUTES)
        .writeTimeout(5, TimeUnit.MINUTES)
        .build()
}

fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor {
    val httpLoggingInterceptor = HttpLoggingInterceptor()
    httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
    return httpLoggingInterceptor
}

interface APIService {
    @GET("dispanimelist.php")
    fun getMangaList(): Call<VoMangaResult>

    @FormUrlEncoded
    @POST("forceupdate.php")
    fun forceUpdate(@FieldMap mHashMap: Map<String, String?>): Observable<ModelResponseForceUpdate>

}

object MangaAPI {
    val retrofitService: APIService by lazy {
        retrofit.create(APIService::class.java)
    }
}

