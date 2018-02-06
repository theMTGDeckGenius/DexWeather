
package com.sample.michaelwheeler.dexweather.objects;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class Datum implements Parcelable {

    private final String TIME = "time";
    private final String SUMMARY = "summary";
    private final String ICON = "icon";
    private final String SUN_RISE_TIME = "sunriseTime";
    private final String SUNSET_TIME = "sunsetTime";
    private final String MOON_PHASE = "moonPhase";
    private final String PRECIP_INTENSITY = "precipIntensity";
    private final String PRECIP_INTENSITY_MAX = "precipIntensityMax";
    private final String PRECIP_INTENSITY_MAX_TIME = "precipIntensityMaxTime";
    private final String PRECIP_PROBABILITY = "precipProbability";
    private final String PRECIP_TYPE = "precipType";
    private final String TEMPERATURE_HIGH = "temperatureHigh";
    private final String TEMPERATURE_HIGHTIME = "temperatureHighTime";
    private final String TEMPERATURE_LOW = "temperatureLow";
    private final String TEMPERATURE_LOWTIME = "temperatureLowTime";
    private final String APPARENT_TEMPERATURE_HIGH = "apparentTemperatureHigh";
    private final String APPARENT_TEMPERATURE_HIGH_TIME = "apparentTemperatureHighTime";
    private final String APPARENT_TEMPERATURE_LOW = "apparentTemperatureLow";
    private final String APPARENT_TEMPERATURE_LOW_TIME = "apparentTemperatureLowTime";
    private final String DEW_POINT = "dewPoint";
    private final String HUMIDITY = "humidity";
    private final String PRESSURE = "pressure";
    private final String WIND_SPEED = "windSpeed";
    private final String WIND_GUST = "windGust";
    private final String WIND_GUSTTIME = "windGustTime";
    private final String WIND_BEARING = "windBearing";
    private final String CLOUD_COVER = "cloudCover";
    private final String UV_INDEX = "uvIndex";
    private final String UV_INDEX_TIME = "uvIndexTime";
    private final String VISIBILITY = "visibility";
    private final String OZONE = "ozone";
    private final String TEMPERATURE_MIN = "temperatureMin";
    private final String TEMPERATURE_MIN_TIME = "temperatureMinTime";
    private final String TEMPERATURE_MAX = "temperatureMax";
    private final String TEMPERATURE_MAX_TIME = "temperatureMaxTime";
    private final String APPARENT_TEMPERATURE_MIN = "apparentTemperatureMin";
    private final String APPARENT_TEMPERATURE_MIN_TIME = "apparentTemperatureMinTime";
    private final String APPARENT_TEMPERATURE_MAX = "apparentTemperatureMax";
    private final String APPARENT_TEMPERATURE_MAX_TIME = "apparentTemperatureMaxTime";
    private int time;
    private String summary;
    private String icon;
    private int sunriseTime;
    private int sunsetTime;
    private double moonPhase;
    private double precipIntensity;
    private double precipIntensityMax;
    private int precipIntensityMaxTime;
    private double precipProbability;
    private String precipType;
    private double temperatureHigh;
    private int temperatureHighTime;
    private double temperatureLow;
    private int temperatureLowTime;
    private double apparentTemperatureHigh;
    private int apparentTemperatureHighTime;
    private double apparentTemperatureLow;
    private int apparentTemperatureLowTime;
    private double dewPoint;
    private double humidity;
    private double pressure;
    private double windSpeed;
    private double windGust;
    private int windGustTime;
    private int windBearing;
    private double cloudCover;
    private int uvIndex;
    private int uvIndexTime;
    private int visibility;
    private double ozone;
    private double temperatureMin;
    private int temperatureMinTime;
    private double temperatureMax;
    private int temperatureMaxTime;
    private double apparentTemperatureMin;
    private int apparentTemperatureMinTime;
    private double apparentTemperatureMax;
    private int apparentTemperatureMaxTime;
    public final static Parcelable.Creator<Datum> CREATOR = new Creator<Datum>() {

        @SuppressWarnings({"unchecked"})
        public Datum createFromParcel(Parcel in) {
            return new Datum(in);
        }

        public Datum[] newArray(int size) {
            return (new Datum[size]);
        }

    };

    protected Datum(Parcel in) {
        this.time = ((int) in.readValue((int.class.getClassLoader())));
        this.summary = ((String) in.readValue((String.class.getClassLoader())));
        this.icon = ((String) in.readValue((String.class.getClassLoader())));
        this.sunriseTime = ((int) in.readValue((int.class.getClassLoader())));
        this.sunsetTime = ((int) in.readValue((int.class.getClassLoader())));
        this.moonPhase = ((double) in.readValue((double.class.getClassLoader())));
        this.precipIntensity = ((double) in.readValue((double.class.getClassLoader())));
        this.precipIntensityMax = ((double) in.readValue((double.class.getClassLoader())));
        this.precipIntensityMaxTime = ((int) in.readValue((int.class.getClassLoader())));
        this.precipProbability = ((double) in.readValue((double.class.getClassLoader())));
        this.precipType = ((String) in.readValue((String.class.getClassLoader())));
        this.temperatureHigh = ((double) in.readValue((double.class.getClassLoader())));
        this.temperatureHighTime = ((int) in.readValue((int.class.getClassLoader())));
        this.temperatureLow = ((double) in.readValue((double.class.getClassLoader())));
        this.temperatureLowTime = ((int) in.readValue((int.class.getClassLoader())));
        this.apparentTemperatureHigh = ((double) in.readValue((double.class.getClassLoader())));
        this.apparentTemperatureHighTime = ((int) in.readValue((int.class.getClassLoader())));
        this.apparentTemperatureLow = ((double) in.readValue((double.class.getClassLoader())));
        this.apparentTemperatureLowTime = ((int) in.readValue((int.class.getClassLoader())));
        this.dewPoint = ((double) in.readValue((double.class.getClassLoader())));
        this.humidity = ((double) in.readValue((double.class.getClassLoader())));
        this.pressure = ((double) in.readValue((double.class.getClassLoader())));
        this.windSpeed = ((double) in.readValue((double.class.getClassLoader())));
        this.windGust = ((double) in.readValue((double.class.getClassLoader())));
        this.windGustTime = ((int) in.readValue((int.class.getClassLoader())));
        this.windBearing = ((int) in.readValue((int.class.getClassLoader())));
        this.cloudCover = ((double) in.readValue((double.class.getClassLoader())));
        this.uvIndex = ((int) in.readValue((int.class.getClassLoader())));
        this.uvIndexTime = ((int) in.readValue((int.class.getClassLoader())));
        this.visibility = ((int) in.readValue((int.class.getClassLoader())));
        this.ozone = ((double) in.readValue((double.class.getClassLoader())));
        this.temperatureMin = ((double) in.readValue((double.class.getClassLoader())));
        this.temperatureMinTime = ((int) in.readValue((int.class.getClassLoader())));
        this.temperatureMax = ((double) in.readValue((double.class.getClassLoader())));
        this.temperatureMaxTime = ((int) in.readValue((int.class.getClassLoader())));
        this.apparentTemperatureMin = ((double) in.readValue((double.class.getClassLoader())));
        this.apparentTemperatureMinTime = ((int) in.readValue((int.class.getClassLoader())));
        this.apparentTemperatureMax = ((double) in.readValue((double.class.getClassLoader())));
        this.apparentTemperatureMaxTime = ((int) in.readValue((int.class.getClassLoader())));
    }

    public Datum() {
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
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

    public int getSunriseTime() {
        return sunriseTime;
    }

    public void setSunriseTime(int sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    public int getSunsetTime() {
        return sunsetTime;
    }

    public void setSunsetTime(int sunsetTime) {
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

    public int getPrecipIntensityMaxTime() {
        return precipIntensityMaxTime;
    }

    public void setPrecipIntensityMaxTime(int precipIntensityMaxTime) {
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

    public int getTemperatureHighTime() {
        return temperatureHighTime;
    }

    public void setTemperatureHighTime(int temperatureHighTime) {
        this.temperatureHighTime = temperatureHighTime;
    }

    public double getTemperatureLow() {
        return temperatureLow;
    }

    public void setTemperatureLow(double temperatureLow) {
        this.temperatureLow = temperatureLow;
    }

    public int getTemperatureLowTime() {
        return temperatureLowTime;
    }

    public void setTemperatureLowTime(int temperatureLowTime) {
        this.temperatureLowTime = temperatureLowTime;
    }

    public double getApparentTemperatureHigh() {
        return apparentTemperatureHigh;
    }

    public void setApparentTemperatureHigh(double apparentTemperatureHigh) {
        this.apparentTemperatureHigh = apparentTemperatureHigh;
    }

    public int getApparentTemperatureHighTime() {
        return apparentTemperatureHighTime;
    }

    public void setApparentTemperatureHighTime(int apparentTemperatureHighTime) {
        this.apparentTemperatureHighTime = apparentTemperatureHighTime;
    }

    public double getApparentTemperatureLow() {
        return apparentTemperatureLow;
    }

    public void setApparentTemperatureLow(double apparentTemperatureLow) {
        this.apparentTemperatureLow = apparentTemperatureLow;
    }

    public int getApparentTemperatureLowTime() {
        return apparentTemperatureLowTime;
    }

    public void setApparentTemperatureLowTime(int apparentTemperatureLowTime) {
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

    public int getWindGustTime() {
        return windGustTime;
    }

    public void setWindGustTime(int windGustTime) {
        this.windGustTime = windGustTime;
    }

    public int getWindBearing() {
        return windBearing;
    }

    public void setWindBearing(int windBearing) {
        this.windBearing = windBearing;
    }

    public double getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(double cloudCover) {
        this.cloudCover = cloudCover;
    }

    public int getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(int uvIndex) {
        this.uvIndex = uvIndex;
    }

    public int getUvIndexTime() {
        return uvIndexTime;
    }

    public void setUvIndexTime(int uvIndexTime) {
        this.uvIndexTime = uvIndexTime;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
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

    public int getTemperatureMinTime() {
        return temperatureMinTime;
    }

    public void setTemperatureMinTime(int temperatureMinTime) {
        this.temperatureMinTime = temperatureMinTime;
    }

    public double getTemperatureMax() {
        return temperatureMax;
    }

    public void setTemperatureMax(double temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    public int getTemperatureMaxTime() {
        return temperatureMaxTime;
    }

    public void setTemperatureMaxTime(int temperatureMaxTime) {
        this.temperatureMaxTime = temperatureMaxTime;
    }

    public double getApparentTemperatureMin() {
        return apparentTemperatureMin;
    }

    public void setApparentTemperatureMin(double apparentTemperatureMin) {
        this.apparentTemperatureMin = apparentTemperatureMin;
    }

    public int getApparentTemperatureMinTime() {
        return apparentTemperatureMinTime;
    }

    public void setApparentTemperatureMinTime(int apparentTemperatureMinTime) {
        this.apparentTemperatureMinTime = apparentTemperatureMinTime;
    }

    public double getApparentTemperatureMax() {
        return apparentTemperatureMax;
    }

    public void setApparentTemperatureMax(double apparentTemperatureMax) {
        this.apparentTemperatureMax = apparentTemperatureMax;
    }

    public int getApparentTemperatureMaxTime() {
        return apparentTemperatureMaxTime;
    }

    public void setApparentTemperatureMaxTime(int apparentTemperatureMaxTime) {
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

    public int describeContents() {
        return 0;
    }

}
