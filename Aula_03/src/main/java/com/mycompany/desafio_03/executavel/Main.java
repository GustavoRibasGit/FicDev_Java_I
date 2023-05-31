package com.mycompany.desafio_03.executavel;
import com.mycompany.desafio_03.classeAlturaEPeso.Imc;
public class Main {
    
    public static void main(String[] args) {
        
       Imc imc = new Imc(53.0, 1.80); 
        
       double resIMC = imc.CalcularIMC();
       
       System.out.printf("O resultado do imc é: %.2f", resIMC);
    }
}
