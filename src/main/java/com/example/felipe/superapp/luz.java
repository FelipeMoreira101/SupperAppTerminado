package com.example.felipe.superapp;

public class luz{
    String cor = "rosa";
    Integer Ligado = 0;

    public void MudarCor(String cor2){
        this.cor = cor2;
    }
    public void Ligar(){
        this.Ligado = 1;
    }
    public void Desligar(){
        this.Ligado = 0;
    }
}

