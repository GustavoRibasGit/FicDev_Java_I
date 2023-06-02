package aula_05.Herança_Reescrita_Polimorfismo;
public class Gerente extends Funcionario {
    
    private int senha;
    private int numeroDeFuncionariosGerenciados;
    
    public boolean autentica (int senha){
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            
            return true;
        }
        
        else {
            System.out.println("Acesso Negado!");
            
            return false;
        }
    }
    
    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public int getSenha(){
        return this.senha;
    }
    
     public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
    
    public int getnumeroDeFuncionariosGerenciados(){
        return this.numeroDeFuncionariosGerenciados;
    }
    
    
    @Override
    public double getBonificacao(){
        return super.getBonificacao() + getSalario();
    }
}
