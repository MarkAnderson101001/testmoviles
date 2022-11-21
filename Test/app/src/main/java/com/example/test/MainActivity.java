package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int        calificacion = 0;
    boolean    respuesta1 = false;
    boolean    respuesta2 = false;
    boolean    respuesta3 = false;
    boolean    respuesta4 = false;
    boolean    respuesta5 = false;

    TextView   txtrespuesta1;
    TextView   txtrespuesta2;
    TextView   txtrespuesta3;
    TextView   txtrespuesta4;
    TextView   txtrespuesta5;
    TextView   txtcalificacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        respuesta1      = getIntent().getBooleanExtra("respuesta1",respuesta1);
        respuesta2      = getIntent().getBooleanExtra("respuesta2",respuesta2);
        respuesta3      = getIntent().getBooleanExtra("respuesta3",respuesta3);
        respuesta4      = getIntent().getBooleanExtra("respuesta4",respuesta4);
        respuesta5      = getIntent().getBooleanExtra("respuesta5",respuesta5);
        txtrespuesta1   = (TextView) findViewById(R.id.txtrespuesta1);
        txtrespuesta2   = (TextView) findViewById(R.id.txtrespuesta2);
        txtrespuesta3   = (TextView) findViewById(R.id.txtrespuesta3);
        txtrespuesta4   = (TextView) findViewById(R.id.txtrespuesta4);
        txtrespuesta5   = (TextView) findViewById(R.id.txtrespuesta5);
        txtcalificacion = (TextView) findViewById(R.id.txtcalificacion);

        if(respuesta1){
            txtrespuesta1.setText(R.string.correcta);
            calificacion = calificacion + 2;
        }

        if(respuesta2){
            txtrespuesta2.setText(R.string.correcta);
            calificacion = calificacion + 2;
        }

        if(respuesta3){
            txtrespuesta3.setText(R.string.correcta);
            calificacion = calificacion + 2;
        }

        if(respuesta4){
            txtrespuesta4.setText(R.string.correcta);
            calificacion = calificacion + 2;
        }

        if(respuesta5){
            txtrespuesta5.setText(R.string.correcta);
            calificacion = calificacion + 2;
        }


        switch(calificacion) {
            case 0:
                txtcalificacion.setText(R.string.calif0);
                break;
            case 2:
                txtcalificacion.setText(R.string.calif2);
                break;
            case 4:
                txtcalificacion.setText(R.string.calif4);
                break;
            case 6:
                txtcalificacion.setText(R.string.calif6);
                break;
            case 8:
                txtcalificacion.setText(R.string.calif8);
                break;
            case 10:
                txtcalificacion.setText(R.string.calif10);
                break;

        }
    }
}