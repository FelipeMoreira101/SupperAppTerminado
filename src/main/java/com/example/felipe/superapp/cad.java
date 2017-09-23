package com.example.felipe.superapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import static com.example.felipe.superapp.R.layout.activity_cad;

public class cad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_cad);

        final EditText nome = (EditText)    findViewById(R.id.nome);
        Button      vai     = (Button)      findViewById(R.id.btnVai);

        vai.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(cad.this, login.class);
                intent.putExtra("nomePessoa", nome.getText().toString());
                startActivity(intent);
            }
        });
    }
}
