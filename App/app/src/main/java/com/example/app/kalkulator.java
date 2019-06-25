package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class kalkulator extends AppCompatActivity {

    private Button jeden;
    private Button dwa;
    private Button trzy;
    private Button cztery;
    private Button piec;
    private Button szesc;
    private Button siedem;
    private Button osiem;
    private Button dziewiec;
    private Button zero;
    private Button dodac;
    private Button odjac;
    private Button razy;
    private Button podzielic;
    private final char DODAWANIE = '+';
    private final char ODEJMOWANIE = '-';
    private final char MNOŻENIE = '*';
    private final char DZIELENIE = '/';
    private final char EQU = 0;
    private Button kropka;
    private Button Enter;
    private Button Info;
    private TextView wynik;
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;
    private Button C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
    }

    private void setupUPViews()
    {
        jeden = (Button)findViewById(R.id.guzik1);
        zero = (Button)findViewById(R.id.guzik0);
        dwa = (Button)findViewById(R.id.guzik2);
        trzy = (Button)findViewById(R.id.guzik3);
        cztery = (Button)findViewById(R.id.guzik4);
        piec = (Button)findViewById(R.id.guzik5);
        szesc = (Button)findViewById(R.id.guzik6);
        siedem = (Button)findViewById(R.id.guzik7);
        osiem = (Button)findViewById(R.id.guzik8);
        dziewiec = (Button)findViewById(R.id.guzik9);
        dodac = (Button)findViewById(R.id.dodawanko);
        odjac = (Button)findViewById(R.id.odejmianie);
        razy = (Button)findViewById(R.id.mnożenie);
        podzielic = (Button)findViewById(R.id.dzielenie);
        kropka = (Button)findViewById(R.id.kropka);
        Enter = (Button)findViewById(R.id.enter);
        wynik = (TextView)findViewById(R.id.Wynik);
    }
}
