package com.maikel.uptxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Solicitud_de_baja_tem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitud_de_baja_tem);
    }
    public void  inicio (View view){
        Intent inicio = new Intent(this,MainActivity.class);
        startActivity(inicio);
    }
}