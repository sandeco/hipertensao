package com.example.sanderson.hipertensao.sensor;

/**
 * Created by sanderson on 06/08/2015.
 */
public class HeartSensor {

    private static HeartSensor heartSensor = null;
    private HeartSensor(){}


    public int getHeartFrequence(){
        return 100;
    };


    public static HeartSensor getInstance(){
        if(heartSensor==null){
            heartSensor = new HeartSensor();
        }

        return heartSensor;
    }
}
