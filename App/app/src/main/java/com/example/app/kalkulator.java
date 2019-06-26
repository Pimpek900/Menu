package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
    private TextView Info;
    private TextView wynik;
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;
    private Button C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        setupUPViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Info.setText(Info.getText().toString() + "0");
            }
        });

        jeden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Info.setText(Info.getText().toString() + "1");
            }
        });

        dwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Info.setText(Info.getText().toString() + "2");
            }
        });

        trzy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Info.setText(Info.getText().toString() + "3");
            }
        });

        cztery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Info.setText(Info.getText().toString() + "4");
            }
        });

        piec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Info.setText(Info.getText().toString() + "5");
            }
        });

        szesc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Info.setText(Info.getText().toString() + "6");
            }
        });

        siedem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Info.setText(Info.getText().toString() + "7");
            }
        });

        dziewiec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Info.setText(Info.getText().toString() + "9");
            }
        });

        osiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Info.setText(Info.getText().toString() + "8");
            }
        });

        kropka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Info.setText(Info.getText().toString() + ".");
            }
        });

        dodac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = DODAWANIE;
                wynik.setText(String.valueOf(val1) + "+");
                Info.setText(null);
            }
        });

        odjac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = ODEJMOWANIE;
                wynik.setText(String.valueOf(val1) + "-");
                Info.setText(null);
            }
        });

        razy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = MNOŻENIE;
                wynik.setText(String.valueOf(val1) + "*");
                Info.setText(null);
            }
        });

        podzielic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = DZIELENIE;
                wynik.setText(String.valueOf(val1) + "/");
                Info.setText(null);
            }
        });

        Enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = EQU;
                wynik.setText(wynik.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                Info.setText(null);
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Info.getText().length() > 0)
                {
                    CharSequence name = Info.getText().toString();
                    Info.setText(name.subSequence(0,name.length()-1));
                }

                else
                    {
                        val1 = Double.NaN;
                        val2 = Double.NaN;
                        Info.setText(null);
                        wynik.setText(null);
                    }
            }
        });
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
        Info = (TextView)findViewById(R.id.Info);
        wynik = (TextView)findViewById(R.id.Wynik);
        C = (Button)findViewById(R.id.C);
    }

    private void compute()
    {
        if (!Double.isNaN(val1))
        {
            val2 = Double.parseDouble(Info.getText().toString());

            switch (ACTION)
            {
                case DODAWANIE:
                    val1 = val1 + val2;
                    break;

                case ODEJMOWANIE:
                    val1 = val1 - val2;
                    break;

                case MNOŻENIE:
                    val1 = val1 * val2;
                    break;

                case DZIELENIE:
                    val1 = val1 / val2;
                    break;

                case EQU:
                    break;
            }
        }
        else
            {
                val1 = Double.parseDouble(Info.getText().toString());
            }
    }
}
