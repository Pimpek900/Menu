package com.example.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DrumPadHipHop(View view){
        Intent intent = new Intent(MainActivity.this, DrumPad01.class);
        startActivity(intent);
    }

    public void DrumPadMood(View view){
        Intent intent = new Intent(MainActivity.this, Mood.class);
        startActivity(intent);
    }
    public void DrumPad01(View view){
        Intent intent = new Intent(MainActivity.this, DrumPad1.class);
        startActivity(intent);
    }
    public void DrumPad02(View view){
        Intent intent = new Intent(MainActivity.this, DrumPad2.class);
        startActivity(intent);
    }
}
