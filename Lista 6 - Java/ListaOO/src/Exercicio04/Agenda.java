package Exercicio04;

import java.util.ArrayList;


public class Agenda {
    public ArrayList <Tarefa> listaDeTarefas = new ArrayList<Tarefa>();

    public ArrayList <Tipo> listaDeTipos = new ArrayList<Tipo>();

    public void adicionarTarefa(Tarefa t) {
        this.listaDeTarefas.add(t);
    }

    public String listarTarefas() {
        String tarefas = "Suas tarefas são: \n";
        int i = 1;
        
        for(Tarefa t : this.listaDeTarefas){
            tarefas += i + "° Tarefa: \n" +
            "Descrição: " + t.descricao + "\n" +
            "Prazo: " + t.prazo + "\n" +
            "Status: " + t.status + "\n" +
            "Tipo: " + t.tipo.descricao + "\n\n";
            i++;
        }
        return tarefas;
    }

    public String listarTarefasCondicional(String msg) {
        String tarefas = "Suas tarefas " +  msg + " são: \n";
        boolean tarefaEncontrada=false;
        for(Tarefa t : this.listaDeTarefas){
            t.status = t.status.toLowerCase();
            if (t.status.equals(msg)) {
                tarefaEncontrada = true;
                tarefas += "Tarefa: \n" +
                "Descrição: " + t.descricao + "\n" +
                "Prazo: " + t.prazo + "\n" +
                "Status: " + t.status + "\n" +
                "Tipo: " + t.tipo.descricao + "\n\n";
            }
        }
        if (tarefaEncontrada==true) {
            return tarefas;
        } else {
            return "Não há tarefas em aberto";
        }
        
    }

    public String alterarStatusTarefa(String nome) {
        boolean tarefaEncontrada=false;
        for(Tarefa t : this.listaDeTarefas){
            t.descricao = t.descricao.toLowerCase();
            nome = nome.toLowerCase();
            if (nome.equals(t.descricao)) {
                tarefaEncontrada = true;
                int novaOpcao= EntradaSaida.pedirNovaOpcao("");
                    while (novaOpcao < 1 || novaOpcao > 2) {
                        novaOpcao = EntradaSaida.pedirNovaOpcao("Opção Inválida!");
                    }
                    if (novaOpcao == 1) {
                        t.status = "Em aberto";
                    } else {
                        t.status = "Concluída";
                    }
            }
        }

        if (tarefaEncontrada == false) {
           return "Tarefa não encontrada!";
        } else {
            return "Alteração realizada com sucesso";
        }
    }

    public void excluirTarefa(int posicao){
        this.listaDeTarefas.remove(posicao - 1);
    }

    public int descobrirTamanho() {
        return listaDeTarefas.size();
    }

    public void adicionarTipo(Tipo tipo) {
        this.listaDeTipos.add(tipo);
    }

    public String listarTipos() {
        String tipos = "Seus tipos de tarefas são: \n";
        
        for(Tipo tipo : this.listaDeTipos){
            if (!tipos.contains(tipo.descricao)) {
                tipos += tipo.descricao + "\n";
            }
            
        }
        return tipos;
    }
}
