import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.0000E0"); //define formato

        int numero1, numero2;
        String divisao="";
        String resto="";
        
        //coleta os números
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1° número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2° número: "));

        //verifica se o segundo número é 0, cálcula e mostra o resultado das operações
        if (numero2 == 0) {
            divisao = "A divisão não pôde ser realizada pois o segundo número é zero";
            resto = "A divisão não pôde ser realizada então não há resto";
        } else {
            divisao = "A divisão do primeiro pelo segundo número é " + (numero1/numero2);
            resto = "O resto do primeiro pelo segundo número é " + (numero1 % numero2);
        }

        JOptionPane.showMessageDialog(null,"A soma dos dois números é "+ (numero1 + numero2) + "\n"
            + "A subtração dos dois números é "+ (numero1 - numero2) + "\n"
            + "A multiplicação dos dois números é "+ (numero1 * numero2) + "\n"
            + divisao + "\n"
            + "A exponenciação do primeiro pelo segundo número é " + Math.pow(numero1, numero2) + "\n"
            + "A exponenciação também pode ser representada no formato de notação cientifica " + df.format(Math.pow(numero1, numero2)) + "\n"
            + resto + "\n");
    }
}
