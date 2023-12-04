import javax.swing.JOptionPane;

public class Exercicio06 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Informe o número que deseja saber a tabuada"));
        
        for(int i = 0; i <= 10; i++){
            JOptionPane.showMessageDialog(null, n + " x " + i + " = " + n * i );
        }
    }
}
