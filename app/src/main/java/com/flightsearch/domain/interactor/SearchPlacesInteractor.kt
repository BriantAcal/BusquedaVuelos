package com.flightsearch.domain.interactor

import com.flightsearch.domain.interactor.base.Event
import com.flightsearch.domain.interactor.base.Interactor
import com.flightsearch.domain.interactor.event.FlightPricesEvent
import com.flightsearch.domain.interactor.event.SearchPlacesEvent
import com.flightsearch.domain.repository.FlightSearchRepository

class SearchPlacesInteractor(val flightSearchRepository: FlightSearchRepository) : Interactor {

    var country : String = "UK"
    var currency : String = "GBP"
    var locale : String = "en-GB"
    var query : String? = null

    override fun invoke(): Event {
        val query = this.query ?: throw IllegalStateException("Query can't be null")

        val places = flightSearchRepository.searchPlaces(country, currency, locale, query)
        return SearchPlacesEvent(places)
    }

}