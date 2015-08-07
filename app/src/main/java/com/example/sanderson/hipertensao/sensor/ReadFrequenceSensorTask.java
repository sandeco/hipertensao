package com.example.sanderson.hipertensao.sensor;

import android.os.AsyncTask;

import com.example.sanderson.hipertensao.Persistence.FrequenceDAO;

/**
 * Created by sanderson on 06/08/2015.
 */
public class ReadFrequenceSensorTask extends Thread{

    private HeartSensor heartSensor = new HeartSensorMOCK();
    private String frequencies = "";
    private boolean started = false;
    private int cont = 0;
    private FrequenceDAO dao;


    @Override
    public void run() {

        while(started) {
            try {
                if(cont<=20) {
                    sleep(30 * 1000);
                    frequencies+= ""+heartSensor.getHeartFrequence()+",";
                }else{
                    dao.saveFrequencies(frequencies);
                    cont=0;
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



}
