package com.flightsearch.ui.entity

import android.content.Context
import com.flightsearch.R

class UIItinerary(
    val outboundLeg : UILeg,
    val inboundLeg : UILeg,
    val price : String,
    val agent : String
) {
    fun agentVerbose(context : Context) : String {
        return context.getString(R.string.via_agent).format(agent)
    }
}