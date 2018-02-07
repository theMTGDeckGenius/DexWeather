package com.sample.michaelwheeler.dexweather.restcalls;

import com.sample.michaelwheeler.dexweather.objects.Forecast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by Michael Wheeler on 2/7/2018.
 */

public class GetCalls {

    private static final String FORCAST_REQUEST_ROOT = "https://api.darksky.net/forecast/";
    private static final String KEY = "554e4de8d1843a2198c20f70db4c4829";
    private static final String SEARCH_POINT = "##LAT##,##LNG##";
    private static final String LAT_PLACE_HOLDER = "##LAT##";
    private static final String LNG_PLACE_HOLDER = "##LNG##";

    public static Forecast getFiveDayForcast(String lat, String lng) throws IOException, JSONException {
        Forecast forcast = new Forecast();
        String compleateURL = FORCAST_REQUEST_ROOT + KEY + "/" + SEARCH_POINT.replace(LAT_PLACE_HOLDER, lat).replace(LNG_PLACE_HOLDER, lng);
        URL urlEndpoint = new URL(compleateURL);

        HttpsURLConnection myConnection = (HttpsURLConnection) urlEndpoint.openConnection();

        //headers
        myConnection.setRequestProperty("Accept", "application/json");

        if (myConnection.getResponseCode() == 200) {
            InputStream inputStream = myConnection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder total = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                total.append(line).append('\n');
            }

            JSONObject jsonObject = new JSONObject(total.toString());
            forcast = Forecast.buildFromJSONObject(jsonObject);
            myConnection.disconnect();
        } else {
            // Error handling code goes here
        }

        return forcast;

    }
}
