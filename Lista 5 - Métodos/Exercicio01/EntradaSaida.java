package Exercicio01;

import javax.swing.JOptionPane;

public class EntradaSaida {
    public static double pedirNumero(String contador, String mensagem){
        return Double.parseDouble(JOptionPane.showInputDialog(mensagem + "Informe a " + (contador) + "nota: "));
    }

    public static int pedirOpcao(String mensagem){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(mensagem + "Digite a opção refernte ao tipo de média desejada: \n" +
        "1 - Aritmética \n" +
        "2 - Ponderada \n"));
        return opcao;
    }

    public static double pedirPeso(String contador, String mensagem){
        return Double.parseDouble(JOptionPane.showInputDialog(mensagem + "Informe o peso da " + contador + "nota"));
    }

    public static void mostrarResultado (double media, boolean aprovado){
        if (aprovado == true) {
            JOptionPane.showMessageDialog(null, "A média do aluno é "+ media + "\n" +
            "APROVADO!");
        } else {
            JOptionPane.showMessageDialog(null, "A média do aluno é "+ media + "\n" +
            "REPROVADO!");
        }
    }
}
