package com.flightsearch.ui.screens.search_places

import com.flightsearch.domain.entity.SearchPlace
import com.flightsearch.domain.interactor.SearchPlacesInteractor
import com.flightsearch.domain.interactor.base.Bus
import com.flightsearch.domain.interactor.base.InteractorExecutor
import com.flightsearch.domain.interactor.event.SearchPlacesEvent
import com.flightsearch.ui.entity.UISearchPlace
import com.flightsearch.ui.entity.mapper.UISearchPlaceMapper
import com.flightsearch.ui.screens.init.InitContract

class SearchPlacesPresenter(val view: SearchPlacesContract.View,
                            override val bus: Bus,
                            val searchPlacesInteractor: SearchPlacesInteractor,
                            val interactorExecutor: InteractorExecutor,
                            val uiSearchPlaceMapper: UISearchPlaceMapper) : SearchPlacesContract.Presenter {

    val places : ArrayList<SearchPlace> = ArrayList()

    override fun onSearchPressed(query: String) {
        searchPlacesInteractor.query = query

        interactorExecutor.execute(searchPlacesInteractor)
    }

    fun onEvent(event: SearchPlacesEvent) {
        places.clear()
        places.addAll(event.places)
        view.populateSearchResults(uiSearchPlaceMapper.transform(places))
    }

    override fun onPlaceSelected(place: UISearchPlace) {
        view.returnPlace(places.first { it.placeId == place.placeId })
    }

}