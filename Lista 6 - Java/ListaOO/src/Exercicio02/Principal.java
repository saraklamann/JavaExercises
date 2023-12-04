package Exercicio02;

public class Principal {
    public static void main(String[] args) {
        Estoque e = new Estoque();

        int opcao=0;
        do{
            opcao = EntradaSaida.pedirOpcao();
            switch (opcao) {
                case 1:
                    int quantidade = EntradaSaida.pedirQuantidade();
                    for(int i=0; i<quantidade; i++){
                        Peca p = new Peca();
                        p.descricao = EntradaSaida.pedirDados("a descrição da " + (i+1) + "°");
                        p.preco = Double.parseDouble(EntradaSaida.pedirDados("o preço da " + (i+1) + "°"));
                        p.cor = EntradaSaida.pedirDados("a cor da " + (i+1) + "°");
                        p.altura = Double.parseDouble(EntradaSaida.pedirDados("a altura da " + (i+1) + "°"));
                        p.largura = Double.parseDouble(EntradaSaida.pedirDados("a largura da " + (i+1) + "°"));
                        e.cadastrarPeca(p);
                    }
                    break;
                case 2:
                    int posicao = EntradaSaida.pedirPosicao("");
                    int tamanho = e.descobrirTamanho();
                    while (posicao > tamanho || posicao <= 0) {
                        posicao = EntradaSaida.pedirPosicao("Posição Inválida! ");
                    }
                    e.removerPeca(posicao);
                    break;
                case 3:
                    if (!e.listaDePecas.isEmpty()) {
                        EntradaSaida.mostrarPecas(e.listarPecas());
                    } else {
                       EntradaSaida.mostrarAlerta("Nenhuma peça foi cadastrada até o momento!");
                    }
                    break;
            }
        } while (opcao != 0);
    }
}
