import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorSoma = new int[10];
        String mostrarVetor1="{";
        String mostrarVetor2="{";
        String mostrarVetorSoma="{";

        Random rand = new Random();

        for(int i=0; i < 10; i++){
            vetor1[i] = rand.nextInt(10) + 1;
            if(i == 9){
                mostrarVetor1 += vetor1[i] + "} \n";
            } else {
                mostrarVetor1 += vetor1[i] + ", ";
            }

            vetor2[i] = rand.nextInt(10) + 1;
            if(i == 9){
                mostrarVetor2 += vetor2[i] + "} \n";
            } else {
                mostrarVetor2 += vetor2[i] + ", ";
            }

            vetorSoma[i] = vetor1[i] + vetor2[i];
            if(i == 9){
                mostrarVetorSoma += vetorSoma[i] + "} \n";
            } else {
                mostrarVetorSoma += vetorSoma[i] + ", ";
            }

        }

    JOptionPane.showMessageDialog(null, "Os valores do primeiro vetor são " + mostrarVetor1 +
    "Os valores do segundo vetor são " + mostrarVetor2 +
    "E as somas dos elementos dos dois vetores são " + mostrarVetorSoma);
    }
}
