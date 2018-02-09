package com.sample.michaelwheeler.dexweather.restcalls;

import com.sample.michaelwheeler.dexweather.objects.Forecast;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * Created by Michael Wheeler on 2/8/2018.
 */

public interface DarkSkyService {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.darksky.net/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    @Headers("Accept: application/json")
    @GET("forecast/554e4de8d1843a2198c20f70db4c4829/{LAT},{LNG}")
    Call<Forecast> getFiveDayForecast(@Path("LAT") String lat, @Path("LNG") String lng);
}
