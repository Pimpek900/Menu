package com.example.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MOOD extends AppCompatActivity {

    private SoundPool sp;
    private int mood01;
    private int mood02;
    private int mood03;
    private int mood04;
    private int mood05;
    private int mood06;
    private int mood07;
    private int mood08;
    private int mood09;
    private int mood10;
    private int mood11;
    private int mood12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hip_hop);

        sp = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        mood01 = sp.load(getApplicationContext(),R.raw.mood01,1);
        mood02 = sp.load(getApplicationContext(),R.raw.mood02,1);
        mood03 = sp.load(getApplicationContext(),R.raw.mood03,1);
        mood04 = sp.load(getApplicationContext(),R.raw.mood04,1);
        mood05 = sp.load(getApplicationContext(),R.raw.mood05,1);
        mood06 = sp.load(getApplicationContext(),R.raw.mood06,1);
        mood07 = sp.load(getApplicationContext(),R.raw.mood07,1);
        mood08 = sp.load(getApplicationContext(),R.raw.mood08,1);
        mood09 = sp.load(getApplicationContext(),R.raw.mood09,1);
        mood10 = sp.load(getApplicationContext(),R.raw.mood10,1);
        mood11 = sp.load(getApplicationContext(),R.raw.mood11,1);
        mood12 = sp.load(getApplicationContext(),R.raw.mood12,1);
    }
    public void playsound1(View view) { sp.play(mood01,0.5f,0.5f,0,0,1f); }
    public void playsound2(View view) { sp.play(mood02,0.5f,0.5f,0,0,1f); }
    public void playsound3(View view) { sp.play(mood03,0.5f,0.5f,0,0,1f); }
    public void playsound4(View view) { sp.play(mood04,0.5f,0.5f,0,0,1f); }
    public void playsound5(View view) { sp.play(mood05,0.5f,0.5f,0,0,1f); }
    public void playsound6(View view) { sp.play(mood06,0.5f,0.5f,0,0,1f); }
    public void playsound7(View view) { sp.play(mood07,0.5f,0.5f,0,0,1f); }
    public void playsound8(View view) { sp.play(mood08,0.5f,0.5f,0,0,1f); }
    public void playsound9(View view) { sp.play(mood09,0.5f,0.5f,0,0,1f); }
    public void playsound10(View view) { sp.play(mood10,0.5f,0.5f,0,0,1f); }
    public void playsound11(View view) { sp.play(mood11,0.5f,0.5f,0,0,1f); }
    public void playsound12(View view) { sp.play(mood12,0.5f,0.5f,0,0,1f); }

}
