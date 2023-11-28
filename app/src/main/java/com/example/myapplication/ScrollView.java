package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ScrollView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
    }

    public void Seleccion(View view) {
        String cadena = getResources().getResourceEntryName(view.getId());
        Toast.makeText(this, "Esto es un " + cadena, Toast.LENGTH_SHORT).show();
    }
}