package aula_05.ExercicioCarro;
public class TesteCarro {
    
    public static void main(String[] args) {
        
        Carro carro = new Carro();
        carro.modelo = "Sedan";
        carro.ano = 2001;
        carro.setFabricante("Ford");
        
        CarroEsportivo esportivo = new CarroEsportivo();
        esportivo.modelo = "Esportivo";
        esportivo.ano = 2003;
    }
}
