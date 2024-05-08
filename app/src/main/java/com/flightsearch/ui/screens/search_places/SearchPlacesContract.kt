package com.luismunyoz.flightsearch.ui.screens.search_places

import com.flightsearch.domain.entity.SearchPlace
import com.flightsearch.ui.entity.UISearchPlace
import com.flightsearch.ui.util.BaseContract


interface SearchPlacesContract {

    interface View : BaseContract.BaseView<Presenter> {

        fun populateSearchResults(results : List<UISearchPlace>)

        fun returnPlace(place : SearchPlace)

    }

    interface Presenter : BaseContract.BasePresenter {

        fun onSearchPressed(query : String)

        fun onPlaceSelected(place : UISearchPlace)

    }

}