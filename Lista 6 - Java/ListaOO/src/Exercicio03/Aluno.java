package Exercicio03;

import java.util.ArrayList;

public class Aluno {
    public String nome;
    public String sobrenome;
    public int idade;
    public int nota1;
    public ArrayList <Nota> listaDeNotas = new ArrayList <Nota>();
   
    public void adicionarNota(Nota n) {
        this.listaDeNotas.add(n);
    }
}
