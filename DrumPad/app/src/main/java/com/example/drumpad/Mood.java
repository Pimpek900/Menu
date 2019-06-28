package com.example.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class Mood extends AppCompatActivity {

    private SoundPool sp;
    private int hip_hop01;
    private int hip_hop02;
    private int hip_hop03;
    private int hip_hop04;
    private int hip_hop05;
    private int hip_hop06;
    private int hip_hop07;
    private int hip_hop08;
    private int hip_hop09;
    private int hip_hop10;
    private int hip_hop11;
    private int hip_hop12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drum_pad01);

        sp = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        hip_hop01 = sp.load(getApplicationContext(),R.raw.hip_hop01,1);
        hip_hop02 = sp.load(getApplicationContext(),R.raw.hip_hop02,1);
        hip_hop03 = sp.load(getApplicationContext(),R.raw.hip_hop03,1);
        hip_hop04 = sp.load(getApplicationContext(),R.raw.hip_hop04,1);
        hip_hop05 = sp.load(getApplicationContext(),R.raw.hip_hop05,1);
        hip_hop06 = sp.load(getApplicationContext(),R.raw.hip_hop06,1);
        hip_hop07 = sp.load(getApplicationContext(),R.raw.hip_hop07,1);
        hip_hop08 = sp.load(getApplicationContext(),R.raw.hip_hop08,1);
        hip_hop09 = sp.load(getApplicationContext(),R.raw.hip_hop09,1);
        hip_hop10 = sp.load(getApplicationContext(),R.raw.hip_hop10,1);
        hip_hop11 = sp.load(getApplicationContext(),R.raw.hip_hop11,1);
        hip_hop12 = sp.load(getApplicationContext(),R.raw.hip_hop12,1);
    }
    public void playsound1(View view) { sp.play(hip_hop01,0.5f,0.5f,0,0,1f); }
    public void playsound2(View view) { sp.play(hip_hop02,0.5f,0.5f,0,0,1f); }
    public void playsound3(View view) { sp.play(hip_hop03,0.5f,0.5f,0,0,1f); }
    public void playsound4(View view) { sp.play(hip_hop04,0.5f,0.5f,0,0,1f); }
    public void playsound5(View view) { sp.play(hip_hop05,0.5f,0.5f,0,0,1f); }
    public void playsound6(View view) { sp.play(hip_hop06,0.5f,0.5f,0,0,1f); }
    public void playsound7(View view) { sp.play(hip_hop07,0.5f,0.5f,0,0,1f); }
    public void playsound8(View view) { sp.play(hip_hop08,0.5f,0.5f,0,0,1f); }
    public void playsound9(View view) { sp.play(hip_hop09,0.5f,0.5f,0,0,1f); }
    public void playsound10(View view) { sp.play(hip_hop10,0.5f,0.5f,0,0,1f); }
    public void playsound11(View view) { sp.play(hip_hop11,0.5f,0.5f,0,0,1f); }
    public void playsound12(View view) { sp.play(hip_hop12,0.5f,0.5f,0,0,1f); }

}
