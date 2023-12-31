package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * Create by: WuLL
 * Create date: 2023/11/3 17:01
 */
data class RealtimeResponse(val status: String, val result: Result) {

    data class Result(val realtime: Realtime)

    data class Realtime(
        val temperature: Float,
        val skycon: String,
        @SerializedName("air_quality") val airQuality: AirQuality
    )

    data class AirQuality(val aqi: Aqi)

    data class Aqi(val chn: Float)

}