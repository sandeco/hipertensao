package com.example.sanderson.hipertensao.sensor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RootReceiver extends BroadcastReceiver {
    public RootReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        Intent it = new Intent(context, HeartFrequenceService.class);
        context.startService(it);
                
    }
}
