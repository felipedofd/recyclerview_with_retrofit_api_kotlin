package com.example.example

import com.google.gson.annotations.SerializedName

   
data class Weight (

   @SerializedName("imperial") var imperial : String,
   @SerializedName("metric") var metric : String

)