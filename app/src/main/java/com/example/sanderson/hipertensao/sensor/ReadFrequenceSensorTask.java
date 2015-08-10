package com.example.sanderson.hipertensao.sensor;

import com.example.sanderson.hipertensao.persistence.FrequenceDAO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sanderson on 06/08/2015.
 */
public class ReadFrequenceSensorTask implements Runnable{

    private Thread thread;

    private HeartSensor heartSensor;
    private String strFrequencies = "";
    private boolean started = false;
    private int cont = 0;
    private FrequenceDAO dao;

    private List<ReadFrequenceObseverTask> observers = new ArrayList<ReadFrequenceObseverTask>();


    public ReadFrequenceSensorTask(){
        heartSensor = HeartSensor.getInstance();
        thread = new Thread(this);
    }

    public void start(){
        started = true;
        thread.start();
    }

    public void stop(){
        started = false;
    }

    public void add(ReadFrequenceObseverTask obs){
        observers.add(obs);
    }

    @Override
    public void run() {


        while(started) {
            try {
                if(cont<=20) {
                    thread.sleep(30 * 1000);

                    strFrequencies += ""+heartSensor.getHeartFrequence()+",";
                    cont++;
                }else{
                    dao.saveFrequencies(strFrequencies);
                    cont=0;
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void update(){
        for(ReadFrequenceObseverTask obs : observers){
            obs.update();
        }
    }

}
