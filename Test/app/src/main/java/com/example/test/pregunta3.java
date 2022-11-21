package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class pregunta3 extends AppCompatActivity {

    RadioGroup opciones;
    boolean    respuesta1 = false;
    boolean    respuesta2 = false;
    boolean    respuesta3 = false;
    Button     BTNsiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta3);


        respuesta1    = getIntent().getBooleanExtra("respuesta1",respuesta1);
        respuesta2    = getIntent().getBooleanExtra("respuesta2",respuesta2);
        opciones      = (RadioGroup) findViewById(R.id.RGrespuestas3);
        BTNsiguiente  = (Button) findViewById(R.id.BTNsiguiente3);
        int seleccion = opciones.getCheckedRadioButtonId();

        switch(seleccion) {
            case R.id.RBrespuesta31:
                Toast.makeText(pregunta3.this, "Elegiste la opción 1 " , Toast.LENGTH_SHORT).show();
                break;
            case R.id.RBrespuesta32:
                Toast.makeText(pregunta3.this, "Elegiste la opción 2 " , Toast.LENGTH_SHORT).show();
                break;
            case R.id.RBrespuesta33:
                Toast.makeText(pregunta3.this, "Elegiste la opción 3 " , Toast.LENGTH_SHORT).show();
                break;
            case R.id.RBrespuesta34:
                Toast.makeText(pregunta3.this, "Elegiste la opción 4 " , Toast.LENGTH_SHORT).show();

                break;
            case R.id.RBrespuesta35:
                Toast.makeText(pregunta3.this, "Elegiste la opción 5 " , Toast.LENGTH_SHORT).show();
                respuesta3 = true;
                break;
        }

        BTNsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguientePregunta = new Intent(pregunta3.this, pregunta4.class );
                siguientePregunta.putExtra("respuesta1", respuesta1);
                siguientePregunta.putExtra("respuesta2", respuesta2);
                siguientePregunta.putExtra("respuesta3", respuesta3);
                startActivity(siguientePregunta);
            }
        });

    }
}