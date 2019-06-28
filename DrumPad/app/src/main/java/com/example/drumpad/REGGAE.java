package com.example.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class REGGAE extends AppCompatActivity {

    private SoundPool sp;
    private int reggae01;
    private int reggae02;
    private int reggae03;
    private int reggae04;
    private int reggae05;
    private int reggae06;
    private int reggae07;
    private int reggae08;
    private int reggae09;
    private int reggae10;
    private int reggae11;
    private int reggae12;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hip_hop);

        sp = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        reggae01 = sp.load(getApplicationContext(),R.raw.reggae01,1);
        reggae02 = sp.load(getApplicationContext(),R.raw.reggae02,1);
        reggae03 = sp.load(getApplicationContext(),R.raw.reggae03,1);
        reggae04 = sp.load(getApplicationContext(),R.raw.reggae04,1);
        reggae05 = sp.load(getApplicationContext(),R.raw.reggae05,1);
        reggae06 = sp.load(getApplicationContext(),R.raw.reggae06,1);
        reggae07 = sp.load(getApplicationContext(),R.raw.reggae07,1);
        reggae08 = sp.load(getApplicationContext(),R.raw.reggae08,1);
        reggae09 = sp.load(getApplicationContext(),R.raw.reggae09,1);
        reggae10 = sp.load(getApplicationContext(),R.raw.reggae10,1);
        reggae11 = sp.load(getApplicationContext(),R.raw.reggae11,1);
        reggae12 = sp.load(getApplicationContext(),R.raw.reggae12,1);
    }

    public void playsound1(View view) { sp.play(reggae01,0.5f,0.5f,0,0,1f); }
    public void playsound2(View view) { sp.play(reggae02,0.5f,0.5f,0,0,1f); }
    public void playsound3(View view) { sp.play(reggae03,0.5f,0.5f,0,0,1f); }
    public void playsound4(View view) { sp.play(reggae04,0.5f,0.5f,0,0,1f); }
    public void playsound5(View view) { sp.play(reggae05,0.5f,0.5f,0,0,1f); }
    public void playsound6(View view) { sp.play(reggae06,0.5f,0.5f,0,0,1f); }
    public void playsound7(View view) { sp.play(reggae07,0.5f,0.5f,0,0,1f); }
    public void playsound8(View view) { sp.play(reggae08,0.5f,0.5f,0,0,1f); }
    public void playsound9(View view) { sp.play(reggae09,0.5f,0.5f,0,0,1f); }
    public void playsound10(View view) { sp.play(reggae10,0.5f,0.5f,0,0,1f); }
    public void playsound11(View view) { sp.play(reggae11,0.5f,0.5f,0,0,1f); }
    public void playsound12(View view) { sp.play(reggae12,0.5f,0.5f,0,0,1f); }

}
