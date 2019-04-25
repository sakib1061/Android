package com.SFILab.weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
    @GET("v2.0/forecast/daily?")
    Call<WeatherResponse> getCurrentWeatherData( @Query("units") String units,@Query("days") String days,@Query("lat") String lat, @Query("lon") String lon, @Query("key") String key);
}
