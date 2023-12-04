import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Random rand = new Random();
        String mostrarVetor="Os números do vetor são {";

        //preenche os valores
        for(int i=0; i<10; i++){
            vetor[i] = rand.nextInt(10) + 1;
            if (i == 9) {
                mostrarVetor += vetor[i] + "}";
            } else {
                mostrarVetor += vetor[i] + ", ";
            }
        }
        //inverte os valores
        for (int i = 0; i < vetor.length / 2; i++) {
            int aux=0;
            aux = vetor[i];
            vetor[i] = vetor[(vetor.length - 1 - i)];
            vetor[(vetor.length - 1 - i)] = aux;
        }

        mostrarVetor += "\n\nOs números invertidos são {";

        for (int i = 0; i < 10; i++) {
            if (i == 9) {
                mostrarVetor += vetor[i] + "} \n";
            } else {
                mostrarVetor += vetor[i] + ", ";
            }
        }
 
        JOptionPane.showMessageDialog(null, mostrarVetor);
    }
}
