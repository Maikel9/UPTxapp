package com.maikel.uptxapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button boton1;
    ImageView salir, ayuda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        salir = findViewById(R.id.imageViewSalir);
        boton1 = findViewById(R.id.button1);
        ayuda = findViewById(R.id.imageViewAyuda);

        //Cambio de color de Status Bar

    }
    //metodos

    public void tramite1 (View view){
        Toast.makeText(this, "Solicitud de recuperacion final", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Solicitudderecuperacionfinal.class);
        startActivity(intent);
    }
    public void tramite2 (View view){
        Toast.makeText(this, "Solicitud de constancia de estudios", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Activity1.class);
        startActivity(intent);
    }
    public void tramite3 (View view){
        Toast.makeText(this, "Solicitud de beca de excelente", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
    public void tramite4 (View view){
        Toast.makeText(this, "Solicitud de beca de excelente", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, BajaMateria.class);
        startActivity(intent);
    }
    public void tramite5 (View view){
        Toast.makeText(this, "Solicitud de beca de excelente", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, BajaDefinitiva.class);
        startActivity(intent);
    }
    public void tramite6 (View view){
        Toast.makeText(this, "Solicitud de beca de excelente", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Recursamiento.class);
        startActivity(intent);
    }
    public void tramite7 (View view){
        Toast.makeText(this, "Solicitud de beca de excelente", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Pago_de_inscripcion.class);
        startActivity(intent);
    }
    public void tramite8 (View view){
        Toast.makeText(this, "Solicitud de beca de excelente", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Solicitud_de_baja_tem.class);
        startActivity(intent);
    }    public void desarrolladores (View view){
        Toast.makeText(this, "Desarrolladores", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Desarrolladores.class);
        startActivity(intent);
    }
    public void salirApp(View view){
        Toast.makeText(this, "Saliste de la app", Toast.LENGTH_SHORT).show();
        finishAffinity();
    }

    //alertdialog
    public void info(View view){
        AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
        alerta.setMessage("Solo da clic en el boton del tramite que quieres realizar, recuerda que esta app es informativa, asi que no tienes que registrarte o iniciar sesión")
                .setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog titulo = alerta.create();
        titulo.setTitle("Mas informacion");
        titulo.show();
    }



}