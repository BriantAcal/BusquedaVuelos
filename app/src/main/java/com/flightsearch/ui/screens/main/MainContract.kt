package com.flightsearch.ui.screens.main

import com.flightsearch.domain.entity.SearchPlace
import com.flightsearch.ui.entity.UIFlightPrices
import com.flightsearch.ui.entity.UIItinerary
import com.flightsearch.ui.util.BaseContract
import java.util.*

interface MainContract {

    interface View : BaseContract.BaseView<Presenter> {

        fun populateFlightPrices(flightPrices : UIFlightPrices)

        fun onMoreItinerariesLoaded(itineraries : List<UIItinerary>)

        fun setTitleAndSubtitle(title : String, subtitle: String)

        fun getOriginPlace() : SearchPlace

        fun getDestinationPlace() : SearchPlace

        fun getDepartureDate() : Calendar

        fun getReturnDate() : Calendar

        fun showLoader(show : Boolean)

        fun showNoResults(show : Boolean)

    }

    interface Presenter : BaseContract.BasePresenter {

        fun onLoadMore()
    }
}