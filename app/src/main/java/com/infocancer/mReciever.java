package com.infocancer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;


public class mReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent)
    {
        Intent service1 = new Intent(context,mAlarmService.class);
        context.startService(service1);
    }
}
