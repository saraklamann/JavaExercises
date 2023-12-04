package Exercicio02;

import javax.swing.JOptionPane;

public class EntradaSaida {
    public static double pedirSalario(String mensagem){
        return Double.parseDouble(JOptionPane.showInputDialog(mensagem + "Digite seu salário bruto: "));
    }

    public static int pedirHorasExtras(){
        return Integer.parseInt(JOptionPane.showInputDialog("Digite o total de horas extras realizado no mês correspondente: "));
    }

    public static void mostrarSalario (double salarioLiquido){
        JOptionPane.showMessageDialog(null, "O salário liquido do colaborador é " + salarioLiquido);
    }
}
