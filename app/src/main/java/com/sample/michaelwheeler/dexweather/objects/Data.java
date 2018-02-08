
package com.sample.michaelwheeler.dexweather.objects;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Data implements Parcelable {

    private static final String TIME = "time";
    private static final String SUMMARY = "summary";
    private static final String ICON = "icon";
    private static final String SUN_RISE_TIME = "sunriseTime";
    private static final String SUNSET_TIME = "sunsetTime";
    private static final String MOON_PHASE = "moonPhase";
    private static final String PRECIP_INTENSITY = "precipIntensity";
    private static final String PRECIP_INTENSITY_MAX = "precipIntensityMax";
    private static final String PRECIP_INTENSITY_MAX_TIME = "precipIntensityMaxTime";
    private static final String PRECIP_PROBABILITY = "precipProbability";
    private static final String PRECIP_TYPE = "precipType";
    private static final String TEMPERATURE_HIGH = "temperatureHigh";
    private static final String TEMPERATURE_HIGHTIME = "temperatureHighTime";
    private static final String TEMPERATURE_LOW = "temperatureLow";
    private static final String TEMPERATURE_LOWTIME = "temperatureLowTime";
    private static final String APPARENT_TEMPERATURE_HIGH = "apparentTemperatureHigh";
    private static final String APPARENT_TEMPERATURE_HIGH_TIME = "apparentTemperatureHighTime";
    private static final String APPARENT_TEMPERATURE_LOW = "apparentTemperatureLow";
    private static final String APPARENT_TEMPERATURE_LOW_TIME = "apparentTemperatureLowTime";
    private static final String DEW_POINT = "dewPoint";
    private static final String HUMIDITY = "humidity";
    private static final String PRESSURE = "pressure";
    private static final String WIND_SPEED = "windSpeed";
    private static final String WIND_GUST = "windGust";
    private static final String WIND_GUSTTIME = "windGustTime";
    private static final String WIND_BEARING = "windBearing";
    private static final String CLOUD_COVER = "cloudCover";
    private static final String UV_INDEX = "uvIndex";
    private static final String UV_INDEX_TIME = "uvIndexTime";
    private static final String VISIBILITY = "visibility";
    private static final String OZONE = "ozone";
    private static final String TEMPERATURE_MIN = "temperatureMin";
    private static final String TEMPERATURE_MIN_TIME = "temperatureMinTime";
    private static final String TEMPERATURE_MAX = "temperatureMax";
    private static final String TEMPERATURE_MAX_TIME = "temperatureMaxTime";
    private static final String APPARENT_TEMPERATURE_MIN = "apparentTemperatureMin";
    private static final String APPARENT_TEMPERATURE_MIN_TIME = "apparentTemperatureMinTime";
    private static final String APPARENT_TEMPERATURE_MAX = "apparentTemperatureMax";
    private static final String APPARENT_TEMPERATURE_MAX_TIME = "apparentTemperatureMaxTime";
    private double time;
    private String summary;
    private String icon;
    private double sunriseTime;
    private double sunsetTime;
    private double moonPhase;
    private double precipIntensity;
    private double precipIntensityMax;
    private double precipIntensityMaxTime;
    private double precipProbability;
    private String precipType;
    private double temperatureHigh;
    private double temperatureHighTime;
    private double temperatureLow;
    private double temperatureLowTime;
    private double apparentTemperatureHigh;
    private double apparentTemperatureHighTime;
    private double apparentTemperatureLow;
    private double apparentTemperatureLowTime;
    private double dewPoint;
    private double humidity;
    private double pressure;
    private double windSpeed;
    private double windGust;
    private double windGustTime;
    private double windBearing;
    private double cloudCover;
    private double uvIndex;
    private double uvIndexTime;
    private double visibility;
    private double ozone;
    private double temperatureMin;
    private double temperatureMinTime;
    private double temperatureMax;
    private double temperatureMaxTime;
    private double apparentTemperatureMin;
    private double apparentTemperatureMinTime;
    private double apparentTemperatureMax;
    private double apparentTemperatureMaxTime;
    public final static Parcelable.Creator<Data> CREATOR = new Creator<Data>() {

        @SuppressWarnings({"unchecked"})
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        public Data[] newArray(int size) {
            return (new Data[size]);
        }

    };

    protected Data(Parcel in) {
        this.time = ((double) in.readValue((double.class.getClassLoader())));
        this.summary = ((String) in.readValue((String.class.getClassLoader())));
        this.icon = ((String) in.readValue((String.class.getClassLoader())));
        this.sunriseTime = ((double) in.readValue((double.class.getClassLoader())));
        this.sunsetTime = ((double) in.readValue((double.class.getClassLoader())));
        this.moonPhase = ((double) in.readValue((double.class.getClassLoader())));
        this.precipIntensity = ((double) in.readValue((double.class.getClassLoader())));
        this.precipIntensityMax = ((double) in.readValue((double.class.getClassLoader())));
        this.precipIntensityMaxTime = ((double) in.readValue((double.class.getClassLoader())));
        this.precipProbability = ((double) in.readValue((double.class.getClassLoader())));
        this.precipType = ((String) in.readValue((String.class.getClassLoader())));
        this.temperatureHigh = ((double) in.readValue((double.class.getClassLoader())));
        this.temperatureHighTime = ((double) in.readValue((double.class.getClassLoader())));
        this.temperatureLow = ((double) in.readValue((double.class.getClassLoader())));
        this.temperatureLowTime = ((double) in.readValue((double.class.getClassLoader())));
        this.apparentTemperatureHigh = ((double) in.readValue((double.class.getClassLoader())));
        this.apparentTemperatureHighTime = ((double) in.readValue((double.class.getClassLoader())));
        this.apparentTemperatureLow = ((double) in.readValue((double.class.getClassLoader())));
        this.apparentTemperatureLowTime = ((double) in.readValue((double.class.getClassLoader())));
        this.dewPoint = ((double) in.readValue((double.class.getClassLoader())));
        this.humidity = ((double) in.readValue((double.class.getClassLoader())));
        this.pressure = ((double) in.readValue((double.class.getClassLoader())));
        this.windSpeed = ((double) in.readValue((double.class.getClassLoader())));
        this.windGust = ((double) in.readValue((double.class.getClassLoader())));
        this.windGustTime = ((double) in.readValue((double.class.getClassLoader())));
        this.windBearing = ((double) in.readValue((double.class.getClassLoader())));
        this.cloudCover = ((double) in.readValue((double.class.getClassLoader())));
        this.uvIndex = ((double) in.readValue((double.class.getClassLoader())));
        this.uvIndexTime = ((double) in.readValue((double.class.getClassLoader())));
        this.visibility = ((double) in.readValue((double.class.getClassLoader())));
        this.ozone = ((double) in.readValue((double.class.getClassLoader())));
        this.temperatureMin = ((double) in.readValue((double.class.getClassLoader())));
        this.temperatureMinTime = ((double) in.readValue((double.class.getClassLoader())));
        this.temperatureMax = ((double) in.readValue((double.class.getClassLoader())));
        this.temperatureMaxTime = ((double) in.readValue((double.class.getClassLoader())));
        this.apparentTemperatureMin = ((double) in.readValue((double.class.getClassLoader())));
        this.apparentTemperatureMinTime = ((double) in.readValue((double.class.getClassLoader())));
        this.apparentTemperatureMax = ((double) in.readValue((double.class.getClassLoader())));
        this.apparentTemperatureMaxTime = ((double) in.readValue((double.class.getClassLoader())));
    }

    public Data() {
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public double getSunriseTime() {
        return sunriseTime;
    }

    public void setSunriseTime(double sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    public double getSunsetTime() {
        return sunsetTime;
    }

    public void setSunsetTime(double sunsetTime) {
        this.sunsetTime = sunsetTime;
    }

    public double getMoonPhase() {
        return moonPhase;
    }

    public void setMoonPhase(double moonPhase) {
        this.moonPhase = moonPhase;
    }

    public double getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(double precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public double getPrecipIntensityMax() {
        return precipIntensityMax;
    }

    public void setPrecipIntensityMax(double precipIntensityMax) {
        this.precipIntensityMax = precipIntensityMax;
    }

    public double getPrecipIntensityMaxTime() {
        return precipIntensityMaxTime;
    }

    public void setPrecipIntensityMaxTime(double precipIntensityMaxTime) {
        this.precipIntensityMaxTime = precipIntensityMaxTime;
    }

    public double getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(double precipProbability) {
        this.precipProbability = precipProbability;
    }

    public String getPrecipType() {
        return precipType;
    }

    public void setPrecipType(String precipType) {
        this.precipType = precipType;
    }

    public double getTemperatureHigh() {
        return temperatureHigh;
    }

    public void setTemperatureHigh(double temperatureHigh) {
        this.temperatureHigh = temperatureHigh;
    }

    public double getTemperatureHighTime() {
        return temperatureHighTime;
    }

    public void setTemperatureHighTime(double temperatureHighTime) {
        this.temperatureHighTime = temperatureHighTime;
    }

    public double getTemperatureLow() {
        return temperatureLow;
    }

    public void setTemperatureLow(double temperatureLow) {
        this.temperatureLow = temperatureLow;
    }

    public double getTemperatureLowTime() {
        return temperatureLowTime;
    }

    public void setTemperatureLowTime(double temperatureLowTime) {
        this.temperatureLowTime = temperatureLowTime;
    }

    public double getApparentTemperatureHigh() {
        return apparentTemperatureHigh;
    }

    public void setApparentTemperatureHigh(double apparentTemperatureHigh) {
        this.apparentTemperatureHigh = apparentTemperatureHigh;
    }

    public double getApparentTemperatureHighTime() {
        return apparentTemperatureHighTime;
    }

    public void setApparentTemperatureHighTime(double apparentTemperatureHighTime) {
        this.apparentTemperatureHighTime = apparentTemperatureHighTime;
    }

    public double getApparentTemperatureLow() {
        return apparentTemperatureLow;
    }

    public void setApparentTemperatureLow(double apparentTemperatureLow) {
        this.apparentTemperatureLow = apparentTemperatureLow;
    }

    public double getApparentTemperatureLowTime() {
        return apparentTemperatureLowTime;
    }

    public void setApparentTemperatureLowTime(double apparentTemperatureLowTime) {
        this.apparentTemperatureLowTime = apparentTemperatureLowTime;
    }

    public double getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(double dewPoint) {
        this.dewPoint = dewPoint;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getWindGust() {
        return windGust;
    }

    public void setWindGust(double windGust) {
        this.windGust = windGust;
    }

    public double getWindGustTime() {
        return windGustTime;
    }

    public void setWindGustTime(double windGustTime) {
        this.windGustTime = windGustTime;
    }

    public double getWindBearing() {
        return windBearing;
    }

    public void setWindBearing(double windBearing) {
        this.windBearing = windBearing;
    }

    public double getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(double cloudCover) {
        this.cloudCover = cloudCover;
    }

    public double getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(double uvIndex) {
        this.uvIndex = uvIndex;
    }

    public double getUvIndexTime() {
        return uvIndexTime;
    }

    public void setUvIndexTime(double uvIndexTime) {
        this.uvIndexTime = uvIndexTime;
    }

    public double getVisibility() {
        return visibility;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    public double getOzone() {
        return ozone;
    }

    public void setOzone(double ozone) {
        this.ozone = ozone;
    }

    public double getTemperatureMin() {
        return temperatureMin;
    }

    public void setTemperatureMin(double temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    public double getTemperatureMinTime() {
        return temperatureMinTime;
    }

    public void setTemperatureMinTime(double temperatureMinTime) {
        this.temperatureMinTime = temperatureMinTime;
    }

    public double getTemperatureMax() {
        return temperatureMax;
    }

    public void setTemperatureMax(double temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    public double getTemperatureMaxTime() {
        return temperatureMaxTime;
    }

    public void setTemperatureMaxTime(double temperatureMaxTime) {
        this.temperatureMaxTime = temperatureMaxTime;
    }

    public double getApparentTemperatureMin() {
        return apparentTemperatureMin;
    }

    public void setApparentTemperatureMin(double apparentTemperatureMin) {
        this.apparentTemperatureMin = apparentTemperatureMin;
    }

    public double getApparentTemperatureMinTime() {
        return apparentTemperatureMinTime;
    }

    public void setApparentTemperatureMinTime(double apparentTemperatureMinTime) {
        this.apparentTemperatureMinTime = apparentTemperatureMinTime;
    }

    public double getApparentTemperatureMax() {
        return apparentTemperatureMax;
    }

    public void setApparentTemperatureMax(double apparentTemperatureMax) {
        this.apparentTemperatureMax = apparentTemperatureMax;
    }

    public double getApparentTemperatureMaxTime() {
        return apparentTemperatureMaxTime;
    }

    public void setApparentTemperatureMaxTime(double apparentTemperatureMaxTime) {
        this.apparentTemperatureMaxTime = apparentTemperatureMaxTime;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(time);
        dest.writeValue(summary);
        dest.writeValue(icon);
        dest.writeValue(sunriseTime);
        dest.writeValue(sunsetTime);
        dest.writeValue(moonPhase);
        dest.writeValue(precipIntensity);
        dest.writeValue(precipIntensityMax);
        dest.writeValue(precipIntensityMaxTime);
        dest.writeValue(precipProbability);
        dest.writeValue(precipType);
        dest.writeValue(temperatureHigh);
        dest.writeValue(temperatureHighTime);
        dest.writeValue(temperatureLow);
        dest.writeValue(temperatureLowTime);
        dest.writeValue(apparentTemperatureHigh);
        dest.writeValue(apparentTemperatureHighTime);
        dest.writeValue(apparentTemperatureLow);
        dest.writeValue(apparentTemperatureLowTime);
        dest.writeValue(dewPoint);
        dest.writeValue(humidity);
        dest.writeValue(pressure);
        dest.writeValue(windSpeed);
        dest.writeValue(windGust);
        dest.writeValue(windGustTime);
        dest.writeValue(windBearing);
        dest.writeValue(cloudCover);
        dest.writeValue(uvIndex);
        dest.writeValue(uvIndexTime);
        dest.writeValue(visibility);
        dest.writeValue(ozone);
        dest.writeValue(temperatureMin);
        dest.writeValue(temperatureMinTime);
        dest.writeValue(temperatureMax);
        dest.writeValue(temperatureMaxTime);
        dest.writeValue(apparentTemperatureMin);
        dest.writeValue(apparentTemperatureMinTime);
        dest.writeValue(apparentTemperatureMax);
        dest.writeValue(apparentTemperatureMaxTime);
    }

    public static List<Data> buildFromJSONObject(JSONArray jsonArray) {
        List<Data> returnData = new ArrayList<>();
        if (jsonArray != null){
            for (int x = 0; x < jsonArray.length(); x++){
                JSONObject jsonObject = jsonArray.optJSONObject(x);
                Data data = new Data();
                data.setTime(jsonObject.optInt(SUMMARY));
                data.setSummary(jsonObject.optString(SUMMARY));
                data.setIcon(jsonObject.optString(SUMMARY));
                data.setSunriseTime(jsonObject.optInt(SUMMARY));
                data.setSunsetTime(jsonObject.optInt(SUMMARY));
                data.setMoonPhase(jsonObject.optDouble(SUMMARY));
                data.setPrecipIntensity(jsonObject.optDouble(SUMMARY));
                data.setPrecipIntensityMax(jsonObject.optDouble(SUMMARY));
                data.setPrecipIntensityMaxTime(jsonObject.optInt(SUMMARY));
                data.setPrecipProbability(jsonObject.optDouble(SUMMARY));
                data.setPrecipType(jsonObject.optString(SUMMARY));
                data.setTemperatureHigh(jsonObject.optDouble(SUMMARY));
                data.setTemperatureHighTime(jsonObject.optInt(SUMMARY));
                data.setTemperatureLow(jsonObject.optDouble(SUMMARY));
                data.setTemperatureLowTime(jsonObject.optInt(SUMMARY));
                data.setApparentTemperatureHigh(jsonObject.optDouble(SUMMARY));
                data.setApparentTemperatureHighTime(jsonObject.optInt(SUMMARY));
                data.setApparentTemperatureLow(jsonObject.optDouble(SUMMARY));
                data.setApparentTemperatureLowTime(jsonObject.optInt(SUMMARY));
                data.setDewPoint(jsonObject.optDouble(SUMMARY));
                data.setHumidity(jsonObject.optDouble(SUMMARY));
                data.setPressure(jsonObject.optDouble(SUMMARY));
                data.setWindSpeed(jsonObject.optDouble(SUMMARY));
                data.setWindGust(jsonObject.optDouble(SUMMARY));
                data.setWindGustTime(jsonObject.optInt(SUMMARY));
                data.setWindBearing(jsonObject.optInt(SUMMARY));
                data.setCloudCover(jsonObject.optDouble(SUMMARY));
                data.setUvIndex(jsonObject.optInt(SUMMARY));
                data.setUvIndexTime(jsonObject.optInt(SUMMARY));
                data.setVisibility(jsonObject.optInt(SUMMARY));
                data.setOzone(jsonObject.optDouble(SUMMARY));
                data.setTemperatureMin(jsonObject.optDouble(SUMMARY));
                data.setTemperatureMinTime(jsonObject.optInt(SUMMARY));
                data.setTemperatureMax(jsonObject.optDouble(SUMMARY));
                data.setTemperatureMaxTime(jsonObject.optInt(SUMMARY));
                data.setApparentTemperatureMin(jsonObject.optDouble(SUMMARY));
                data.setApparentTemperatureMinTime(jsonObject.optInt(SUMMARY));
                data.setApparentTemperatureMax(jsonObject.optDouble(SUMMARY));
                data.setApparentTemperatureMaxTime(jsonObject.optInt(SUMMARY));
                returnData.add(data);
            }

        }
        return returnData;
    }

    public int describeContents() {
        return 0;
    }

}
