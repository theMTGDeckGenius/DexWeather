
package com.sample.michaelwheeler.dexweather.objects;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONObject;

public class Forecast implements Parcelable {

    private static final String LATITUDE = "latitude";
    private static final String LONGITUDE = "longitude";
    private static final String TIMEZONE =  "timezone";
    private static final String CURRENTLY = "currently";
    private static final String MINUTELY = "minutely";
    private static final String HOURLY = "hourly";
    private static final String DAILY = "daily";
    private static final String FLAGS = "flags";
    private static final String OFFSET = "offset";
    private double latitude;
    private double longitude;
    private String timezone;
    private Currently currently;
    private Minutely minutely;
    private Hourly hourly;
    private Daily daily;
    private Flags flags;
    private double offset;
    public final static Parcelable.Creator<Forecast> CREATOR = new Creator<Forecast>() {

        @SuppressWarnings({"unchecked"})
        public Forecast createFromParcel(Parcel in) {
            return new Forecast(in);
        }

        public Forecast[] newArray(int size) {
            return (new Forecast[size]);
        }

    };

    protected Forecast(Parcel in) {
        this.latitude = ((double) in.readValue((double.class.getClassLoader())));
        this.longitude = ((double) in.readValue((double.class.getClassLoader())));
        this.timezone = ((String) in.readValue((String.class.getClassLoader())));
        this.currently = ((Currently) in.readValue((Currently.class.getClassLoader())));
        this.minutely = ((Minutely) in.readValue((Minutely.class.getClassLoader())));
        this.hourly = ((Hourly) in.readValue((Hourly.class.getClassLoader())));
        this.daily = ((Daily) in.readValue((Daily.class.getClassLoader())));
        this.flags = ((Flags) in.readValue((Flags.class.getClassLoader())));
        this.offset = ((double) in.readValue((double.class.getClassLoader())));
    }

    public Forecast() {
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Currently getCurrently() {
        return currently;
    }

    public void setCurrently(Currently currently) {
        this.currently = currently;
    }

    public Minutely getMinutely() {
        return minutely;
    }

    public void setMinutely(Minutely minutely) {
        this.minutely = minutely;
    }

    public Hourly getHourly() {
        return hourly;
    }

    public void setHourly(Hourly hourly) {
        this.hourly = hourly;
    }

    public Daily getDaily() {
        return daily;
    }

    public void setDaily(Daily daily) {
        this.daily = daily;
    }

    public Flags getFlags() {
        return flags;
    }

    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    public double getOffset() {
        return offset;
    }

    public void setOffset(double offset) {
        this.offset = offset;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(latitude);
        dest.writeValue(longitude);
        dest.writeValue(timezone);
        dest.writeValue(currently);
        dest.writeValue(minutely);
        dest.writeValue(hourly);
        dest.writeValue(daily);
        dest.writeValue(flags);
        dest.writeValue(offset);
    }

    public static Forecast buildFromJSONObject(JSONObject jsonObject) {
        Forecast forecast = new Forecast();
        if (jsonObject != null){
            forecast.setLatitude(jsonObject.optDouble(LATITUDE));
            forecast.setLongitude(jsonObject.optDouble(LONGITUDE));
            forecast.setTimezone(jsonObject.optString(TIMEZONE));
            forecast.setCurrently(Currently.buildFromJSONObject(jsonObject.optJSONObject(CURRENTLY)));
            forecast.setMinutely(Minutely.buildFromJSONObject(jsonObject.optJSONObject(MINUTELY)));
            forecast.setHourly(Hourly.buildFromJSONObject(jsonObject.optJSONObject(HOURLY)));
            forecast.setDaily(Daily.buildFromJSONObject(jsonObject.optJSONObject(DAILY)));
            forecast.setFlags(Flags.buildFromJSONObject(jsonObject.optJSONObject(FLAGS)));
            forecast.setOffset(jsonObject.optInt(OFFSET));
        }
        return forecast;
    }

    public int describeContents() {
        return 0;
    }

}
