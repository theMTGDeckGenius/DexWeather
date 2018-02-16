package com.sample.michaelwheeler.dexweather;

/**
 * Created by Michael Wheeler on 2/15/2018.
 */

class Utils {
    //KEY from tech challenge document
//    private final String KEY = "c63d1a62f0f56add8fff7deb5f217aac";
    //my original key
    static final String KEY = "554e4de8d1843a2198c20f70db4c4829";

    //San Diego LAT/LNG
//    private final String LAT = "32.715736";
//    private final String LNG = "-117.161087";

    //Alcatraz LAT/LNG
    static final String LAT = "37.8267";
    static final String LNG = "-122.4233";

    static final String TEMP_PLACE_HOLDER = "##TEMP##";
    static final String TIME_PLACE_HOLDER = "##TIME##";

    static String getForecastIcon(String icon) {
        String value = new String(Character.toChars(0x1F321));
        switch (icon) {
            case "clear-day":
                value = new String(Character.toChars(0x2600));
                break;
            case "clear-night":
                value = new String(Character.toChars(0x1F319));
                break;
            case "rain":
                value = new String(Character.toChars(0x1F327));
                break;
            case "snow":
                value = new String(Character.toChars(0x1F327));
                break;
            case "sleet":
                value = new String(Character.toChars(0x2744));
                break;
            case "wind":
                value = new String(Character.toChars(0x1F32C));
                break;
            case "fog":
                value = new String(Character.toChars(0x1F32B));
                break;
            case "cloudy":
                value = new String(Character.toChars(0x1F325));
                break;
            case "partly-cloudy-day":
                value = new String(Character.toChars(0x1F324));
                break;
            case "partly-cloudy-night":
                value = new String(Character.toChars(0x1F324));
                break;
        }
        return value;
    }
}
