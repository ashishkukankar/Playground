package com.almetrix.playgroundtask.repository

import androidx.lifecycle.MutableLiveData
import com.almetrix.playgroundtask.Pojo.Information
import com.almetrix.playgroundtask.apiService.ApiService
import com.almetrix.playgroundtask.apiService.InformationBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {

var informationList = MutableLiveData<MutableList<Information>>()

   fun getValue():MutableLiveData<MutableList<Information>>{
       return informationList
   }

    fun getKistarterData(){
        val apiService = InformationBuilder.invoke()
        apiService?.getKickStarter()?.enqueue(object : Callback<MutableList<Information>> {
            override fun onFailure(
                call: Call<MutableList<Information>>,
                t: Throwable) {
                println("Error=$t")
            }

            override fun onResponse(
                call: Call<MutableList<Information>>,
                response: Response<MutableList<Information>>
            ) {
                if(response.isSuccessful) {
                    informationList.value = response.body()
                }else{
                    print("ErrorMessage=${response.message()}")
                }
            }
        })

    }
}