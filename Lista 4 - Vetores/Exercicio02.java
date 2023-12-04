import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        int[] vetor = new int[5];

        for(int i=0; i < 5; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor para a " + (i + 1) + "° posição:"));
        }

        int menor = vetor[0], posicaoMenor = 0, maior = vetor[0], posicaoMaior = 0;

        for(int i=0; i < 5; i++){
            if (vetor[i] < menor) {
                menor = vetor[i];
                posicaoMenor = i;
            }
            
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
        }

        JOptionPane.showMessageDialog(null, "O menor valor digitado foi " + menor + " e ele está na " + (posicaoMenor + 1) + "° posição (indice " + posicaoMenor +") \n"+
        "E o maior valor foi " + maior + " e ele está na " + (posicaoMaior + 1) + "° posição (indice " + posicaoMaior + ")");
    }
}
