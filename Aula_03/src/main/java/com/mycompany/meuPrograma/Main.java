package com.mycompany.meuPrograma;
import com.mycompany.geometria.Retangulo;
public class Main {
    
    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo(5, 10);
        
        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();
        
        System.out.println("Área do retângulo " + area);
        System.out.println("Perímetro do retângulo: " + perimetro);
    }
}
