package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    //ConstraintLayout
    public void Constraint(View view) {
        Intent constraint = new Intent(this, ConstraintLayout.class);
        startActivity(constraint);
    }

    //LinearLayout
    public void Linear(View view) {
        Intent linear = new Intent(this, LinearLayout.class);
        startActivity(linear);
    }

    //Menu
    public void menu(View view) {
        Intent Menu = new Intent(this, MainActivity.class);
        startActivity(Menu);
    }
    public void Table(View view) {
        Intent table = new Intent(this, TableLayout.class);
        startActivity(table);
    }
    public void CheckBoxProgressBar(View view) {
        Intent checkBoxProgressBar = new Intent(this, CheckBoxProgressBar.class);
        startActivity(checkBoxProgressBar);
    }

    public void RadioButton(View view) {
        Intent radioButton = new Intent(this, RadioButton.class);
        startActivity(radioButton);
    }
    public void RecyclerScroll(View view) {
        Intent recyclerScroll = new Intent(this, RecyclerScroll.class);
        startActivity(recyclerScroll);
    }
}