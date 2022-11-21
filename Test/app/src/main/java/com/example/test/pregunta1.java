package com.example.test;

import android.arch.lifecycle.ViewModelProvider;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class pregunta1 extends AppCompatActivity  {

    RadioGroup  opciones;
    boolean     respuesta = false;
    Button      BTNsiguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pregunta1);

        opciones      = (RadioGroup) findViewById(R.id.RGrespuestas1);
        BTNsiguiente  = (Button) findViewById(R.id.BTNsiguiente);
        int seleccion = opciones.getCheckedRadioButtonId();

        switch(seleccion) {
            case R.id.RBrespuesta11:
                Toast.makeText(pregunta1.this, "Elegiste la opción 1 " , Toast.LENGTH_SHORT).show();
                break;
            case R.id.RBrespuesta12:
                Toast.makeText(pregunta1.this, "Elegiste la opción 2 " , Toast.LENGTH_SHORT).show();
                break;
            case R.id.RBrespuesta13:
                Toast.makeText(pregunta1.this, "Elegiste la opción 3 " , Toast.LENGTH_SHORT).show();
                break;
            case R.id.RBrespuesta14:
                Toast.makeText(pregunta1.this, "Elegiste la opción 4 " , Toast.LENGTH_SHORT).show();
                respuesta = true;
                break;
            case R.id.RBrespuesta15:
                Toast.makeText(pregunta1.this, "Elegiste la opción 5 " , Toast.LENGTH_SHORT).show();
                break;
        }

        BTNsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguientePregunta = new Intent(pregunta1.this, pregunta2.class );
                siguientePregunta.putExtra("respuesta1", respuesta);
                startActivity(siguientePregunta);
            }
        });

    }
}