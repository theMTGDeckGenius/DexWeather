package com.sample.michaelwheeler.dexweather;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sample.michaelwheeler.dexweather.objects.Forecast;
import com.sample.michaelwheeler.dexweather.restcalls.DarkSkyService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    SwipeRefreshLayout mSwipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.display_recycler_view);
        mSwipe = findViewById(R.id.display_refresh_swipe);
        mSwipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                recyclerView.setAdapter(null);
                DarkSkyService service = DarkSkyService.retrofit.create(DarkSkyService.class);
                Call<Forecast> call = service.getFiveDayForecast("32.715736", "-117.161087");
                call.enqueue(new Callback<Forecast>() {

                    @Override
                    public void onResponse(Call<Forecast> call, Response<Forecast> response) {
                        if(response.isSuccessful()){
                            ForecastAdapter adapter = new ForecastAdapter(response.body(), MainActivity.this);
                            recyclerView.setAdapter(adapter);
                            mSwipe.setRefreshing(false);
                        }
                    }

                    @Override
                    public void onFailure(Call<Forecast> call, Throwable t) {

                    }
                });
            }
        });

        // Layout
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        DarkSkyService service = DarkSkyService.retrofit.create(DarkSkyService.class);
        Call<Forecast> call = service.getFiveDayForecast("32.715736", "-117.161087");
        call.enqueue(new Callback<Forecast>() {

            @Override
            public void onResponse(Call<Forecast> call, Response<Forecast> response) {
                if(response.isSuccessful()){
                    ForecastAdapter adapter = new ForecastAdapter(response.body(), MainActivity.this);
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<Forecast> call, Throwable t) {

            }
        });

    }


}
