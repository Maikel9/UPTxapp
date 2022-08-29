package com.maikel.uptxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Solicitudderecuperacionfinal extends AppCompatActivity {

    Button atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitudderecuperacionfinal);
        atras = findViewById(R.id.buttonsalir2);
    }
    public void regresar2(View view){
        Toast.makeText(this, "Estas en el inicio", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}