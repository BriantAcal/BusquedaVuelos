package com.flightsearch.ui.entity


class UISearchPlace(
        val placeId : String,
        val placeName : String,
        val countryName : String
) {
    fun name() = "$placeName, $countryName"
}