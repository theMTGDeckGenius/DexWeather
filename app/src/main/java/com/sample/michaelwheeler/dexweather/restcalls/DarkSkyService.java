package com.sample.michaelwheeler.dexweather.restcalls;

import com.sample.michaelwheeler.dexweather.objects.Forecast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Michael Wheeler on 2/8/2018.
 */

public class DarkSkyService implements Callback<Forecast> {


    public void start() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.darksky.net/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GetCalls getCalls = retrofit.create(GetCalls.class);
        Call<Forecast> call = getCalls.getFiveDayForecast("32.715736", "-117.161087");
        call.enqueue(this);

    }
    @Override
    public void onResponse(Call<Forecast> call, Response<Forecast> response) {
        if (response.isSuccessful()) {
            Forecast changesList = response.body();
        } else {
            System.out.println(response.errorBody());
        }
    }

    @Override
    public void onFailure(Call<Forecast> call, Throwable t) {
        t.printStackTrace();
    }
}
