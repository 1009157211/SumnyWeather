package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication :Application(){
    companion object {
        @SuppressLint("StaticFoeldLeak")
        lateinit var context: Context
        const val TOKEN = "xuCMy0gWOIOfGDRd"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}