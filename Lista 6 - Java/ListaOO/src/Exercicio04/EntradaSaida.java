package Exercicio04;

import javax.swing.JOptionPane;

public class EntradaSaida {
    public static int pedirOpcao(String msg){
        return Integer.parseInt(JOptionPane.showInputDialog(msg + " Escolha opção desejada: \n" +
        "1 - Cadastrar tarefa \n" +
        "2 - Ver todas as tarefas \n" +
        "3 - Ver somente tarefas em aberto \n" +
        "4 - Ver somente tarefas concluídas \n" +
        "5 - Alterar status de uma tarefa \n" +
        "6 - Excluir uma tarefa \n" +
        "7 - Ver todos os tipos de tarefas existentes \n" +
        "0 - Sair \n"));
    }

    public static int pedirNovaOpcao(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog(msg + " Defina o status da tarefa: \n" +
        "1 - Em aberto \n" +
        "2 - Concluída \n"));
    }

    public static String pedirDados(String msg, String acao) {
        return JOptionPane.showInputDialog("Insira " + msg + " da tarefa" + acao + ": ");
    }

    public static void mostrarTarefas(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static void mostrarAlerta(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static int pedirPosicao(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog(msg+"Digite a posição da tarefa que você deseja excluir: "));
    }

    public static void mostrarTipos(String tipos) {
        JOptionPane.showMessageDialog(null, tipos);
    }
  
}
