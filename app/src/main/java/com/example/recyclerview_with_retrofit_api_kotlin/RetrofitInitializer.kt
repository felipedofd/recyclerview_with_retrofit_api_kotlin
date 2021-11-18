package com.example.recyclerview_with_retrofit_api_kotlin

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInitializer {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.thedogapi.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun dogApiService() : DogApiService {
        return retrofit.create(DogApiService::class.java)
    }
}