package com.flightsearch.di

import com.flightsearch.data.CloudFlightPricesDataSet
import com.flightsearch.data.skyscanner.SkyscannerAPIService
import com.flightsearch.di.qualifier.ApiKey
import com.flightsearch.domain.repository.FlightSearchRepository
import com.flightsearch.repository.FlightSearchRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides @Singleton
    fun provideFlightSearchRepo(skyscannerAPIService: SkyscannerAPIService, @ApiKey apiKey: String) : FlightSearchRepository
            = FlightSearchRepositoryImpl(listOf(CloudFlightPricesDataSet(skyscannerAPIService, apiKey)))

}