package com.maikel.uptxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Desarrolladores extends AppCompatActivity {
    Button atras;
    MediaPlayer mpsylas, mpekko, mpashe, mpvi;
    ImageView btnsylas, btnekko, btnashe, btnvi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desarrolladores);
        atras = findViewById(R.id.atrasD);
        btnsylas = findViewById(R.id.sylas);
        btnekko = findViewById(R.id.ekko);
        btnashe = findViewById(R.id.ashe);
        btnvi = findViewById(R.id.vi);
        mpsylas = MediaPlayer.create(this, R.raw.sylasaudio);
        mpekko = MediaPlayer.create(this, R.raw.ekkoaudio);
        mpashe = MediaPlayer.create(this, R.raw.asheaudio);
        mpvi = MediaPlayer.create(this, R.raw.viaudio);
    }
    public void audiosylas(View view){
        mpsylas.start();
    }
    public void audioekko(View view){
        mpekko.start();
    }
    public void audioashe(View view){
        mpashe.start();
    }
    public void audiovi(View view){
        mpvi.start();
    }
    public void regresarD(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}