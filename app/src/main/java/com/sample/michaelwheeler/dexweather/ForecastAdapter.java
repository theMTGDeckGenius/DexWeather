package com.sample.michaelwheeler.dexweather;

import android.content.Context;
import android.support.v7.widget.CardView;
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

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastViewHolder> {

    private Forecast mForecast;
    private Context mContext;
    private ForecastHandler mForecastHandler;
    private final String TEMP_PLACE_HOLDER = "##TEMP##";
    private final String TIME_PLACE_HOLDER = "##TIME##";

    public ForecastAdapter(Forecast forecast, Context context, ForecastHandler handler) {
        this.mForecast = forecast;
        this.mContext = context;
        this.mForecastHandler = handler;
    }

    @Override
    public ForecastViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater mInflater = LayoutInflater.from(parent.getContext());
        ViewGroup restaurantsView = (ViewGroup) mInflater.inflate(R.layout.day_item, parent, false);
        return new ForecastViewHolder(restaurantsView, mForecastHandler);
    }

    @Override
    public void onBindViewHolder(final ForecastViewHolder holder, int position) {
        final Daily mForecastDaily = mForecast.getDaily();

        Data day = mForecastDaily.getData().get(position);
        holder.tital.setText(getDateFromTimeStamp(day.getTime()));

        holder.temperatureLow.setText(mContext.getResources().getString(R.string.low_temp)
                .replace(TEMP_PLACE_HOLDER, day.getTemperatureLow())
                .replace(TIME_PLACE_HOLDER, getTimeFromTimeStamp(day.getTemperatureLowTime())));
        holder.temperatureHigh.setText(mContext.getResources().getString(R.string.high_temp)
                .replace(TEMP_PLACE_HOLDER, day.getTemperatureHigh())
                .replace(TIME_PLACE_HOLDER, getTimeFromTimeStamp(day.getTemperatureHighTime())));
        holder.temperatureCurrent.setText(mContext.getResources().getString(R.string.current_temp)
                .replace(TEMP_PLACE_HOLDER, day.getTemperatureHigh()));
        holder.condition.setText(getForecastIcon(day.getIcon()));
        holder.setDayData(day);
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

    private String getDateFromTimeStamp(String timeStamp) {
        long unitxTimestamp = Long.valueOf(timeStamp) * 1000;// its need to be in milisecond
        Date date = new java.util.Date(unitxTimestamp);
//        String dateString = new SimpleDateFormat("EEE, MMM d yyyy HH:mm:ss").format(date);
        String dateString = new SimpleDateFormat("EEE, MMM d, yyyy").format(date);
//        return dateString.substring(0, 16);
        return dateString;
    }

    private String getTimeFromTimeStamp(String timeStamp) {
        long unitxTimestamp = Long.valueOf(timeStamp) * 1000;// its need to be in milisecond
        Date date = new java.util.Date(unitxTimestamp);
        String dateString = new SimpleDateFormat("HH:mm").format(date);
        return dateString;
    }

    private String getForecastIcon(String icon) {
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

    static class ForecastViewHolder extends RecyclerView.ViewHolder {

        Data mDayData;
        TextView tital;
        TextView temperatureLow;
        TextView temperatureHigh;
        TextView temperatureCurrent;
        TextView condition;
        View root;
        CardView click;

        public void setDayData(Data data){
            mDayData = data;
        }

        ForecastViewHolder(View itemView, final ForecastHandler handler) {
            super(itemView);
            tital = itemView.findViewById(R.id.day_of_week);
            temperatureLow = itemView.findViewById(R.id.temperature_low);
            temperatureHigh = itemView.findViewById(R.id.temperature_high);
            temperatureCurrent = itemView.findViewById(R.id.temperature_current);
            condition = itemView.findViewById(R.id.condition);
            root = itemView.findViewById(R.id.day_root);
            click = itemView.findViewById(R.id.card_view);
            click.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mDayData != null){
                        handler.onclick(mDayData);
                    }
                }
            });
        }
    }
}
