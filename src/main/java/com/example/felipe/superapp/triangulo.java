package com.example.felipe.superapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class triangulo extends AppCompatActivity {

    EditText l1, l2, l3;
    TextView result;
    Button verificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        l1        = (EditText) findViewById(R.id.l1);
        l2        = (EditText) findViewById(R.id.l2);
        l3        = (EditText) findViewById(R.id.l3);
        verificar = (Button) findViewById(R.id.verificar);
        result    = (TextView) findViewById(R.id.result);
    }

    public void calcTriangulo(View view){
        Float la1, la2, la3;
        la1 = Float.parseFloat(l1.getText().toString().trim());
        la2 = Float.parseFloat(l2.getText().toString().trim());
        la3 = Float.parseFloat(l3.getText().toString().trim());

        if ((la1 >=(la2+la3)) || (la2>= (la1 + la3)) || (la3 >= (la1+la2))){
            result.setText("Medidas não formam um triângulo");
        }else {
            if (la1.equals(la2) && la1.equals(la3)){
                result.setText("O Triângulo é equilatero e/ou isoceles");
            }else {
                if ((!la1.equals(la2)) && (!la1.equals(la3)) && (!la2.equals(la3))) {
                    result.setText("O Triângulo é escaleno");
                }else {
                    if ( (la1.equals(la2)) || (la1.equals(la3)) || (la2.equals(la3)) ) {
                        result.setText("O Triângulo é isoceles");
                    } else {
                        result.setText("Medidas nao formam um triângulo");
                    }
                }
            }
        }
    }
}