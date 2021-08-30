package com.kevinulquiango.preguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class resultado extends AppCompatActivity {
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        //ocultar actionbar
        getSupportActionBar().hide();
        resultado = findViewById(R.id.tv_resultado);
        int contador = getIntent().getIntExtra("contador",0);
        resultado.setText(String.valueOf(contador));
    }
    //Metodo
    public void siguiente(View view){

        Intent siguiente = new Intent(this,MainActivity.class);
        startActivity(siguiente);

    }
}