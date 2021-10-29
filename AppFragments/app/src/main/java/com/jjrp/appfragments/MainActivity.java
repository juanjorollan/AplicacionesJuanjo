package com.jjrp.appfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements EnviarMensaje{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarDato(String dato){
        FragmentoB fb= (FragmentoB) getSupportFragmentManager().findFragmentById(R.id.fragmentBcontainer);
        fb.recibir(dato);
    }

}