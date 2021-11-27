package com.example.eaglehotelbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnReserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnReserva = findViewById(R.id.btnReservar);
        btnReserva.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent i = new Intent(MainActivity.this, InfoPessoa.class);
                i.putExtra("info", "Quarto de Casal");
                startActivity(i);
            }
        });
    }
}