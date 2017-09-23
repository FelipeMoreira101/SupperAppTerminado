package com.example.felipe.superapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class conversor extends AppCompatActivity {

    Spinner sp1;
    EditText val1;
    TextView res;
    Button verificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);
        sp1       = (Spinner) findViewById(R.id.sp1);
        val1      = (EditText) findViewById(R.id.edt1);
        res       = (TextView) findViewById(R.id.res);
        verificar = (Button) findViewById(R.id.verificar);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.conversor_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp1.setAdapter(adapter);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> spinner, View arg1,int pos, long id) {
                switch(pos){
                    case (1):
                        verificar.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view){
                                Double va1, ver;
                                va1 = Double.parseDouble(val1.getText().toString().trim());
                                ver = va1 * 3.12;

                                res.setText(ver.toString());
                            }
                        });
                        break;
                    case (2):
                        verificar.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view){
                                Double va1, ver;
                                va1 = Double.parseDouble(val1.getText().toString().trim());
                                ver = va1 * 1000;

                                res.setText(ver.toString());
                            }
                        });
                        break;
                    case (3):
                        verificar.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view){
                                Double va1, ver;
                                va1 = Double.parseDouble(val1.getText().toString().trim());
                                ver = va1 + 273.15;

                                res.setText(ver.toString());
                            }
                        });
                        break;
                    case (4):
                        verificar.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view){
                                Double va1, ver;
                                va1 = Double.parseDouble(val1.getText().toString().trim());
                                ver = va1 * 100;

                                res.setText(ver.toString());
                            }
                        });
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> spinner) {
            }
        });
    }
}