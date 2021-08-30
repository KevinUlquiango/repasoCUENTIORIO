package com.kevinulquiango.preguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class pregunta3 extends AppCompatActivity {
    private RadioButton respuesta1,respuesta2,respuesta3,respuesta4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3);
        //ocultar actionbar
        getSupportActionBar().hide();
        respuesta1 = findViewById(R.id.rb_pregunta1);
        respuesta2 = findViewById(R.id.rb_pregunta2);
        respuesta3 = findViewById(R.id.rb_pregunta3);
        respuesta4 = findViewById(R.id.rb_pregunta4);

    }
    //Metodo
    public void siguiente(View view){
       if(
               !respuesta1.isChecked() &&
               !respuesta2.isChecked() &&
               !respuesta3.isChecked() &&
               !respuesta4.isChecked()
       ){
           Toast.makeText(this,"Tienes que responder la pregunta",Toast.LENGTH_SHORT).show();
       }else{

           int contador = getIntent().getIntExtra("contador",0);
           int valor = validar();
           valor += contador;
           Intent siguiente = new Intent(this,resultado.class);
           siguiente.putExtra("contador",valor);
           startActivity(siguiente);
       }

    }
    public int validar() {
        int contador = 0;
        if (respuesta1.isChecked()) {
            contador = 1;
        } else if (respuesta2.isChecked()) {
            contador = 0;
        } else if (respuesta3.isChecked()) {
            contador = 0;
        } else if (respuesta4.isChecked()) {
            contador = 0;
        }
    return contador;
    }
}