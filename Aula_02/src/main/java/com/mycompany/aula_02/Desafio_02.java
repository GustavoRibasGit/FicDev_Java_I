package com.mycompany.aula_02;
import java.util.Scanner;
public class Desafio_02 {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o Primeiro Valor :");
            int valor1 = input.nextInt();
        
        System.out.println("Digite o Segundo Valor: ");
            int valor2 = input.nextInt();
            
        int res = valor1 + valor2;
        System.out.println("O Primeiro valor mais o segundo valor gera o resultado de: " + res);
    }
}