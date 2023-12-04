package Exercicio03;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Escola {
    public ArrayList <Aluno> listaDeAlunos = new ArrayList <Aluno> ();

    public void adicionarAluno(Aluno a) {
        this.listaDeAlunos.add(a);
    }

    public String listarAlunos(){
        int i=0;
        String alunos= "";
        
        for(Aluno a : this.listaDeAlunos){
            alunos+= (i + 1) + "° Aluno(a): \n" +
            "Nome completo: " + a.nome + " " + a.sobrenome + "\n" +
            "Idade: " + a.idade + " anos \n";
            int j=0;
            for(Nota n : a.listaDeNotas){
                alunos+="Descrição da avaliação " + (j+1) + ": "+ n.descricao + "\n" +
                "Pontuação da avalição " + (j+1) + ": " + n.pontuacao + "\n";
                j++;
            }
            alunos+= "\n";
            i++;
        }
        return alunos;
    }

    public String listarNotasAluno(String nomeAluno, String sobrenomeAluno) {
        String aluno ="Dados do aluno: \n";
        boolean alunoEncontrado=false;
        nomeAluno = nomeAluno.toLowerCase();
        sobrenomeAluno = sobrenomeAluno.toLowerCase();
            for(Aluno a : this.listaDeAlunos){
                if(nomeAluno.equals(a.nome) && sobrenomeAluno.equals(a.sobrenome)){
                    alunoEncontrado=true;
                    aluno+= "Aluno(a): \n" +
                    "Nome completo: " + a.nome + " " + a.sobrenome + "\n" +
                    "Idade: " + a.idade + " anos \n";
                    int j=0;
                    for(Nota n : a.listaDeNotas){
                    aluno+="Descrição da avaliação " + (j+1) + ": "+ n.descricao + "\n" +
                    "Pontuação da avalição " + (j+1) + ": " + n.pontuacao + "\n";
                    j++;
                    }  
                }
            }
            if (alunoEncontrado == true) {
                return aluno;
            } else {
                return "Aluno não encontrado no sistema!";
            }
    }

    public void editarNomeAluno(String nome, String sobrenome){
        boolean alunoEncontrado=false;
        for(Aluno a : this.listaDeAlunos){
            if (nome.equals(a.nome) && sobrenome.equals(a.sobrenome)){
                alunoEncontrado = true;
                a.nome = JOptionPane.showInputDialog("Digite o novo nome: ");
                a.sobrenome = JOptionPane.showInputDialog("Digite o novo sobrenome: ");
                a.nome = a.nome.toLowerCase();
                a.sobrenome = a.sobrenome.toLowerCase();
            }
        }
        if (alunoEncontrado==false) {
        JOptionPane.showMessageDialog(null, "Aluno não encontrado!");
        }
    }

    public void adicionarNotaAluno(String nomeAluno, String sobrenomeAluno) {
        boolean alunoEncontrado = false;
        for(Aluno a : this.listaDeAlunos){
            if (nomeAluno.equals(a.nome) && sobrenomeAluno.equals(a.sobrenome)) {
                alunoEncontrado=true;
                int quantidade = EntradaSaida.pedirQuantidade();
                for(int i=0; i< quantidade;i++){
                    Nota n = new Nota();
                    n.descricao = EntradaSaida.pedirDados("a descrição da "+ (i+1) +"° nota: ");
                    n.pontuacao = Integer.parseInt(EntradaSaida.pedirDados("a pontuação da " + (i+1)+ "° avaliação: "));
                    a.adicionarNota(n);
                }
            }
        }
        if (alunoEncontrado == false) {
            JOptionPane.showMessageDialog(null, "Aluno não encontrado no sistema");
        }
    }

    public String calcularMedia(String nomeAluno, String sobrenomeAluno) {
        double media=0;
        boolean alunoEncontrado = false;
        for(Aluno a : this.listaDeAlunos){
            if (nomeAluno.equals(a.nome) && sobrenomeAluno.equals(a.sobrenome)) {
                alunoEncontrado = true;
                for(Nota n : a.listaDeNotas){
                    media += n.pontuacao;
                }
                media = media / a.listaDeNotas.size();
            }
        }
        if (alunoEncontrado == true) {
            return "A média é " + media;
        } else {
            return "Aluno não encontrado";
        }
    }
}
