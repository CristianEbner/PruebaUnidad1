package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Spinner;

public class RadioSpinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_spinner);

    }
    public void radiobutton(View view) {
        Intent radiobutton = new Intent(this, RadioButton.class);
        startActivity(radiobutton);
    }
    public void Spinner(View view) {
        Intent spinner = new Intent(this, Spinner.class);
        startActivity(spinner);
    }
}