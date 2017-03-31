package com.example.artur.zadanie4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Quiz extends Activity
{
    int punkty = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
    }

    public void dodaj(View view)
    {
        punkty++;
    }

    public void reset(View view)
    {
        punkty = 0;
    }

    public void wynik(View view)
    {
        Toast.makeText(getApplicationContext(),"Ilość zdobytych punktów: " + punkty, Toast.LENGTH_LONG).
                show();
    }

    public void Powrot(View view)
    {
        finish();
    }

}
