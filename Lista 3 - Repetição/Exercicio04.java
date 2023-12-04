import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Até que número deseja que sua sequencia vá?"));
        int incremento = Integer.parseInt(JOptionPane.showInputDialog("De quanto em quanto o programa deve mostrar?"));

        for(int i=0; i <= n; i += incremento){
            JOptionPane.showMessageDialog(null, i);
        }
    }
}
