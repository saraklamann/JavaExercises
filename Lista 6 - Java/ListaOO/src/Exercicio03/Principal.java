package Exercicio03;

public class Principal {
    public static void main(String[] args) {
        Escola e = new Escola();
        int opcao=0;

        do{
            opcao = EntradaSaida.pedirOpcao();
            switch (opcao) {
                case 1:
                    Aluno a = new Aluno();
                    a.nome = EntradaSaida.pedirDados("o nome do aluno: ");
                    a.nome = a.nome.toLowerCase();
                    a.sobrenome = EntradaSaida.pedirDados("o sobrenome do aluno: ");
                    a.sobrenome = a.sobrenome.toLowerCase();
                    a.idade = Integer.parseInt(EntradaSaida.pedirDados("a idade do aluno: "));
                    int quantidade = EntradaSaida.pedirQuantidade();
                    for(int i=0; i< quantidade;i++){
                        Nota n = new Nota();
                        n.descricao = EntradaSaida.pedirDados("a descrição da "+ (i+1) +"° nota: ");
                        n.pontuacao = Integer.parseInt(EntradaSaida.pedirDados("a pontuação da " + (i+1)+ "° avaliação: "));
                        a.adicionarNota(n);
                    }
                    e.adicionarAluno(a);
                    break;
                case 2:
                    if (!e.listaDeAlunos.isEmpty()) {
                      EntradaSaida.mostrarAlunos(e.listarAlunos());
                    } else {
                      EntradaSaida.mostrarAlunos("Nenhum aluno cadastrado até o momento!");
                    }
                    break;
                case 3:
                    String nomeAluno = EntradaSaida.pedirNomeAluno("nome", "encontrar");
                    String sobrenomeAluno = EntradaSaida.pedirNomeAluno("sobrenome", "encontrar");
                    EntradaSaida.mostrarNotasAluno(e.listarNotasAluno(nomeAluno, sobrenomeAluno));
                    break;
                case 4:
                    nomeAluno = EntradaSaida.pedirNomeAluno("nome", "editar");
                    sobrenomeAluno = EntradaSaida.pedirNomeAluno("sobrenome", "editar");
                    nomeAluno = nomeAluno.toLowerCase();
                    sobrenomeAluno = sobrenomeAluno.toLowerCase();
                    e.editarNomeAluno(nomeAluno, sobrenomeAluno);
                    break;
                case 5:
                    nomeAluno = EntradaSaida.pedirNomeAluno("nome", "adicionar nota: ");
                    sobrenomeAluno = EntradaSaida.pedirNomeAluno("sobrenome", "adicionar nota: ");
                    nomeAluno = nomeAluno.toLowerCase();
                    sobrenomeAluno = sobrenomeAluno.toLowerCase();
                    e.adicionarNotaAluno(nomeAluno, sobrenomeAluno);
                    break;
                case 6:
                    nomeAluno = EntradaSaida.pedirNomeAluno("nome", "calcular a média: ");
                    sobrenomeAluno = EntradaSaida.pedirNomeAluno("sobrenome", "calcular a média: ");
                    nomeAluno = nomeAluno.toLowerCase();
                    sobrenomeAluno = sobrenomeAluno.toLowerCase();
                    String media = e.calcularMedia(nomeAluno, sobrenomeAluno);
                    EntradaSaida.mostrarMedia(media);
                    break;
            }
        } while (opcao !=0);
    }
}
