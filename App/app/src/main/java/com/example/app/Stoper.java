package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;

public class Stoper extends AppCompatActivity {

    private Chronometer chronometer;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stoper);

        chronometer = findViewById(R.id.chronometer);
    }

    public void startChronometer (View view)
        {
            if (!running)
            {
                chronometer.start();
                running = true;
            }
        }


    public void stopChronometer (View view)
        {
            if (running)
            {
                chronometer.stop();
                running = false;
            }
        }


    public void resetChronometer (View view)
        {

        }
}