import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        double saldo=0;
        double positivos=0, total=0;
        String continuar="";

        do{
            saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe seu saldo"));
            total++;

            if (saldo < 0) {
                positivos++;
            }

            continuar = JOptionPane.showInputDialog("Deseja adicionar outro saldo? (s/n)");
            continuar = continuar.toLowerCase();

        } while (continuar.equals("s"));

        double porcetagemPositivos = positivos / total * 100;

        if (porcetagemPositivos >= 50) {
            JOptionPane.showMessageDialog(null, "Nenhum risco!");
        } else{
            JOptionPane.showMessageDialog(null, "Risco ao banco");
        } 
    }
}
