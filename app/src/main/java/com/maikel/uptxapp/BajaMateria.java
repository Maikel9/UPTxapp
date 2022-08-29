package com.maikel.uptxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class BajaMateria extends AppCompatActivity {
    Button atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baja_materia);
        atras=findViewById(R.id.atras);
    }
    //boton atras
    public void anterior (View view){
        Intent atras = new Intent(this,MainActivity.class);
        startActivity(atras);
    }

}