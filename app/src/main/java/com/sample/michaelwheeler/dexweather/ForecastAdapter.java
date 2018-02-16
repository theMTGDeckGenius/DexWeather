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

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Michael Wheeler on 2/5/2018.
 *
 * Creates the views in teh recycler adapter for every day's forecast received
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastViewHolder> {

    private Forecast mForecast;
    private Context mContext;
    private ForecastHandler mForecastHandler;

    ForecastAdapter(Forecast forecast, Context context, ForecastHandler handler) {
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
                .replace(Utils.TEMP_PLACE_HOLDER, day.getTemperatureLow())
                .replace(Utils.TIME_PLACE_HOLDER, getTimeFromTimeStamp(day.getTemperatureLowTime())));
        holder.temperatureHigh.setText(mContext.getResources().getString(R.string.high_temp)
                .replace(Utils.TEMP_PLACE_HOLDER, day.getTemperatureHigh())
                .replace(Utils.TIME_PLACE_HOLDER, getTimeFromTimeStamp(day.getTemperatureHighTime())));
        holder.condition.setText(Utils.getForecastIcon(day.getIcon()));
        holder.setDayData(day);
        if (position % 2 == 0) {
            holder.root.setBackgroundColor(mContext.getResources().getColor(R.color.lightGrey));
        } else {
            holder.root.setBackgroundColor(mContext.getResources().getColor(R.color.white));
        }
    }

    @Override
    public int getItemCount() {
//        return mForecast.getDaily().getData().size();
        return 5;
    }

    private String getDateFromTimeStamp(String timeStamp) {
        long unitxTimestamp = Long.valueOf(timeStamp) * 1000;// its need to be in milisecond
        Date date = new java.util.Date(unitxTimestamp);
       return DateFormat.getDateInstance(DateFormat.LONG).format(date);
    }

    private String getTimeFromTimeStamp(String timeStamp) {
        long unitxTimestamp = Long.valueOf(timeStamp) * 1000;// its need to be in milisecond
        Date date = new java.util.Date(unitxTimestamp);
        return DateFormat.getDateInstance(DateFormat.SHORT).format(date);
    }

    static class ForecastViewHolder extends RecyclerView.ViewHolder {

        Data mDayData;
        TextView tital;
        TextView temperatureLow;
        TextView temperatureHigh;
        TextView condition;
        View root;
        CardView click;

        void setDayData(Data data){
            mDayData = data;
        }

        ForecastViewHolder(View itemView, final ForecastHandler handler) {
            super(itemView);
            tital = itemView.findViewById(R.id.day_of_week);
            temperatureLow = itemView.findViewById(R.id.temperature_low);
            temperatureHigh = itemView.findViewById(R.id.temperature_high);
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
