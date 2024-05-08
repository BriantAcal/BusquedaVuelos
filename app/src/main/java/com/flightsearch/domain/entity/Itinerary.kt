package com.flightsearch.domain.entity


class Itinerary(
        val outboundLeg : Leg,
        val inboundLeg : Leg,
        val pricingOptions : List<PricingOption>
)