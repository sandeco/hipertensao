package com.example.sanderson.hipertensao.activitys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.widget.TextView;

import com.example.sanderson.hipertensao.R;
import com.example.sanderson.hipertensao.sensor.HeartFrequenceService;

public class MainActivity extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mTextView = (TextView) stub.findViewById(R.id.text);
            }
        });


        /**
        Intent it = new Intent(this, HeartFrequenceService.class);
        this.startService(it);
        **/

        Intent i = new Intent(this, DataNascimentoActivity.class);
        startActivity(i);

    }
}
