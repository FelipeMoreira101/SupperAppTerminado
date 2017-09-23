package com.example.felipe.superapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calc extends AppCompatActivity {

    EditText n1, n2;
    TextView resultado;
    Button soma, sub, mult, div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        n1 = (EditText) findViewById(R.id.edtNum1);
        n2 = (EditText) findViewById(R.id.edtNum2);
        soma = (Button) findViewById(R.id.soma);
        sub = (Button) findViewById(R.id.sub);
        mult = (Button) findViewById(R.id.mult);
        div = (Button) findViewById(R.id.div);
        resultado = (TextView) findViewById(R.id.resultado);
    }
    public void Soma(View v){
        Float f1, f2, f3;
        f1 = Float.parseFloat(n1.getText().toString().trim());
        f2 = Float.parseFloat(n2.getText().toString().trim());

        f3 = f1 + f2;
        resultado.setText(f3.toString());
    }
    public void Subt(View v){
        Float f1, f2, f3;
        f1 = Float.parseFloat(n1.getText().toString().trim());
        f2 = Float.parseFloat(n2.getText().toString().trim());

        f3 = f1 - f2;
        resultado.setText(f3.toString());
    }
    public void Mult(View v){
        Float f1, f2, f3;
        f1 = Float.parseFloat(n1.getText().toString().trim());
        f2 = Float.parseFloat(n2.getText().toString().trim());

        f3 = f1 * f2;
        resultado.setText(f3.toString());
    }
    public void Div(View v){
        Float f1, f2, f3;
        f1 = Float.parseFloat(n1.getText().toString().trim());
        f2 = Float.parseFloat(n2.getText().toString().trim());

        f3 = f1 / f2;
        resultado.setText(f3.toString());
    }
}