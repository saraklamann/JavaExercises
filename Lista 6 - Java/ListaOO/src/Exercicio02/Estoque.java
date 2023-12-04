package Exercicio02;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Estoque {
    public ArrayList <Peca> listaDePecas = new ArrayList <Peca>();

    public void cadastrarPeca(Peca p) {
        this.listaDePecas.add(p);
    }

    public String listarPecas(){
        DecimalFormat df = new DecimalFormat("R$#,###.00");
        DecimalFormat df2 = new DecimalFormat("#### cm");
        int i=0;
        String pecas= "";
        
        for(Peca p : this.listaDePecas){
            pecas+= (i + 1) + "° Peça: \n" +
            "Descrição: " + p.descricao + "\n" +
            "Preço: " + df.format(p.preco) + "\n" +
            "Cor: " + p.cor + "\n" +
            "Altura: " + df2.format(p.altura) + "\n" +
            "Largura: " + df2.format(p.largura) + "\n\n";
            i++;
        }
        return pecas;
    }

    public void removerPeca(int posicao){
        this.listaDePecas.remove(posicao - 1);
    }

    public int descobrirTamanho(){
        return listaDePecas.size();
    }
}
