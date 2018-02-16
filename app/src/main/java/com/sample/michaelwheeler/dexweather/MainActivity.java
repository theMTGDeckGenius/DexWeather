package com.sample.michaelwheeler.dexweather;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.sample.michaelwheeler.dexweather.objects.Currently;
import com.sample.michaelwheeler.dexweather.objects.Data;
import com.sample.michaelwheeler.dexweather.objects.Forecast;
import com.sample.michaelwheeler.dexweather.restcalls.DarkSkyService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    SwipeRefreshLayout mSwipe;

    TextView mCurrentlyIcon;
    TextView mCurrentlyTemp;
    TextView mCurrentlyDesc;
    TextView mCurrentlyCount;
    private PendingIntent pendingIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCurrentlyIcon = findViewById(R.id.currently_condition);
        mCurrentlyTemp = findViewById(R.id.currently_temperature);
        mCurrentlyDesc = findViewById(R.id.currently_description);
        mCurrentlyCount = findViewById(R.id.currently_count);
        recyclerView = findViewById(R.id.display_recycler_view);
        mSwipe = findViewById(R.id.display_refresh_swipe);
        mSwipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                recyclerView.setAdapter(null);
                DarkSkyService service = DarkSkyService.retrofit.create(DarkSkyService.class);
                Call<Forecast> call = service.getFiveDayForecast(Utils.KEY, Utils.LAT, Utils.LNG);
                call.enqueue(new Callback<Forecast>() {

                    @Override
                    public void onResponse(@NonNull Call<Forecast> call, @NonNull Response<Forecast> response) {
                        if (response.isSuccessful()) {
                            ForecastAdapter adapter = new ForecastAdapter(response.body(), MainActivity.this, mForecastHandler);
                            recyclerView.setAdapter(adapter);
                            mSwipe.setRefreshing(false);
                        }
                    }

                    @Override
                    public void onFailure(@NonNull Call<Forecast> call, @NonNull Throwable t) {

                    }
                });
            }
        });

        // Layout
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

    }

    @Override
    protected void onResume() {
        super.onResume();
        //Once this starts it will not stop running on the phone until the device is rebooted
        Intent alarmIntent = new Intent(MainActivity.this, DarkSkyReceiver.class);
        alarmIntent.setAction("com.sample.michaelwheeler.CURRENTLY_UPDATE");
        pendingIntent = PendingIntent.getBroadcast(MainActivity.this, 0, alarmIntent, 0);
        AlarmManager manager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        manager.cancel(pendingIntent);
        //Every 5 min
        int interval = 1000 * 60 * 5;
        manager.setRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(), interval, pendingIntent);
        updateCurrently();
    }

    public void updateCurrently() {
        DarkSkyService service = DarkSkyService.retrofit.create(DarkSkyService.class);
        Call<Forecast> call = service.getFiveDayForecast(Utils.KEY, Utils.LAT, Utils.LNG);
        call.enqueue(new Callback<Forecast>() {

            @Override
            public void onResponse(@NonNull Call<Forecast> call, @NonNull Response<Forecast> response) {
                if (response.isSuccessful()) {
                    ForecastAdapter adapter = new ForecastAdapter(response.body(), MainActivity.this, mForecastHandler);
                    recyclerView.setAdapter(adapter);
                    mCurrentlyIcon.setText(Utils.getForecastIcon(response.body().getCurrently().getIcon()));
                    mCurrentlyTemp.setText(getResources().getString(R.string.temp).replace(Utils.TEMP_PLACE_HOLDER, response.body().getCurrently().getApparentTemperature()));
                    mCurrentlyDesc.setText(response.body().getCurrently().getSummary());
                    updateCallCount();
                }
            }

            @Override
            public void onFailure(@NonNull Call<Forecast> call, @NonNull Throwable t) {

            }
        });
    }

    void updateCallCount() {
        int count = PreferenceManager.getDefaultSharedPreferences(MainActivity.this).getInt("call_count", 0);
        count++;
        PreferenceManager.getDefaultSharedPreferences(MainActivity.this).edit().putInt("call_count", count).apply();
        mCurrentlyCount.setText(String.valueOf(count));
    }

    ForecastHandler mForecastHandler = new ForecastHandler() {
        @Override
        public void onclick(Data dayData) {
            Intent intent = new Intent(MainActivity.this, FloatingActivity.class);
            intent.putExtra("display", dayData.getSummary());
            startActivity(intent);
        }
    };

    @Override
    protected void onNewIntent(Intent intent) {
        Currently currently = intent.getExtras().getParcelable("currently");
        mCurrentlyIcon.setText(Utils.getForecastIcon(currently.getIcon()));
        mCurrentlyTemp.setText(getResources().getString(R.string.temp).replace(Utils.TEMP_PLACE_HOLDER, currently.getApparentTemperature()));
        mCurrentlyDesc.setText(currently.getSummary());
        updateCallCount();
    }
}
