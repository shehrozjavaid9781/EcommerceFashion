package com.example.ecommercefashion.app

import android.app.Application
import android.content.Context

class BaseApp : Application() {

    companion object{
        lateinit var sContext : Context
    }

    override fun onCreate() {
        super.onCreate()
        setAppContext(this)
    }

    fun getAppContext() : Context {
        return sContext
    }

    private fun setAppContext(context: Context) {
        sContext = context
    }
}