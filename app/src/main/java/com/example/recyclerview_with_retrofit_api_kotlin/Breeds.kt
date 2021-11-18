package com.example.example

import com.google.gson.annotations.SerializedName

   
data class Breeds (

   @SerializedName("weight") var weight : Weight,
   @SerializedName("height") var height : Height,
   @SerializedName("id") var id : Int,
   @SerializedName("name") var name : String,
   @SerializedName("bred_for") var bredFor : String,
   @SerializedName("breed_group") var breedGroup : String,
   @SerializedName("life_span") var lifeSpan : String,
   @SerializedName("temperament") var temperament : String,
   @SerializedName("reference_image_id") var referenceImageId : String

)