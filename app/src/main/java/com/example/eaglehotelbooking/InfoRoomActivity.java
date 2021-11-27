package com.example.eaglehotelbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class InfoRoomActivity extends AppCompatActivity {

    Calendar myCalendar;
    EditText checkin, edcheckout;
    Spinner spinnerType;
    Button btVisualizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_room);

        Intent i=getIntent();

        String nome, usuario, senha, email, cpf, rg, telefone, celular, datanasc, num;

        nome = i.getStringExtra("nome");
        usuario = i.getStringExtra("usuario");
        senha = i.getStringExtra("senha");
        email = i.getStringExtra("email");
        cpf = i.getStringExtra("cpf");
        rg = i.getStringExtra("rg");
        telefone = i.getStringExtra("telefone");
        celular = i.getStringExtra("celular");
        datanasc = i.getStringExtra("data");
        num = i.getStringExtra("num");




       Calendar myCalendar = Calendar.getInstance();

        checkin = (EditText) findViewById(R.id.checkin);
        edcheckout = (EditText) findViewById(R.id.checkout);
        spinnerType = findViewById(R.id.spinnerType);
        btVisualizar = findViewById(R.id.btVisualizar);
        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, month);
                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                updateLabel();
            }
        };

        checkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new DatePickerDialog(InfoRoomActivity.this, date, myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
    }

    private void updateLabel() {
        String myFormat = "MM/dd/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        checkin.setText(sdf.format(myCalendar.getTime()));
    }

}