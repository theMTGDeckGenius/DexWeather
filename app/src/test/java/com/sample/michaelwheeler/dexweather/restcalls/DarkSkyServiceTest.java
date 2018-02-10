package com.sample.michaelwheeler.dexweather.restcalls;

import com.sample.michaelwheeler.dexweather.TestVariables;
import com.sample.michaelwheeler.dexweather.objects.Forecast;

import org.junit.Test;
import org.junit.runner.RunWith;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import retrofit2.Call;
import retrofit2.Retrofit;

import static org.junit.Assert.*;

/**
 * Created by Michael Wheeler on 2/10/2018.
 */
public class DarkSkyServiceTest {
    @Test
    public void getFiveDayForecast() throws Exception {
        MockWebServer mockWebServer = new MockWebServer();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(mockWebServer.url("").toString())
                //TODO Add your Retrofit parameters here
                .build();

        mockWebServer.enqueue(new MockResponse().setBody(TestVariables.jsonResponse));

        DarkSkyService service = retrofit.create(DarkSkyService.class);
        Call<Forecast> call = service.getFiveDayForecast("","");
        assertTrue(call.execute() != null);
        mockWebServer.shutdown();
    }
}