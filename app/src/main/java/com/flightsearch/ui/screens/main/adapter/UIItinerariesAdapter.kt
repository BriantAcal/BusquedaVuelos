package com.flightsearch.ui.screens.main.adapter

import com.flightsearch.R
import com.flightsearch.ui.entity.UIItinerary
import com.flightsearch.ui.util.BaseAdapter

class UIItinerariesAdapter(var items: List<UIItinerary>, var callback: Callback) : BaseAdapter() {

    override fun getItemForPosition(position: Int): Any {
        return items.get(position)
    }

    override fun getListener(): Any {
        return callback
    }

    override fun getLayoutIdForPosition(position: Int): Int {
        return R.layout.layout_itinerary_item
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun add(itineraries : List<UIItinerary>) {
        val size = items.size
        items = items.plus(itineraries)
        //notifyDataSetChanged()
        notifyItemRangeInserted(size - 1, itineraries.size)
    }

    public interface Callback {

    }
}