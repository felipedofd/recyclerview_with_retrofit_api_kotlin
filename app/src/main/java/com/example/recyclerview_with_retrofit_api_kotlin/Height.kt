package com.example.example

import com.google.gson.annotations.SerializedName

   
data class Height (

   @SerializedName("imperial") var imperial : String,
   @SerializedName("metric") var metric : String

)