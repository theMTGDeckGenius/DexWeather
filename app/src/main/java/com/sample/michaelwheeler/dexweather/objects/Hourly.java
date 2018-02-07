
package com.sample.michaelwheeler.dexweather.objects;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONObject;

import java.util.List;

public class Hourly implements Parcelable {

    private static final String SUMMARY = "summary";
    private static final String ICON = "icon";
    private static final String DATA = "data";
    private String summary;
    private String icon;
    private List<Data> data = null;
    public final static Parcelable.Creator<Hourly> CREATOR = new Creator<Hourly>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Hourly createFromParcel(Parcel in) {
            return new Hourly(in);
        }

        public Hourly[] newArray(int size) {
            return (new Hourly[size]);
        }

    };

    protected Hourly(Parcel in) {
        this.summary = ((String) in.readValue((String.class.getClassLoader())));
        this.icon = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.data, (Data.class.getClassLoader()));
    }

    public Hourly() {
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

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(summary);
        dest.writeValue(icon);
        dest.writeList(data);
    }

    public static Hourly buildFromJSONObject(JSONObject jsonObject) {
        Hourly hourly = new Hourly();
        if (jsonObject != null){
            hourly.setSummary(jsonObject.optString(SUMMARY));
            hourly.setData(Data.buildFromJSONObject(jsonObject.optJSONArray(DATA)));
            hourly.setIcon(jsonObject.optString(ICON
            ));
        }
        return hourly;
    }
    public int describeContents() {
        return 0;
    }

}
