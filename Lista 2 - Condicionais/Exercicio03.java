import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        int golsTimeA = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de gols que o time A marcou"));  
        
        //validação número de gols time A
        while (golsTimeA < 0) {
            golsTimeA = Integer.parseInt(JOptionPane.showInputDialog("Valor inválido! \n"+
            "Insira a quantidade de gols que o time A marcou"));
        }

        int golsTimeB = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de gols que o time B marcou"));

        //validação número de gols time B
        while (golsTimeB < 0) {
            Integer.parseInt(JOptionPane.showInputDialog("Valor inválido! \n"+
            "Insira a quantidade de gols que o time B marcou"));
        }
        
        //verificação do ganhador
        if (golsTimeA > golsTimeB) {
            JOptionPane.showMessageDialog(null, "O time A foi o ganhador!");
        } else if (golsTimeB > golsTimeA) {
            JOptionPane.showMessageDialog(null, "O time B foi o ganhador!");
        } else {
            JOptionPane.showMessageDialog(null, "O jogo terminou empatado!");
        }
    }
}
