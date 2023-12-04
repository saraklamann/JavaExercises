package Exercicio04;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        int opcao=0;
        Agenda a = new Agenda();
        do{
            opcao = EntradaSaida.pedirOpcao("");
            while (opcao > 7 || opcao < 0) { //valida opção
                opcao = EntradaSaida.pedirOpcao("Opção Inválida!");
            }
            switch (opcao) {
                case 1:
                    Tarefa t = new Tarefa();
                    t.descricao = EntradaSaida.pedirDados("a descrição", "");
                    t.prazo = EntradaSaida.pedirDados("o prazo", "");
                    int novaOpcao= EntradaSaida.pedirNovaOpcao("");
                    while (novaOpcao < 1 || novaOpcao > 2) {
                        novaOpcao = EntradaSaida.pedirNovaOpcao("Opção Inválida!");
                    }
                    if (novaOpcao == 1) {
                        t.status = "Em aberto";
                    } else {
                        t.status = "Concluída";
                    }
                    Tipo ti = new Tipo();
                    ti.descricao = EntradaSaida.pedirDados("o tipo (casa, escola, trabalho...)", "");
                    t.tipo = ti;
                    a.adicionarTipo(ti);
                    a.adicionarTarefa(t);
                    break;
                case 2:
                    if (!a.listaDeTarefas.isEmpty()) {
                        EntradaSaida.mostrarTarefas(a.listarTarefas());
                    } else {
                        EntradaSaida.mostrarAlerta("Nenhuma tarefa registrada!");
                    }
                    
                    break;
                case 3:
                        EntradaSaida.mostrarTarefas(a.listarTarefasCondicional("em aberto"));
                    break;
                case 4:
                        EntradaSaida.mostrarTarefas(a.listarTarefasCondicional("concluída"));
                    break;
                case 5:
                    String nome = EntradaSaida.pedirDados("a descrição", " que deseja alterar o status");
                    JOptionPane.showMessageDialog(null, a.alterarStatusTarefa(nome));
                    break;
                case 6:
                    EntradaSaida.mostrarTarefas(a.listarTarefas());
                    int posicao = EntradaSaida.pedirPosicao("");
                    int tamanho = a.descobrirTamanho();
                    while (posicao > tamanho || posicao <= 0) {
                        posicao = EntradaSaida.pedirPosicao("Posição Inválida! ");
                    }
                    a.excluirTarefa(posicao);
                    break;
                case 7:
                    if(!a.listaDeTipos.isEmpty()){          
                        EntradaSaida.mostrarTipos(a.listarTipos());
                    }else{
                        EntradaSaida.mostrarAlerta("Nenhum tipo foi cadastrado até o momento.");
                    }
                    break;
            }
        } while (opcao != 0);
    }
}
