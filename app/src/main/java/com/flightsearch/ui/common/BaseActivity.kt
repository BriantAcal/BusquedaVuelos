package com.flightsearch.ui.common

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.luismunyoz.flightsearch.App
import com.luismunyoz.flightsearch.di.ApplicationComponent

abstract class BaseActivity : AppCompatActivity() {

    @Suppress("UNCHECKED_CAST")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectDependencies(App.graph)
    }

    abstract fun injectDependencies(applicationComponent: ApplicationComponent)
}