package Exercicio03;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class EntradaSaida {
    public static double pedirSalario(String salarioInvalido){
        return Double.parseDouble(JOptionPane.showInputDialog(salarioInvalido + "Digite o valor do seu salário: "));
    }

    public static double pedirValorEmprestado(String valorMuitoAlto){
        return Double.parseDouble(JOptionPane.showInputDialog(valorMuitoAlto + "Digite o valor desejado: "));
    }

    public static void mostrarValores(double valorTotalEmprestimo, double valorParcela){
        DecimalFormat df = new DecimalFormat("#,###.00");

        JOptionPane.showMessageDialog(null, "O empréstimo pode ser relizado! \n" +
        "O valor da parcela será R$" + df.format(valorParcela) + "\n" +
        "E o valor total a ser pago no prazo de 24 meses é de R$" + df.format(valorTotalEmprestimo));
    }

    public static void mostrarMensagem(){
        JOptionPane.showMessageDialog(null, "O empréstimo não pode ser realizado =/");
    }
}
