package com.example.sanderson.hipertensao.sensor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class RootReceiver extends BroadcastReceiver {
    public RootReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {


        Toast.makeText(context,"teste de monitoramento ativo", Toast.LENGTH_LONG).show();
        Intent it = new Intent(context, HeartFrequenceService.class);
        context.startService(it);

    }
}
