import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        Random rand = new Random();
        int posicao=0, n=0;
        boolean estaNoVetor=false;

        int[] vetor = new int[10];
        for(int i=0; i<10; i++){
            vetor[i] = rand.nextInt(99) + 1;
            // System.out.print(vetor[i]);
        }
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 1 e 100"));

        for(int i=0; i < 10; i++){
            if (vetor[i] == n) {
                posicao = i;
                estaNoVetor = true;
            }
        }

        if (estaNoVetor == true) {
            JOptionPane.showMessageDialog(null, "Este número está no vetor, e se encontra na posição " + (posicao + 1) + " (indice " + posicao + ")");
        } else {
            JOptionPane.showMessageDialog(null, "Este número não está no vetor.");
        }
    }
}