package com.example.upstoxtask.network

import com.example.upstoxtask.network.service.CryptoService
import com.example.upstoxtask.network.urlfactory.UrlFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitProvider private constructor() {
    var cryptoService: CryptoService

    init {

        val httpLoggingInterceptor by lazy {
            HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            }
        }

        val okHttpClient: OkHttpClient by lazy {
            OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .connectTimeout(1, TimeUnit.MINUTES)
                .writeTimeout(1, TimeUnit.MINUTES)
                .readTimeout(1, TimeUnit.MINUTES)
                .build()
        }

        val retrofit = Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(UrlFactory.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
        cryptoService = retrofit.create(CryptoService::class.java)

    }

    companion object {
        private var retrofitObj: RetrofitProvider? = null
        fun provideRetrofitObject(): RetrofitProvider {
            if (retrofitObj == null) {
                retrofitObj = RetrofitProvider()
            }
            return retrofitObj!!
        }
    }

}