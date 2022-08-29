package com.maikel.uptxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pago_de_inscripcion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago_de_inscripcion);
    }
    public void  inicio (View view){
        Intent inicio = new Intent(this,MainActivity.class);
        startActivity(inicio);
    }
}