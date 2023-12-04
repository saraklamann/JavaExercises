import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        Random gerador = new Random();

        int numeroDaSorte = (gerador.nextInt(99) + 1); //gera número randomico entre 1 e 100
        int tentativas = 1;
        int palpite = Integer.parseInt(JOptionPane.showInputDialog("Digite seu palpite de número da sorte: "));

        // repetição para que o usuário tenha 3 chances
        while (palpite != numeroDaSorte && tentativas <= 2) {
            palpite = Integer.parseInt(JOptionPane.showInputDialog("Digite seu palpite de número da sorte: "));
            tentativas = tentativas + 1;
        }

        //validação da resposta após as 3 tentativas
        if (palpite == numeroDaSorte) {
            JOptionPane.showMessageDialog(null, "Você acertou!");
        } else {
            JOptionPane.showMessageDialog(null, "Você errou!");
        }
    }
}