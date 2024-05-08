package com.flightsearch.domain.entity

class FlightPrices (
        val sessionKey : String,
        val query : Query,
        val status : String,
        val itineraries : List<Itinerary>,
        val currencies : List<Currency>
)