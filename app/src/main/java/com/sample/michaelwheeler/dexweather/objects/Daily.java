
package com.sample.michaelwheeler.dexweather.objects;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONObject;

import java.util.List;

public class Daily implements Parcelable {

    private static final String SUMMARY = "summary";
    private static final String ICON = "icon";
    private static final String DATA = "data";
    private String summary;
    private String icon;
    private List<Data> data = null;
    public final static Parcelable.Creator<Daily> CREATOR = new Creator<Daily>() {
        @SuppressWarnings({"unchecked"})
        public Daily createFromParcel(Parcel in) {
            return new Daily(in);
        }

        public Daily[] newArray(int size) {
            return (new Daily[size]);
        }

    };

    protected Daily(Parcel in) {
        this.summary = ((String) in.readValue((String.class.getClassLoader())));
        this.icon = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.data, (Data.class.getClassLoader()));
    }

    public Daily() {
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

    public static Daily buildFromJSONObject(JSONObject jsonObject) {
        Daily daily = new Daily();
        if (jsonObject != null){
            daily.setSummary(jsonObject.optString(SUMMARY));
            daily.setData(Data.buildFromJSONObject(jsonObject.optJSONArray(DATA)));
            daily.setIcon(jsonObject.optString(ICON
            ));
        }
        return daily;
    }

    public int describeContents() {
        return 0;
    }

}
