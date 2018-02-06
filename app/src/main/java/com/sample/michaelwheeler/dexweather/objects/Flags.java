
package com.sample.michaelwheeler.dexweather.objects;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flags implements Parcelable {

    private final String SOURCES = "sources";
    private final String ISD_STATIONS = "isdStations";
    private final String UNITS = "units";
    private List<String> sources = null;
    private List<String> isdStations = null;
    private String units;
    public final static Parcelable.Creator<Flags> CREATOR = new Creator<Flags>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Flags createFromParcel(Parcel in) {
            return new Flags(in);
        }

        public Flags[] newArray(int size) {
            return (new Flags[size]);
        }

    };

    protected Flags(Parcel in) {
        in.readList(this.sources, (java.lang.String.class.getClassLoader()));
        in.readList(this.isdStations, (java.lang.String.class.getClassLoader()));
        this.units = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Flags() {
    }

    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    public List<String> getIsdStations() {
        return isdStations;
    }

    public void setIsdStations(List<String> isdStations) {
        this.isdStations = isdStations;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(sources);
        dest.writeList(isdStations);
        dest.writeValue(units);
    }

    public int describeContents() {
        return 0;
    }

}
