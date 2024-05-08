package com.flightsearch.domain.entity

import java.math.BigDecimal

class PricingOption (
        val agents : List<Agent>,
        val price : BigDecimal
)