package com.ardidong.core.data.weather

import com.ardidong.core.domain.weather.WeatherData

interface WeatherDataSource {
    suspend fun get(): List<WeatherData>

    suspend fun save(weatherList: List<WeatherData>)
}