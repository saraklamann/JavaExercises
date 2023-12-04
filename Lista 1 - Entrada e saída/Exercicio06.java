import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#,###.0"); //define o formato

        //coleta de dados
        String nome = JOptionPane.showInputDialog("Informe seu nome");
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1ª nota"));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2ª nota"));

        double media = ((nota1 * 0.4) + (nota2 * 0.6)); //cálculo média

        JOptionPane.showMessageDialog(null,"A média do estudante " + nome + " é \n" + df.format(media));
    }
}
