package com.example.recyclerview_with_retrofit_api_kotlin

import com.example.example.DogApiResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface DogApiService {
    @GET("V1/images/search")
    fun getDogs(
        @Query("size") size : String,
        @Query("mime_types") mime_types : String,
        @Query("format") format : String,
        @Query("has_breeds") has_breeds : String,
        @Query("order") order : String,
        @Query("page") page : String,
        @Query("limit") limit : String
    ): Call<List<DogApiResponse>>
}