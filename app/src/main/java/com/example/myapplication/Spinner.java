package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class Spinner extends AppCompatActivity {

    android.widget.Spinner spinner;
    TextView respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        respuesta=findViewById(R.id.tv_respuesta);
        spinner=findViewById(R.id.spinner);

        String[] respuesta = {"Triste", "Feliz", "Enojado"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, respuesta);
        spinner.setAdapter(adapter);
    }
    public void mostrar(View view) {
        String seleccionado = spinner.getSelectedItem().toString();
        if (seleccionado.equals("Triste")) {
            respuesta.setText("No estes triste!!!");
        } else if (seleccionado.equals("Feliz")) {
            respuesta.setText("Espectacular!");
        }else if (seleccionado.equals("Enojado")) {
            respuesta.setText("Muy mal!");
    }   }
}