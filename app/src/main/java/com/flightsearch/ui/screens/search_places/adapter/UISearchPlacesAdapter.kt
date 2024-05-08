package com.flightsearch.ui.screens.search_places.adapter

import com.flightsearch.R
import com.flightsearch.ui.entity.UIItinerary
import com.flightsearch.ui.entity.UISearchPlace
import com.flightsearch.ui.util.BaseAdapter


class UISearchPlacesAdapter(var items: List<UISearchPlace>, var callback: Callback) : BaseAdapter() {

    override fun getItemForPosition(position: Int): Any {
        return items.get(position)
    }

    override fun getListener(): Any {
        return callback
    }

    override fun getLayoutIdForPosition(position: Int): Int {
        return R.layout.layout_search_place_item
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun add(itineraries : List<UISearchPlace>) {
        val size = items.size
        items = items.plus(itineraries)
        notifyItemRangeInserted(size - 1, itineraries.size)
    }

    public interface Callback {
        fun onItemClick(place: UISearchPlace)
    }
}