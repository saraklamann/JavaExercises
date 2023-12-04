package Exercicio03;

import javax.swing.JOptionPane;

public class EntradaSaida {
    public static int pedirOpcao() {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao desejada: \n\n" +
        "1 - Cadastrar aluno e suas notas \n" +
        "2 - Listar alunos e notas \n" +
        "3 - Ver notas de um aluno \n" +
        "4 - Alterar o nome de um aluno \n" +
        "5 - Adicionar nota a um aluno \n" +
        "6 - Mostrar média de um aluno \n" +
        "0 - Sair \n"));
    }

    public static String pedirDados(String msg) {
        return JOptionPane.showInputDialog("Insira " + msg);
    }

    public static int pedirQuantidade() {
        return Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de notas que deseja inserir: "));
    }

    public static void mostrarAlunos(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static String pedirNomeAluno(String msg, String acao) {
        String nome = JOptionPane.showInputDialog("Digite o "+ msg + " do aluno que deseja "+acao +" (acentos fazem diferença): ");
        nome = nome.toLowerCase();
        return nome;
    }

    public static void mostrarNotasAluno(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static void mostrarMedia(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }

}
