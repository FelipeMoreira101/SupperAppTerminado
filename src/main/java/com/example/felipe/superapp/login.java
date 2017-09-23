package com.example.felipe.superapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Intent intent     = getIntent();
        String parametro  = (String) intent.getSerializableExtra("nomePessoa");

        TextView nome = (TextView) findViewById(R.id.txtNome);
        nome.setText(parametro);
    }
}
