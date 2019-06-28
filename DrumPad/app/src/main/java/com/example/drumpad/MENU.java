package com.example.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MENU extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void DrumPadHipHop(View view)
    {
        Intent intent = new Intent(MENU.this, HIP_HOP.class);
        startActivity(intent);
    }

    public void DrumPadMood(View view)
    {
        Intent intent = new Intent(MENU.this, MOOD.class);
        startActivity(intent);
    }

    public void DrumPadReggae (View view)
    {
        Intent intent = new Intent(MENU.this, REGGAE.class);
        startActivity(intent);
    }

    public void DrumPadFuture(View view)
    {
        Intent intent = new Intent(MENU.this, FUTURE.class);
        startActivity(intent);
    }
}
