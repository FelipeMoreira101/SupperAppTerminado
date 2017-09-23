package com.example.felipe.superapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class lampada extends AppCompatActivity {

    luz luz;
    TextView Lampad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lampada);
        luz = new luz();
        Lampad = (TextView)findViewById(R.id.Lampad);
    }

    public void BotaoAzul(View v){
        luz.MudarCor("azul");
        definirCor();
    }
    public void BotaoVerde(View v){
        luz.MudarCor("verde");
        definirCor();
    }
    public void BotaoVermelho(View v){
        luz.MudarCor("vermelho");
        definirCor();
    }
    public void BotaoMarrom(View v){
        luz.MudarCor("marrom");
        definirCor();
    }
    public void BotaoLaranja(View v){
        luz.MudarCor("laranja");
        definirCor();
    }
    public void BotaoAmarelo(View v){
        luz.MudarCor("amarelo");
        definirCor();
    }
    public void BotaoRoxo(View v){
        luz.MudarCor("roxo");
        definirCor();
    }
    public void BotaoBranco(View v){
        luz.MudarCor("branco");
        definirCor();
    }

    public void definirCor(){
        if(luz.Ligado == 1){
            switch (luz.cor){
                case "azul": Lampad.setTextColor(Color.BLUE); break;
                case "verde": Lampad.setTextColor(Color.GREEN); break;
                case "vermelho": Lampad.setTextColor(Color.RED); break;
                case "marrom": Lampad.setTextColor(Color.rgb(189,83,107)); break;
                case "laranja": Lampad.setTextColor(Color.rgb(255,69,0)); break;
                case "amarelo": Lampad.setTextColor(Color.YELLOW); break;
                case "roxo": Lampad.setTextColor(Color.rgb(153,51,153)); break;
                case "branco": Lampad.setTextColor(Color.WHITE); break;
            }
        }else{
            Lampad.setTextColor(Color.GRAY);
        }
    }

    public void Alternar(View v){
        if(luz.Ligado == 0){
            luz.Ligar();
        }else{
            luz.Desligar();
        }
        this.definirCor();
    }
}
