package com.flightsearch.domain.repository

import com.flightsearch.domain.entity.FlightPrices
import com.flightsearch.domain.entity.SearchPlace

interface FlightSearchRepository {

    fun getFlightPrices(
            cabinClass : String,
            country : String,
            currency: String,
            locale: String,
            locationSchema : String,
            originPlace : String,
            destinationPlace : String,
            outboundDate : String,
            inboundDate : String,
            adults : Int,
            children : Int,
            infants : Int,
            pageIndex : Int,
            pageSize : Int) : FlightPrices?

    fun searchPlaces(
            country: String,
            currency: String,
            locale: String,
            query: String
    ) : List<SearchPlace>

}