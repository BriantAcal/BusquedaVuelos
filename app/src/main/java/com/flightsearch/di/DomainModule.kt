package com.flightsearch.di

import com.flightsearch.domain.interactor.GetFlightPricesInteractor
import com.flightsearch.domain.interactor.SearchPlacesInteractor
import com.flightsearch.domain.repository.FlightSearchRepository
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun provideFlightPricesInteractor(flightSearchRepository: FlightSearchRepository)
            = GetFlightPricesInteractor(flightSearchRepository)

    @Provides
    fun provideSearchPlacesInteractor(flightSearchRepository: FlightSearchRepository)
            = SearchPlacesInteractor(flightSearchRepository)
}