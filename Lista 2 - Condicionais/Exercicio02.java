import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        double TAXA_DESCONTO = 0.1; //constante
        double valorUnitario = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor unitário do produto: "));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada: "));
        double valorFinal;

        //validação do valor do produto
        while (valorUnitario <= 0) {
            valorUnitario = Double.parseDouble(JOptionPane.showInputDialog("Valor inválido! Insira o valor unitário do produto: "));
        }
        
        //cálculo do valor final
        if (quantidade > 12) {
            double descontoTotal = (TAXA_DESCONTO * quantidade * valorUnitario);
            valorFinal = (valorUnitario * quantidade) - descontoTotal;
        } else {
            valorFinal = valorUnitario * quantidade;
        }

        JOptionPane.showMessageDialog(null, "O valor da sua compra é R$" + valorFinal);
    }
}
