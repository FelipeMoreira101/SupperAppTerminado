package com.example.felipe.superapp;

import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RatingBar rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb    = (RatingBar)findViewById(R.id.estrelinhas);
    }
    public void verEstrelas(View view){

        int qntEstrelas = (int) rb.getRating();
        String message = null;

        switch (qntEstrelas){
            case 1: message = "Péssimo"; break;
            case 2: message = "Ruim"; break;
            case 3: message = "Médio"; break;
            case 4: message = "Bom"; break;
            case 5: message = "Ótimo"; break;
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void Vibrar(View v){
        Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        long milliseconds = 200;
        vibrator.vibrate(milliseconds);
    }
    public void cadastro(View view) {
        Intent intent = new Intent(MainActivity.this, cad.class);
        startActivity(intent);
    }
    public void sobre(View view) {
        Intent intent = new Intent(MainActivity.this, sobre.class);
        startActivity(intent);
    }
    public void triangulos(View view) {
        Intent intent = new Intent(MainActivity.this, triangulo.class);
        startActivity(intent);
    }
    public void calculadora(View view) {
        Intent intent = new Intent(MainActivity.this, calc.class);
        startActivity(intent);
    }
    public void lampadas(View view) {
        Intent intent = new Intent(MainActivity.this, lampada.class);
        startActivity(intent);
    }
    public void Conv(View view) {
        Intent intent = new Intent(MainActivity.this, conversor.class);
        startActivity(intent);
    }
    public void flash_light(View view) {
        Intent intent = new Intent(MainActivity.this, shine.class);
        startActivity(intent);
    }
}