package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class pregunta2 extends AppCompatActivity {

    RadioGroup opciones;
    boolean    respuesta1 = false;
    boolean    respuesta2 = false;
    Button     BTNsiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta2);


        respuesta1    = getIntent().getBooleanExtra("respuesta1",respuesta1);
        opciones      = (RadioGroup) findViewById(R.id.RGrespuestas2);
        BTNsiguiente  = (Button) findViewById(R.id.BTNsiguiente2);
        int seleccion = opciones.getCheckedRadioButtonId();

        switch(seleccion) {
            case R.id.RBrespuesta21:
                Toast.makeText(pregunta2.this, "Elegiste la opción 1 " , Toast.LENGTH_SHORT).show();
                break;
            case R.id.RBrespuesta22:
                Toast.makeText(pregunta2.this, "Elegiste la opción 2 " , Toast.LENGTH_SHORT).show();
                respuesta2 = true;
                break;
            case R.id.RBrespuesta23:
                Toast.makeText(pregunta2.this, "Elegiste la opción 3 " , Toast.LENGTH_SHORT).show();
                break;
            case R.id.RBrespuesta24:
                Toast.makeText(pregunta2.this, "Elegiste la opción 4 " , Toast.LENGTH_SHORT).show();

                break;
            case R.id.RBrespuesta25:
                Toast.makeText(pregunta2.this, "Elegiste la opción 5 " , Toast.LENGTH_SHORT).show();
                break;
        }

        BTNsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguientePregunta = new Intent(pregunta2.this, pregunta3.class );
                siguientePregunta.putExtra("respuesta1", respuesta1);
                siguientePregunta.putExtra("respuesta2", respuesta2);
                startActivity(siguientePregunta);
            }
        });

    }
}