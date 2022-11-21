package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class pregunta5 extends AppCompatActivity {

    RadioGroup opciones;
    boolean    respuesta1 = false;
    boolean    respuesta2 = false;
    boolean    respuesta3 = false;
    boolean    respuesta4 = false;
    boolean    respuesta5 = false;
    Button     BTNsiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta5);


        respuesta1    = getIntent().getBooleanExtra("respuesta1",respuesta1);
        respuesta2    = getIntent().getBooleanExtra("respuesta2",respuesta2);
        respuesta3    = getIntent().getBooleanExtra("respuesta3",respuesta3);
        respuesta4    = getIntent().getBooleanExtra("respuesta4",respuesta4);
        opciones      = (RadioGroup) findViewById(R.id.RGrespuestas5);
        BTNsiguiente  = (Button) findViewById(R.id.BTNsiguiente5);
        int seleccion = opciones.getCheckedRadioButtonId();

        switch(seleccion) {
            case R.id.RBrespuesta51:
                Toast.makeText(pregunta5.this, "Elegiste la opción 1 " , Toast.LENGTH_SHORT).show();
                break;
            case R.id.RBrespuesta52:
                Toast.makeText(pregunta5.this, "Elegiste la opción 2 " , Toast.LENGTH_SHORT).show();
                break;
            case R.id.RBrespuesta53:
                Toast.makeText(pregunta5.this, "Elegiste la opción 3 " , Toast.LENGTH_SHORT).show();
                break;
            case R.id.RBrespuesta54:
                Toast.makeText(pregunta5.this, "Elegiste la opción 4 " , Toast.LENGTH_SHORT).show();
                respuesta5 = true;
                break;
            case R.id.RBrespuesta55:
                Toast.makeText(pregunta5.this, "Elegiste la opción 5 " , Toast.LENGTH_SHORT).show();
                break;
        }

        BTNsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguientePregunta = new Intent(pregunta5.this, MainActivity.class );
                siguientePregunta.putExtra("respuesta1", respuesta1);
                siguientePregunta.putExtra("respuesta2", respuesta2);
                siguientePregunta.putExtra("respuesta3", respuesta3);
                siguientePregunta.putExtra("respuesta4", respuesta4);
                siguientePregunta.putExtra("respuesta5", respuesta5);
                startActivity(siguientePregunta);
            }
        });

    }
}