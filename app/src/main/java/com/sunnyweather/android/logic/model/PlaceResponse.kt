package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * Create by: WuLL
 * Create date: 2023/11/3 0:15
 */
data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(
    var name: String,
    val location: Location,
    @SerializedName("formatted_address") val address: String
)

data class Location(val lng: String, val lat: String)