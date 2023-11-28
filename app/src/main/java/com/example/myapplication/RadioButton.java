package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButton extends AppCompatActivity {

    android.widget.RadioButton radioButton;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        radioGroup=findViewById(R.id.radiogroup);
    }
    public void onClickbutton(View view) {
        int selectId=radioGroup.getCheckedRadioButtonId();
        radioButton=findViewById(selectId);
        if (selectId==-1) {
            Toast.makeText(this, "No ha seleccionado", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, radioButton.getText(), Toast.LENGTH_SHORT).show();
        }
    }
}