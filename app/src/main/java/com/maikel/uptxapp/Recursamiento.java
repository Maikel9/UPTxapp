package com.maikel.uptxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Recursamiento extends AppCompatActivity {

    Button botinicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recursamiento);
        botinicio = findViewById(R.id.atras);
    }
    //boton inicio
    public void  inicio (View view){
        Intent inicio = new Intent(this,MainActivity.class);
        startActivity(inicio);
    }
}