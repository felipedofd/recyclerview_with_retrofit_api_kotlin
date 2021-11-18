package com.example.recyclerview_with_retrofit_api_kotlin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.example.DogApiResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DogViewModel : ViewModel() {
    val dogs = MutableLiveData<List<DogApiResponse>>()
    private val DogApiService = RetrofitInitializer.dogApiService()

    fun buscarDogs(size: String) {
        val result = DogApiService.getDogs(
            size , "jpg", "json", "true",
            "RANDOM", "0", "100"
        ).enqueue(object : Callback<List<DogApiResponse>> {

            override fun onResponse(
                call: Call<List<DogApiResponse>>,
                response: Response<List<DogApiResponse>>
            ) {
                dogs.postValue(response.body())
            }

            override fun onFailure(call: Call<List<DogApiResponse>>, t: Throwable) {
                print(t.toString())
            }

        })

    }
}