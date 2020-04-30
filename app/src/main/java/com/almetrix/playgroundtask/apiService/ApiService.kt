package com.almetrix.playgroundtask.apiService


import com.almetrix.playgroundtask.Pojo.Information
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("/kickstarter")
    fun getKickStarter(): Call<MutableList<Information>>

}