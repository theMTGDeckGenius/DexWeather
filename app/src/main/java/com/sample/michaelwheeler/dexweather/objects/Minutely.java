
package com.sample.michaelwheeler.dexweather.objects;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONObject;

import java.util.List;

public class Minutely implements Parcelable {

    private static final String SUMMARY = "summary";
    private static final String ICON = "icon";
    private static final String DATA = "data";
    private String summary;
    private String icon;
    private List<Data> data = null;
    public final static Parcelable.Creator<Minutely> CREATOR = new Creator<Minutely>() {

        @SuppressWarnings({"unchecked"})
        public Minutely createFromParcel(Parcel in) {
            return new Minutely(in);
        }

        public Minutely[] newArray(int size) {
            return (new Minutely[size]);
        }
    };

    protected Minutely(Parcel in) {
        this.summary = ((String) in.readValue((String.class.getClassLoader())));
        this.icon = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.data, (Data.class.getClassLoader()));
    }

    public Minutely() {
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

    public static Minutely buildFromJSONObject(JSONObject jsonObject) {
        Minutely minutely = new Minutely();
        if (jsonObject != null){
            minutely.setSummary(jsonObject.optString(SUMMARY));
            minutely.setData(Data.buildFromJSONObject(jsonObject.optJSONArray(DATA)));
            minutely.setIcon(jsonObject.optString(ICON
            ));
        }
        return minutely;
    }
    public int describeContents() {
        return 0;
    }

}
