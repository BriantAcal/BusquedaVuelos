package com.flightsearch.ui.util

import com.flightsearch.domain.interactor.base.Bus

interface BaseContract {

    public interface BasePresenter {
        val bus: Bus

        fun onResume(){
            bus.register(this)
        }

        fun onPause(){
            bus.unregister(this)
        }
    }

    public interface BaseView<in T: BasePresenter>{

    }
}