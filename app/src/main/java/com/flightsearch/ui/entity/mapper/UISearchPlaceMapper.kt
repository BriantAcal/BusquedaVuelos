package com.flightsearch.ui.entity.mapper

import com.flightsearch.domain.entity.SearchPlace
import com.flightsearch.ui.entity.UISearchPlace


class UISearchPlaceMapper {

    fun transform(searchPlaces : List<SearchPlace>) : List<UISearchPlace> = searchPlaces.map { transform(it) }

    fun transform(searchPlace : SearchPlace) : UISearchPlace = UISearchPlace(searchPlace.placeId, searchPlace.placeName, searchPlace.countryName)
}