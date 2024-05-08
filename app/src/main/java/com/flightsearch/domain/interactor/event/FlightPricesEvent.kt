package com.flightsearch.domain.interactor.event

import com.flightsearch.domain.entity.FlightPrices
import com.flightsearch.domain.interactor.base.Event

data class FlightPricesEvent(val flightPrices : FlightPrices?) : Event