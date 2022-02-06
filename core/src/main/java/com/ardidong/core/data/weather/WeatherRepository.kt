package com.ardidong.core.data.weather

import com.ardidong.core.domain.weather.WeatherData

class WeatherRepository(
    private val weatherDataSource: WeatherDataSource
) {
    suspend fun getWeather(): List<WeatherData>{
       return weatherDataSource.get()
    }

    suspend fun saveWeatherData(weatherList: List<WeatherData>) = weatherDataSource.save(weatherList)
}