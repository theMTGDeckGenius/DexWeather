package com.sample.michaelwheeler.dexweather;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sample.michaelwheeler.dexweather.objects.Daily;
import com.sample.michaelwheeler.dexweather.objects.Data;
import com.sample.michaelwheeler.dexweather.objects.Forecast;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Michael Wheeler on 2/5/2018.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.DiscoverViewHolder> {

    Forecast mForecast;
    Context mContext;
    private final String TEMP_PLACE_HOLDER = "##TEMP##";

    public ForecastAdapter(Forecast forecast, Context context) {
        this.mForecast = forecast;
        this.mContext = context;
    }

    @Override
    public DiscoverViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater mInflater = LayoutInflater.from(parent.getContext());
        ViewGroup restaurantsView = (ViewGroup) mInflater.inflate(R.layout.day_item, parent, false);
        return new DiscoverViewHolder(restaurantsView);
    }

    @Override
    public void onBindViewHolder(final DiscoverViewHolder holder, int position) {
        final Daily mForecastDaily = mForecast.getDaily();

        Data day = mForecastDaily.getData().get(position);
        holder.tital.setText(getDayOfTheWeekFromTimeStamp(day.getTime()));

        holder.temperatureLow.setText(mContext.getResources().getString(R.string.low_temp).replace(TEMP_PLACE_HOLDER, day.getTemperatureLow()));
        holder.temperatureHigh.setText(mContext.getResources().getString(R.string.high_temp).replace(TEMP_PLACE_HOLDER, day.getTemperatureHigh()));
        holder.condition.setText(getForcastIcon(day.getIcon()));
        if (position % 2 == 0) {
            holder.root.setBackgroundColor(mContext.getResources().getColor(R.color.lightGrey));
        } else {
            holder.root.setBackgroundColor(mContext.getResources().getColor(R.color.white));
        }
    }

    @Override
    public int getItemCount() {
        return mForecast.getDaily().getData().size();
    }

    private String getDayOfTheWeekFromTimeStamp(String timeStamp) {
        long unitxTimestamp = Long.valueOf(timeStamp) * 1000;// its need to be in milisecond
        Date date = new java.util.Date(unitxTimestamp);
        String dateString = new SimpleDateFormat("EEE, MMM d yyyy HH:mm:ss").format(date);

        return dateString.substring(0, 16);
    }

    private String getForcastIcon(String icon) {
        String value = new String(Character.toChars(0x1F321));
        switch (icon) {
            case "clear-day":
                value = new String(Character.toChars(0x2600));
                break;
            case "clear-night":
                value = new String(Character.toChars(0x1F319));
                break;
            case "rain":
                value = new String(Character.toChars(0x1F327));
                break;
            case "snow":
                value = new String(Character.toChars(0x1F327));
                break;
            case "sleet":
                value = new String(Character.toChars(0x2744));
                break;
            case "wind":
                value = new String(Character.toChars(0x1F32C));
                break;
            case "fog":
                value = new String(Character.toChars(0x1F32B));
                break;
            case "cloudy":
                value = new String(Character.toChars(0x1F325));
                break;
            case "partly-cloudy-day":
                value = new String(Character.toChars(0x1F324));
                break;
            case "partly-cloudy-night":
                value = new String(Character.toChars(0x1F324));
                break;
        }
        return value;
    }

    static class DiscoverViewHolder extends RecyclerView.ViewHolder {

        TextView tital;
        TextView temperatureLow;
        TextView temperatureHigh;
        TextView condition;
        View root;


        DiscoverViewHolder(View itemView) {
            super(itemView);

            tital = itemView.findViewById(R.id.day_of_week);
            temperatureLow = itemView.findViewById(R.id.temperature_low);
            temperatureHigh = itemView.findViewById(R.id.temperature_high);
            condition = itemView.findViewById(R.id.condition);
            root = itemView.findViewById(R.id.day_root);
        }
    }
}
