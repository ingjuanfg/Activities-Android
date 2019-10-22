package com.isfggmail.juan.interaccion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ContenedorTres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_tres);
    }

    public void regresarActividadDos(View vista){
        Intent intencion = new Intent(this, ContenedorDos.class);
        startActivity(intencion);
    }

    public void regresarActividadUno(View vista){
        Intent intencion = new Intent(this, MainActivity.class);
        startActivity(intencion);
    }
}