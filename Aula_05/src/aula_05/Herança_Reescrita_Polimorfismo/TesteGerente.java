package aula_05.Herança_Reescrita_Polimorfismo;
public class TesteGerente {
    
    public static void main(String[] args) {
        
    Gerente gerente = new Gerente();
    gerente.setNome("João da Silva");
    gerente.setSenha(4231);
    gerente.setSalario(1000.0);
    
    System.out.println("Seu salario com a bonificação aplicada é: " + gerente.getBonificacao());
    
    }
}

