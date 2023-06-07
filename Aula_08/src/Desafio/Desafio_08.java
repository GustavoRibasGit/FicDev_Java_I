package Desafio;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Desafio_08 { 
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Usuário 111\\OneDrive\\Documents\\NetBeansProjects\\Aula_08\\src\\Desafio/Test.txt"));
        
        String sCurrentLine;
        
        while ((sCurrentLine = br.readLine()) != null){
        
        System.out.println(sCurrentLine);
        }
    }    
}
