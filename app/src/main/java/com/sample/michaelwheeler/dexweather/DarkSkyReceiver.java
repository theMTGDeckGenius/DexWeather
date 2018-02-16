package com.sample.michaelwheeler.dexweather;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;

import com.sample.michaelwheeler.dexweather.objects.Forecast;
import com.sample.michaelwheeler.dexweather.restcalls.DarkSkyService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Michael Wheeler on 2/15/2018.
 */

public class DarkSkyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(final Context context, Intent intent) {

        DarkSkyService service = DarkSkyService.retrofit.create(DarkSkyService.class);
        Call<Forecast> call = service.getFiveDayForecast(Utils.KEY, Utils.LAT, Utils.LNG);
        call.enqueue(new Callback<Forecast>() {

            @Override
            public void onResponse(@NonNull Call<Forecast> call, @NonNull Response<Forecast> response) {
                if (response.isSuccessful()) {
                    if(isAppForground(context)){
                        Intent intent = new Intent(context, MainActivity.class);
                        intent.putExtra("currently", response.body().getCurrently());
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                    } else {
                        int count = PreferenceManager.getDefaultSharedPreferences(context).getInt("call_count", 0);
                        count++;
                        PreferenceManager.getDefaultSharedPreferences(context).edit().putInt("call_count", count).apply();
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<Forecast> call, @NonNull Throwable t) {

            }
        });
    }

    public boolean isAppForground(Context mContext) {

        ActivityManager am = (ActivityManager) mContext.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningTaskInfo> tasks = am.getRunningTasks(1);
        if (!tasks.isEmpty()) {
            ComponentName topActivity = tasks.get(0).topActivity;
            if (!topActivity.getPackageName().equals(mContext.getPackageName())) {
                return false;
            }
        }

        return true;
    }
}
