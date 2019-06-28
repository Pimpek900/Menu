package com.example.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class FUTURE extends AppCompatActivity {

    private SoundPool sp;
    private int future01;
    private int future02;
    private int future03;
    private int future04;
    private int future05;
    private int future06;
    private int future07;
    private int future08;
    private int future09;
    private int future10;
    private int future11;
    private int future12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hip_hop);

        sp = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        future01 = sp.load(getApplicationContext(),R.raw.future01,1);
        future02 = sp.load(getApplicationContext(),R.raw.future02,1);
        future03 = sp.load(getApplicationContext(),R.raw.future03,1);
        future04 = sp.load(getApplicationContext(),R.raw.future04,1);
        future05 = sp.load(getApplicationContext(),R.raw.future05,1);
        future06 = sp.load(getApplicationContext(),R.raw.future06,1);
        future07 = sp.load(getApplicationContext(),R.raw.future07,1);
        future08 = sp.load(getApplicationContext(),R.raw.future08,1);
        future09 = sp.load(getApplicationContext(),R.raw.future09,1);
        future10 = sp.load(getApplicationContext(),R.raw.future10,1);
        future11 = sp.load(getApplicationContext(),R.raw.future11,1);
        future12 = sp.load(getApplicationContext(),R.raw.future12,1);
    }
    public void playsound1(View view) { sp.play(future01,0.5f,0.5f,0,0,1f); }
    public void playsound2(View view) { sp.play(future02,0.5f,0.5f,0,0,1f); }
    public void playsound3(View view) { sp.play(future03,0.5f,0.5f,0,0,1f); }
    public void playsound4(View view) { sp.play(future04,0.5f,0.5f,0,0,1f); }
    public void playsound5(View view) { sp.play(future05,0.5f,0.5f,0,0,1f); }
    public void playsound6(View view) { sp.play(future06,0.5f,0.5f,0,0,1f); }
    public void playsound7(View view) { sp.play(future07,0.5f,0.5f,0,0,1f); }
    public void playsound8(View view) { sp.play(future08,0.5f,0.5f,0,0,1f); }
    public void playsound9(View view) { sp.play(future09,0.5f,0.5f,0,0,1f); }
    public void playsound10(View view) { sp.play(future10,0.5f,0.5f,0,0,1f); }
    public void playsound11(View view) { sp.play(future11,0.5f,0.5f,0,0,1f); }
    public void playsound12(View view) { sp.play(future12,0.5f,0.5f,0,0,1f); }


}
