package aula_05.ExercicioCarro;
public class Carro {
    
    public String modelo;
    protected int ano;
    private String fabricante;
    
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public String getfabricante() {
        return this.fabricante;
    }
}