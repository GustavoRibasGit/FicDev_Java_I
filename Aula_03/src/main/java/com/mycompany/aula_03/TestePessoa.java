package com.mycompany.aula_03;
public class TestePessoa {
    public static void main(String[] args){
        
        Pessoa p1 = new Pessoa();
        
        p1.setNome("Gustavo");
        p1.setIdade(19);
        
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
    }
}
