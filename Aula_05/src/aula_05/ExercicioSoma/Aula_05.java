package aula_05.ExercicioSoma;
public class Aula_05 {

    public static void soma (int x, int y){
            
        int resultado = x + y;
            
        System.out.println("Resultado da soma: " + resultado);
            
        x = 0;
            
        System.out.println("Valor do x dentro do método: " + x); 
        }
    
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        
        System.out.println("Antes de chamar o metodo: ");
        System.out.println("a = " + a + ", b = " + b);
        
        soma(a, b);
        
        System.out.println("Depois de chamar o metodo Soma: ");
        System.out.println("a = " + a + ", b = " + b);  
    }    
}
