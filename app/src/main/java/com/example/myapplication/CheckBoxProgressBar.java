package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class CheckBoxProgressBar extends AppCompatActivity {

    //CheckBoxProgressBar
    ProgressBar pb1;
    Button btn1, btn2;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_progress_bar);

        //CheckBoxProgressBar
        pb1=findViewById(R.id.progressBar);
        btn1=findViewById(R.id.btn_radioButton);
        btn2=findViewById(R.id.btn_spinner);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb1.setVisibility(View.VISIBLE);

                Timer timer = new Timer();
                TimerTask timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        counter++;

                        pb1.setProgress(counter);
                        if (counter == 100) {
                            timer.cancel();

                            Intent opcion = new Intent(CheckBoxProgressBar.this, CheckOpciones.class);
                            startActivity(opcion);
                        }
                    }
                };
                timer.schedule(timerTask, 100, 100);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb1.setVisibility(View.VISIBLE);

                Timer timer = new Timer();
                TimerTask timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        counter++;

                        pb1.setProgress(counter);
                        if (counter == 100) {
                            timer.cancel();

                            Intent opcion = new Intent(CheckBoxProgressBar.this, CheckOperaciones.class);
                            startActivity(opcion);
                        }
                    }
                };
                timer.schedule(timerTask, 100, 100);
            }
        });
    }
    public void Opciones(View view) {
        Intent opcion = new Intent(this, CheckOpciones.class);
        startActivity(opcion);
    }
    public void Operacion(View view) {
        Intent operacion = new Intent(this, CheckOperaciones.class);
        startActivity(operacion);
    }
}