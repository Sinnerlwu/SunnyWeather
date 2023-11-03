package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * Create by: WuLL
 * Create date: 2023/11/1 20:37
 */
class SunnyWeatherApplication : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context : Context
        const val TOKEN = "wZ07huMbLci8odkn"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}