
package com.sample.michaelwheeler.dexweather.objects;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.Map;

public class Forcast implements Parcelable {

    private final String LATITUDE = "latitude";
    private final String LONGITUDE = "longitude";
    private final String TIMEZONE =  "timezone";
    private final String CURRENTLY = "currently";
    private final String MINUTELY = "minutely";
    private final String HOURLY = "hourly";
    private final String DAILY = "daily";
    private final String FLAGS = "flags";
    private final String OFFSET = "offset";
    private double latitude;
    private double longitude;
    private String timezone;
    private Currently currently;
    private Minutely minutely;
    private Hourly hourly;
    private Daily daily;
    private Flags flags;
    private int offset;
    public final static Parcelable.Creator<Forcast> CREATOR = new Creator<Forcast>() {

        @SuppressWarnings({"unchecked"})
        public Forcast createFromParcel(Parcel in) {
            return new Forcast(in);
        }

        public Forcast[] newArray(int size) {
            return (new Forcast[size]);
        }

    };

    protected Forcast(Parcel in) {
        this.latitude = ((double) in.readValue((double.class.getClassLoader())));
        this.longitude = ((double) in.readValue((double.class.getClassLoader())));
        this.timezone = ((String) in.readValue((String.class.getClassLoader())));
        this.currently = ((Currently) in.readValue((Currently.class.getClassLoader())));
        this.minutely = ((Minutely) in.readValue((Minutely.class.getClassLoader())));
        this.hourly = ((Hourly) in.readValue((Hourly.class.getClassLoader())));
        this.daily = ((Daily) in.readValue((Daily.class.getClassLoader())));
        this.flags = ((Flags) in.readValue((Flags.class.getClassLoader())));
        this.offset = ((int) in.readValue((int.class.getClassLoader())));
    }

    public Forcast() {
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

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
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

    public int describeContents() {
        return 0;
    }

}
