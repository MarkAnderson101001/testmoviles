package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class pregunta4 extends AppCompatActivity {

    RadioGroup opciones;
    boolean    respuesta1 = false;
    boolean    respuesta2 = false;
    boolean    respuesta3 = false;
    boolean    respuesta4 = false;
    Button     BTNsiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta4);


        respuesta1    = getIntent().getBooleanExtra("respuesta1",respuesta1);
        respuesta2    = getIntent().getBooleanExtra("respuesta2",respuesta2);
        respuesta3    = getIntent().getBooleanExtra("respuesta3",respuesta3);
        opciones      = (RadioGroup) findViewById(R.id.RGrespuestas4);
        BTNsiguiente  = (Button) findViewById(R.id.BTNsiguiente4);
        int seleccion = opciones.getCheckedRadioButtonId();

        switch(seleccion) {
            case R.id.RBrespuesta41:
                Toast.makeText(pregunta4.this, "Elegiste la opción 1 " , Toast.LENGTH_SHORT).show();
                break;
            case R.id.RBrespuesta42:
                Toast.makeText(pregunta4.this, "Elegiste la opción 2 " , Toast.LENGTH_SHORT).show();
                break;
            case R.id.RBrespuesta43:
                Toast.makeText(pregunta4.this, "Elegiste la opción 3 " , Toast.LENGTH_SHORT).show();
                respuesta4 = true;
                break;
            case R.id.RBrespuesta44:
                Toast.makeText(pregunta4.this, "Elegiste la opción 4 " , Toast.LENGTH_SHORT).show();

                break;
            case R.id.RBrespuesta45:
                Toast.makeText(pregunta4.this, "Elegiste la opción 5 " , Toast.LENGTH_SHORT).show();
                break;
        }

        BTNsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguientePregunta = new Intent(pregunta4.this, pregunta5.class );
                siguientePregunta.putExtra("respuesta1", respuesta1);
                siguientePregunta.putExtra("respuesta2", respuesta2);
                siguientePregunta.putExtra("respuesta3", respuesta3);
                siguientePregunta.putExtra("respuesta4", respuesta4);
                startActivity(siguientePregunta);
            }
        });

    }
}