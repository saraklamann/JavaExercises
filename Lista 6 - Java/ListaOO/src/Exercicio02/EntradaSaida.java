package Exercicio02;

import javax.swing.JOptionPane;

public class EntradaSaida {
    public static int pedirOpcao() {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao desejada: \n" +
        "1 - Cadastrar peças \n" +
        "2 - Remover uma peça \n" +
        "3 - Ver todas as peças \n" +
        "0 - Sair"));
    }

    public static String pedirDados(String msg) {
        return JOptionPane.showInputDialog("Insira "+msg+" da peça: ");
    }

    public static void mostrarPecas(String listarPecas) {
        JOptionPane.showMessageDialog(null, listarPecas);
    }

    public static void mostrarAlerta(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static int pedirQuantidade() {
        return Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de produtos que deseja adicionar: "));
    }

    public static int pedirPosicao(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog(msg+"Digite a posição da peça que você deseja remover: "));
    }
    
}
