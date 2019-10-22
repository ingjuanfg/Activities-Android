package com.isfggmail.juan.interaccion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirActividadDos(View vista){
        EditText datoActUno = (EditText)findViewById(R.id.insertar_text_1);
        String valor = datoActUno.getText().toString();
        Intent intencion = new Intent(this, ContenedorDos.class);

        intencion.putExtra("datoActividadAnterior", valor);

        startActivity(intencion);
    }

    public void abrirActividadTres(View vista){
        Intent intencion = new Intent(this, ContenedorTres.class);
        startActivity(intencion);

    }
}