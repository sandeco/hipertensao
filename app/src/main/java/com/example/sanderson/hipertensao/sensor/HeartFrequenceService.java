package com.example.sanderson.hipertensao.sensor;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class HeartFrequenceService extends Service implements ReadFrequenceObseverTask{

    private ReadFrequenceSensorTask task;


    public HeartFrequenceService() {
        task = new ReadFrequenceSensorTask();
        task.add(this);
    }


    @Override
    public int onStartCommand(Intent intent, int flags,int startId) {
        task.start();
        return 0;
    }


    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }


    @Override
    public void update() {

    }
}
