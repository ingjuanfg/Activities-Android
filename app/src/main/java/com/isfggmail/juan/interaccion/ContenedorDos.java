package com.isfggmail.juan.interaccion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ContenedorDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_dos);
        Bundle datoRecibido = getIntent().getExtras();

        TextView etiqMostrar = (TextView)findViewById(R.id.mostrar_text_2);
        etiqMostrar.setText( datoRecibido.getString("datoActividadAnterior"));

    }

    public void regresarUno(View vista){
        Intent intencion = new Intent(this, MainActivity.class);
        startActivity(intencion);

    }

    public void abrirTres(View vista){
        Intent intencion = new Intent(this, ContenedorTres.class);
        startActivity(intencion);

    }
}