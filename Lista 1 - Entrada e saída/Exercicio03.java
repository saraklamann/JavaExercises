import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#,###.00"); //define formato

        double valorCompra, valorImpostos, valorRepresentante, valorVenda;

        valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da compra: ")); //coleta do dado
        valorImpostos = valorCompra * 0.3;
        valorRepresentante = valorCompra * 0.2;
        valorVenda = valorCompra + valorRepresentante + valorImpostos; //cálcula o valor total

        //mostra os valores inviduais e o valor de venda
        JOptionPane.showMessageDialog(null,"O valor para impostos é R$" + df.format(valorImpostos) + "\n"
        + "O valor para o representante é R$" + df.format(valorRepresentante) + "\n"
        + "O valor de venda é R$" + df.format(valorVenda));


    }
}
