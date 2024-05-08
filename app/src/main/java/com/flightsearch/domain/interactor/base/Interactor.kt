
package com.flightsearch.domain.interactor.base

interface Interactor {

    operator fun invoke(): Event
}