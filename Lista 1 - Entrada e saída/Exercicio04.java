import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: ")); //coleta o número        
        int antecessor = (numero - 1) , sucessor = (numero + 1); //define antecessor e sucessor

        JOptionPane.showMessageDialog(null,"O número digitado foi " + numero + "\n"
        + "Seu antecessor é " + antecessor + "\n"
        + "Seu sucessor é " + sucessor);
    }
}
