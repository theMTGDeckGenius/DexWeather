
package com.sample.michaelwheeler.dexweather.objects;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class Currently implements Parcelable {

    private final String TIME = "time";
    private final String SUMMARY = "summary";
    private final String ICON = "icon";
    private final String NEAREST_STORM_DISTANCE = "nearestStormDistance";
    private final String NEAREST_STORM_BEARING = "nearestStormBearing";
    private final String PRECIP_INTENSITY = "precipIntensity";
    private final String PRECIP_PROBABILITY = "precipProbability";
    private final String TEMPERATURE = "temperature";
    private final String APPARENT_TEMPERATURE = "apparentTemperature";
    private final String DEW_POINT = "dewPoint";
    private final String HUMIDITY = "humidity";
    private final String PRESSURE = "pressure";
    private final String WIND_SPEED = "windSpeed";
    private final String WIND_GUST = "windGust";
    private final String WIND_BEARING = "windBearing";
    private final String CLOUD_COVER = "cloudCover";
    private final String UV_INDEX = "uvIndex";
    private final String VISIBILITY = "visibility";
    private final String OZONE = "ozone";
    private int time;
    private String summary;
    private String icon;
    private int nearestStormDistance;
    private int nearestStormBearing;
    private int precipIntensity;
    private int precipProbability;
    private double temperature;
    private double apparentTemperature;
    private double dewPoint;
    private double humidity;
    private double pressure;
    private double windSpeed;
    private double windGust;
    private int windBearing;
    private int cloudCover;
    private int uvIndex;
    private int visibility;
    private double ozone;
    public final static Parcelable.Creator<Currently> CREATOR = new Creator<Currently>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Currently createFromParcel(Parcel in) {
            return new Currently(in);
        }

        public Currently[] newArray(int size) {
            return (new Currently[size]);
        }

    };

    protected Currently(Parcel in) {
        this.time = ((int) in.readValue((int.class.getClassLoader())));
        this.summary = ((String) in.readValue((String.class.getClassLoader())));
        this.icon = ((String) in.readValue((String.class.getClassLoader())));
        this.nearestStormDistance = ((int) in.readValue((int.class.getClassLoader())));
        this.nearestStormBearing = ((int) in.readValue((int.class.getClassLoader())));
        this.precipIntensity = ((int) in.readValue((int.class.getClassLoader())));
        this.precipProbability = ((int) in.readValue((int.class.getClassLoader())));
        this.temperature = ((double) in.readValue((double.class.getClassLoader())));
        this.apparentTemperature = ((double) in.readValue((double.class.getClassLoader())));
        this.dewPoint = ((double) in.readValue((double.class.getClassLoader())));
        this.humidity = ((double) in.readValue((double.class.getClassLoader())));
        this.pressure = ((double) in.readValue((double.class.getClassLoader())));
        this.windSpeed = ((double) in.readValue((double.class.getClassLoader())));
        this.windGust = ((double) in.readValue((double.class.getClassLoader())));
        this.windBearing = ((int) in.readValue((int.class.getClassLoader())));
        this.cloudCover = ((int) in.readValue((int.class.getClassLoader())));
        this.uvIndex = ((int) in.readValue((int.class.getClassLoader())));
        this.visibility = ((int) in.readValue((int.class.getClassLoader())));
        this.ozone = ((double) in.readValue((double.class.getClassLoader())));
    }

    public Currently() {
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

    public int getNearestStormDistance() {
        return nearestStormDistance;
    }

    public void setNearestStormDistance(int nearestStormDistance) {
        this.nearestStormDistance = nearestStormDistance;
    }

    public int getNearestStormBearing() {
        return nearestStormBearing;
    }

    public void setNearestStormBearing(int nearestStormBearing) {
        this.nearestStormBearing = nearestStormBearing;
    }

    public int getPrecipIntensity() {
        return precipIntensity;
    }

    public void setPrecipIntensity(int precipIntensity) {
        this.precipIntensity = precipIntensity;
    }

    public int getPrecipProbability() {
        return precipProbability;
    }

    public void setPrecipProbability(int precipProbability) {
        this.precipProbability = precipProbability;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getApparentTemperature() {
        return apparentTemperature;
    }

    public void setApparentTemperature(double apparentTemperature) {
        this.apparentTemperature = apparentTemperature;
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

    public int getWindBearing() {
        return windBearing;
    }

    public void setWindBearing(int windBearing) {
        this.windBearing = windBearing;
    }

    public int getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(int cloudCover) {
        this.cloudCover = cloudCover;
    }

    public int getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(int uvIndex) {
        this.uvIndex = uvIndex;
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

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(time);
        dest.writeValue(summary);
        dest.writeValue(icon);
        dest.writeValue(nearestStormDistance);
        dest.writeValue(nearestStormBearing);
        dest.writeValue(precipIntensity);
        dest.writeValue(precipProbability);
        dest.writeValue(temperature);
        dest.writeValue(apparentTemperature);
        dest.writeValue(dewPoint);
        dest.writeValue(humidity);
        dest.writeValue(pressure);
        dest.writeValue(windSpeed);
        dest.writeValue(windGust);
        dest.writeValue(windBearing);
        dest.writeValue(cloudCover);
        dest.writeValue(uvIndex);
        dest.writeValue(visibility);
        dest.writeValue(ozone);
    }

    public int describeContents() {
        return 0;
    }

}
