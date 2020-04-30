package com.almetrix.playgroundtask.apiService

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.ConnectionSpec
import okhttp3.TlsVersion
import android.os.Build
import okhttp3.OkHttpClient
import javax.net.ssl.SSLContext


class InformationBuilder {

    companion object {
        fun invoke(): ApiService? {

            try {
                val retrofit = Retrofit.Builder().baseUrl("http://starlord.hackerearth.com")
                    .addConverterFactory(GsonConverterFactory.create()).build()
                return retrofit.create(ApiService::class.java)
            } catch (e: Exception) {
                println("error message=${e.message}")
            }

            return null

        }

    }
}