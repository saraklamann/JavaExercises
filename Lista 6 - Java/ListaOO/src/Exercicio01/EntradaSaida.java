package Exercicio01;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class EntradaSaida {
    public static String solicitarDados(String msg){
        return JOptionPane.showInputDialog("Insira "+msg+": ");
    }

    public static void mostrarProduto(Produto p) {
        DecimalFormat df = new DecimalFormat("R$#,###.00");
        String produto="As especificações do produto são: \n";

        produto+="Marca: "+ p.marca + "\n" +
        "Modelo: " + p.modelo + "\n" +
        "Ano: " + p.ano + "\n" +
        "Motor: " + p.motor + "\n" +
        "Preço: " + df.format(p.preco) + "\n";

        JOptionPane.showMessageDialog(null, produto);
    }

}
