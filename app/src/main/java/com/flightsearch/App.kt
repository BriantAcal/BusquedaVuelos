package com.flightsearch

import android.app.Application
import com.flightsearch.di.ApplicationComponent
import com.flightsearch.di.ApplicationModule
import com.flightsearch.di.DaggerApplicationComponent


class App : Application() {

    companion object {
        lateinit var graph: ApplicationComponent
    }

    override fun onCreate() {
        super.onCreate()
        initializeDagger()
    }

    fun initializeDagger() {
        graph = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }

}