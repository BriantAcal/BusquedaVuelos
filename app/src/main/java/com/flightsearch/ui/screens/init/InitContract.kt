package com.flightsearch.ui.screens.init

import com.flightsearch.domain.entity.SearchPlace
import com.flightsearch.ui.entity.UIFlightPrices
import com.flightsearch.ui.entity.UIItinerary
import com.flightsearch.ui.entity.UISearchPlace
import com.flightsearch.ui.util.BaseContract
import java.util.*

interface InitContract {

    interface View : BaseContract.BaseView<Presenter> {

        fun populateOriginPlace(place: UISearchPlace?)

        fun populateDestinationPlace(place: UISearchPlace?)

        fun openSearchPlace(isOrigin : Boolean)

        fun openCalendar(isOrigin: Boolean)

        fun enableSearchButton(enable: Boolean)

        fun populateDepartDate(dateString : String)

        fun populateReturnDate(dateString: String)

        fun showErrorDates()

        fun goToSearch(origin: SearchPlace, destination: SearchPlace, departDate : Calendar, returnDate : Calendar)

    }

    interface Presenter : BaseContract.BasePresenter {

        fun onOriginPressed()

        fun onDestinationPressed()

        fun onSwitchPlacesPressed()

        fun onOriginPlaceSelected(place : SearchPlace)

        fun onDestinationPlaceSelected(place : SearchPlace)

        fun onDepartDatePressed()

        fun onReturnDatePressed()

        fun onDepartDateSelected(calendar: Calendar)

        fun onReturnDateSelected(calendar: Calendar)

        fun onSearchPressed()

    }

}