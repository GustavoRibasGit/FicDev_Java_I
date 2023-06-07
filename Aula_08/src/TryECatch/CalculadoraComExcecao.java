package TryECatch;
import javax.swing.JOptionPane;

public class CalculadoraComExcecao {
    public static void main(String[] args) {
        int a, b, resultado;
        Object[] opcoes = {"Adição", "Subtração", "Multiplicação", "Divisão"};

        try {
            a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
            b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

            Object selectedValue = JOptionPane.showInputDialog(null, "Escolha uma opção", "Escolha", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

            switch (selectedValue.toString()) {
                case "Adição":
                    resultado = a + b;
                    JOptionPane.showMessageDialog(null, "Voce selecionou a operacão de Adição:\n Resultado: " + resultado);
                    break;
                case "Subtração":
                    resultado = a - b;
                    JOptionPane.showMessageDialog(null, "Voce selecionou a operacão de Subtração:\n Resultado: " + resultado);
                    break;
                case "Multiplicação":                    
                    resultado = a * b;
                    JOptionPane.showMessageDialog(null, "Voce selecionou a operacao de Multiplicação:\n Resultado: " + resultado);
                    break;
                case "Divisão":                  
                    resultado = a / b;
                    JOptionPane.showMessageDialog(null, "Voce selecionou a operacao de Divisão:\n Resultado: " + resultado);
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Você não digitou um número válido.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível realizar a operação.");
        }
    }
}
