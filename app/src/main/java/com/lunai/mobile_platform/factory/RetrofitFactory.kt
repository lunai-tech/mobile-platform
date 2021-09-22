package com.lunai.mobile_platform.factory

import com.lunai.mobile_platform.services.RetrofitService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {

    private val URI: String = ""

    val retrofitFactory = Retrofit.Builder()
        .baseUrl(URI)
        .addConverterFactory(GsonConverterFactory.create()).build()

    fun retrofitService() : RetrofitService {
        return retrofitFactory.create(RetrofitService::class.java)
    }
}