package com.lunai.mobile_platform.services

import com.lunai.mobile_platform.models.Expert
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitService {

    @GET("")
    fun getExpert(@Path("id") id : String) : Call<Expert>

}