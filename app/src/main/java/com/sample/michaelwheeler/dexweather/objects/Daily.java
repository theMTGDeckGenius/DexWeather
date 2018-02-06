
package com.sample.michaelwheeler.dexweather.objects;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Daily implements Parcelable {

    private final String SUMMARY = "summary";
    private final String ICON = "icon";
    private final String DATA = "data";
    private String summary;
    private String icon;
    private List<Datum> data = null;
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
        in.readList(this.data, (Datum.class.getClassLoader()));
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

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(summary);
        dest.writeValue(icon);
        dest.writeList(data);
    }

    public int describeContents() {
        return 0;
    }

}
