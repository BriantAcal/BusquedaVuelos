package com.flightsearch.domain.interactor.event

import com.flightsearch.domain.entity.SearchPlace
import com.flightsearch.domain.interactor.base.Event

data class SearchPlacesEvent(val places : List<SearchPlace>) : Event