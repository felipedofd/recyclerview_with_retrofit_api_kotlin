package com.example.example

import com.google.gson.annotations.SerializedName

   
data class DogApiResponse (

   @SerializedName("breeds") var breeds : List<Breeds>,
   @SerializedName("id") var id : String,
   @SerializedName("url") var url : String,
   @SerializedName("width") var width : Int,
   @SerializedName("height") var height : Int

)