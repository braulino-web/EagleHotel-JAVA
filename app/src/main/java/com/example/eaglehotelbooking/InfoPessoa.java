package com.example.eaglehotelbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InfoPessoa extends AppCompatActivity {
EditText edNome, edUser, edSenha, edEmail, edCPF, edRG, edTelefone, edCelular, edDataNasc, edNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_pessoa);
        Button btCadastrar = findViewById(R.id.btCadastrar);
        edNome = findViewById(R.id.edNome);
        edUser = findViewById(R.id.edUser);
        edSenha = findViewById(R.id.edSenha);
        edEmail = findViewById(R.id.edEmail);
        edCPF = findViewById(R.id.edCPF);
        edRG = findViewById(R.id.edRG);
        edCelular = findViewById(R.id.edCelular);
        edTelefone = findViewById(R.id.edTelefone);
        edDataNasc = findViewById(R.id.edDataNasc);
        edNum = findViewById(R.id.edNum);

        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InfoPessoa.this, InfoRoomActivity.class);
                i.putExtra("nome",edNome.getText().toString());
                i.putExtra("usuario",edUser.getText().toString());
                i.putExtra("senha",edSenha.getText().toString());
                i.putExtra("email",edEmail.getText().toString());
                i.putExtra("cpf",edCPF.getText().toString());
                i.putExtra("rg",edRG.getText().toString());
                i.putExtra("telefone",edTelefone.getText().toString());
                i.putExtra("celular",edCelular.getText().toString());
                i.putExtra("data",edDataNasc.getText().toString());
                i.putExtra("num",edNum.getText().toString());

                startActivity(i);
            }
        });
    }
}