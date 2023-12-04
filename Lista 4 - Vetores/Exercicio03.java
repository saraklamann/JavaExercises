import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        double[] vetor = new double[10];
        String resultado="Os valores do vetor são {";
        int soma=0;
        double media=0;

        for(int i=0; i < 10; i++){
            vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para a " + (i + 1) + "ª posição:"));
            soma += vetor[i];
            if (i == 9) {
                resultado+=vetor[i]+"}";
            } else {
                resultado+=vetor[i]+", ";
            }
        }

        media = soma / 10;
        JOptionPane.showMessageDialog(null, resultado + "\n" +
        "A soma de todos os valores é " + soma + "\n" +
        "E a média de todos os valores é " + media);
    }
}
