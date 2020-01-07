package com.example.desafiobancoestado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MetodoPago2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metodo_pago2);
    }

    public void contactless(View view){
        Intent i = new Intent(this, SinContactoActivity.class);
        startActivity(i);
    }
}
