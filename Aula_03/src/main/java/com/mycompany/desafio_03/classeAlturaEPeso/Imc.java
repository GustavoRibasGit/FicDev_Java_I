package com.mycompany.desafio_03.classeAlturaEPeso;
public class Imc {
    
    private double peso;
    private double altura;
    
    public Imc (double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }
    
    public double CalcularIMC (){
        return this.peso / (this.altura * this.altura); 
    }
    
}
