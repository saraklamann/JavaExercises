import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00"); //define o formato

        //coleta de dados
        String nome = JOptionPane.showInputDialog("Informe seu nome");
        String mes = JOptionPane.showInputDialog("Informe o mês");

        double SALARIO = 1500; //constante

        //coleta de dados        
        int carrosVendidos = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de carros vendidos este mês"));
        double valorVendido = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total das vendas deste mês"));

        //cálculos
        double comissao = 350 * carrosVendidos;
        double PORCENTAGEM_BONIFICACAO_DAS_VENDAS = (0.001 / 100); //constante
        double BONIFICACAO_DAS_VENDAS = PORCENTAGEM_BONIFICACAO_DAS_VENDAS * valorVendido;
        double salarioTotal = (comissao + BONIFICACAO_DAS_VENDAS + SALARIO);

        //sáida de daod
        JOptionPane.showMessageDialog(null,"No mês de " + mes
        + " o  vendedor " + nome
        + " vendeu " + carrosVendidos + " carros "
        + " ganhando assim R$" + df.format(comissao) + " reais de comissão sob vendas"
        + " e também R$" + BONIFICACAO_DAS_VENDAS + " reais de bonificação das vendas"
        + " sendo assim, o salário total do colaborador " + nome + " foi de " + df.format(salarioTotal));
    }
}
