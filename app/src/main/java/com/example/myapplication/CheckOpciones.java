package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckOpciones extends AppCompatActivity {
    CheckBox c1, c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_opciones);

        c1=findViewById(R.id.cb_opcion1);
        c2=findViewById(R.id.cb_opcion2);
    }
    public void btn_Validar(View view) {
        if (view.getId()==R.id.btn_validar) {
            validar();
        }
    }
    public void validar() {
        String cad="Seleccionado: \n";
        if (c1.isChecked()==true) {
            cad+="opcion 1\n";
        }
        if (c2.isChecked()==true) {
            cad+="opcion 2\n";
        }
        Toast.makeText(getApplicationContext(), cad, Toast.LENGTH_SHORT).show();
    }
}