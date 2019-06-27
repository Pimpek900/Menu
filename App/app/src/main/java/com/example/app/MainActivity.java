package com.example.app;

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

    public void Kalkulator(View view){
        Intent intent = new Intent(MainActivity.this, kalkulator.class);
        startActivity(intent);
    }
    public void Gry(View view){
    Intent intent = new Intent(MainActivity.this, GameMenu.class);
    startActivity(intent);
    }
    public void DrumPad(View view){
        Intent intent = new Intent(MainActivity.this, DrumPad.class);
        startActivity(intent);
    }

    public void Stoper(View view)
    {
        Intent intent = new Intent(MainActivity.this, Stoper.class);
        startActivity(intent);
    }

}