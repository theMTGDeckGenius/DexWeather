package com.sample.michaelwheeler.dexweather;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sample.michaelwheeler.dexweather.objects.Forecast;
import com.sample.michaelwheeler.dexweather.restcalls.DarkSkyService;
import com.sample.michaelwheeler.dexweather.restcalls.GetCalls;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    SwipeRefreshLayout mSwipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.display_recycler_view);
        mSwipe = findViewById(R.id.display_refresh_swipe);

        // Layout
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        DarkSkyService service = new DarkSkyService();
        service.start();

    }


}
