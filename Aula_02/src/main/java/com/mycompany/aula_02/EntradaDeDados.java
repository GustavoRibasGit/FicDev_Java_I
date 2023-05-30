package com.mycompany.aula_02;
import java.util.Scanner;
public class EntradaDeDados {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
            String nome = input.nextLine();
        
        System.out.println("Digite sua idade: ");
            int idade = input.nextInt();
            
        System.out.println("O seu nome é " + nome + " e a sua idade é " + idade + " anos.");
    }
}
