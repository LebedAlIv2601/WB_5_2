package com.example.wb_5_2

import android.app.Application
import android.content.Context
import com.example.wb_5_2.di.AppComponent
import com.example.wb_5_2.di.DaggerAppComponent

class SuperHeroesApp : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}

val Context.appComponent: AppComponent
    get() = when(this){
        is SuperHeroesApp -> appComponent
        else -> applicationContext.appComponent
    }