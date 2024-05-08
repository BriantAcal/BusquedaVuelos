package com.flightsearch.domain.entity

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class SearchPlace(
        val placeId : String,
        val placeName : String,
        val countryId : String,
        val regionId : String,
        val cityId : String,
        val countryName : String
) : Serializable