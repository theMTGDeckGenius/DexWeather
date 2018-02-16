package com.sample.michaelwheeler.dexweather;

import com.sample.michaelwheeler.dexweather.objects.Data;

/**
 * Created by Michael Wheeler on 2/9/2018.
 *
 * Used to deliver data to an activity
 */

public interface ForecastHandler {
    void onclick(Data dayData);
}
