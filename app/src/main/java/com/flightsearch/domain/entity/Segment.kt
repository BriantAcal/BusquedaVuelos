package com.flightsearch.domain.entity


class Segment(
        val id : Int,
        val originStation : Place,
        val destinationStation : Place,
        val departureDateTime : String,
        val arrivalDateTime : String,
        val carrier : Carrier,
        val operatingCarrier : Carrier,
        val duration : Int,
        val flightNumber : String,
        val journeyMode : String,
        val directionality: String
)