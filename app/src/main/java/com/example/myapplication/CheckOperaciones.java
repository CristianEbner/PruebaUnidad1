package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CheckOperaciones extends AppCompatActivity {
    EditText et1, et2;
    TextView tv1;
    CheckBox cb1, cb2, cb3, cb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_operaciones);

        et1=findViewById(R.id.et_number1);
        et2=findViewById(R.id.et_number2);
        cb1=findViewById(R.id.cb_sum);
        cb2=findViewById(R.id.cb_res);
        cb3=findViewById(R.id.cb_multi);
        cb4=findViewById(R.id.cb_div);
        tv1=findViewById(R.id.tv_resultado);
    }
    private float Calcular(String num) {
        if (num.equals("")) {
            return 0;
        } else {
            return Float.parseFloat(num);
        }
    }
    public void btn_Calcular(View calcular) {
        String n1 = et1.getText().toString();
        String n2 = et2.getText().toString();
        float num1 = Calcular(n1);
        float num2 = Calcular(n2);
        String resultado="";
        if (cb1.isChecked()) {
            float suma = num1 + num2;
            resultado+="Suma: " +suma+"\n";
        }
        if (cb2.isChecked()) {
            float resta = num1 - num2;
            resultado+="Resta: " +resta+"\n";
        }
        if (cb3.isChecked()) {
            float multi = num1 * num2;
            resultado+="Multiplicacion: " +multi+"\n";
        }
        if (cb4.isChecked()) {
            if (num2==0) {
                Toast.makeText(this, "El segundo numero debe ser cero para la division", Toast.LENGTH_SHORT).show();
            }else {
                float divi = num1 / num2;
                resultado+="Division: " +divi+"\n";
            }
        }
        tv1.setText(resultado);
    }
}