package com.kevinulquiango.preguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private RadioButton respuesta1,respuesta2,respuesta3,respuesta4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ocultar actionbar
        getSupportActionBar().hide();
    }

    //Metodo
    public void siguiente(View view){
        Intent siguiente = new Intent(this,pregunta1.class);
        startActivity(siguiente);
    }
}