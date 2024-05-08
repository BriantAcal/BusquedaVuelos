package com.flightsearch.domain.entity


class Currency(
    val code: String,
    val symbol : String,
    val thousandSeparator : String,
    val decimalSeparator : String,
    val symbolOnLeft : Boolean,
    val spaceBetweenAmountAndSymbol : Boolean,
    val roundingCoefficient : Int,
    val decimalDigits : Int
)