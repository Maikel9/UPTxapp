package com.maikel.uptxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BajaDefinitiva extends AppCompatActivity {

    TextView uni, tramite, contenido;
    ImageView imagenti, imagenupt;
    Button botinicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baja_definitiva);
        tramite = findViewById(R.id.tramite);
        contenido = findViewById(R.id.contenido);
        botinicio = findViewById(R.id.atras);
    }
    //boton inicio
    public void  inicio (View view){
        Intent inicio = new Intent(this,MainActivity.class);
        startActivity(inicio);
    }
}