package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class TableLayout extends AppCompatActivity {

    TextView textview_resul;
    float valor = 0f;
    float numero1 = 0f;
    float numero2 = 0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);

        textview_resul=findViewById(R.id.tv_cero);
    }
    public void Uno(View view) {
        valor = Float.parseFloat(textview_resul.getText().toString());
        if (valor == 0f) {
            textview_resul.setText("1");
        }else {
            textview_resul.setText(textview_resul.getText()+"1");
        }
    }
    public void Dos(View view) {
        valor = Float.parseFloat(textview_resul.getText().toString());
        if (valor == 0f) {
            textview_resul.setText("2");
        }else {
            textview_resul.setText(textview_resul.getText()+"2");
        }
    }
    public void Tres(View view) {
        valor = Float.parseFloat(textview_resul.getText().toString());
        if (valor == 0f) {
            textview_resul.setText("3");
        }else {
            textview_resul.setText(textview_resul.getText()+"3");
        }
    }
    public void Cuatro(View view) {
        valor = Float.parseFloat(textview_resul.getText().toString());
        if (valor == 0f) {
            textview_resul.setText("4");
        }else {
            textview_resul.setText(textview_resul.getText()+"4");
        }
    }
    public void Cinco(View view) {
        valor = Float.parseFloat(textview_resul.getText().toString());
        if (valor == 0f) {
            textview_resul.setText("5");
        }else {
            textview_resul.setText(textview_resul.getText()+"5");
        }
    }
    public void Seis(View view) {
        valor = Float.parseFloat(textview_resul.getText().toString());
        if (valor == 0f) {
            textview_resul.setText("6");
        }else {
            textview_resul.setText(textview_resul.getText()+"6");
        }
    }
    public void Siete(View view) {
        valor = Float.parseFloat(textview_resul.getText().toString());
        if (valor == 0f) {
            textview_resul.setText("7");
        }else {
            textview_resul.setText(textview_resul.getText()+"7");
        }
    }
    public void Ocho(View view) {
        valor = Float.parseFloat(textview_resul.getText().toString());
        if (valor == 0f) {
            textview_resul.setText("8");
        }else {
            textview_resul.setText(textview_resul.getText()+"8");
        }
    }
    public void Nueve(View view) {
        valor = Float.parseFloat(textview_resul.getText().toString());
        if (valor == 0f) {
            textview_resul.setText("9");
        }else {
            textview_resul.setText(textview_resul.getText()+"9");
        }
    }
    public void Cero(View view) {
        valor = Float.parseFloat(textview_resul.getText().toString());
        if (valor == 0f) {
            textview_resul.setText("0");
        }else {
            textview_resul.setText(textview_resul.getText()+"0");
        }
    }
    public void Mas(View view) {
        numero1 = Float.parseFloat(textview_resul.getText().toString());
        operacion = "+";
        textview_resul.setText("0");
    }
    public void Menos(View view) {
        numero1 = Float.parseFloat(textview_resul.getText().toString());
        operacion = "-";
        textview_resul.setText("0");
    }
    public void Multiplicar(View view) {
        numero1 = Float.parseFloat(textview_resul.getText().toString());
        operacion = "*";
        textview_resul.setText("0");
    }
    public void Dividir(View view) {
        numero1 = Float.parseFloat(textview_resul.getText().toString());
        operacion = "/";
        textview_resul.setText("0");
    }
    public void Resultado(View view) {
        numero2 = Float.parseFloat(textview_resul.getText().toString());
        if (operacion.equals("/"))
        {
            if (numero2 == 0) {
                textview_resul.setText("0");
                Toast.makeText(this, "Operacion no Valida", Toast.LENGTH_SHORT).show();
            }else {
                float result = numero1 / numero2;
                textview_resul.setText(result +"");
            }
        }else if (operacion.equals("*")) {
            float result = numero1 * numero2;
            textview_resul.setText(result + "");

        } else if (operacion.equals("-")) {
            float result = numero1 - numero2;
            textview_resul.setText(result + "");
            
        } else if (operacion.equals("+")) {
            float result = numero1 + numero2;
            textview_resul.setText(result + "");
        }
        numero1 = 0f;
        numero2 = 0f;
        operacion = "";

    }
    public void Restaurar(View view) {
        textview_resul.setText("0");
        numero1 = 0f;
        numero2 = 0f;
        operacion = "";
    }
}