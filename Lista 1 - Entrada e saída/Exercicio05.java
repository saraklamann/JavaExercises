import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args){
        //coleta de dados
        int hora = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora: "));
        int min = Integer.parseInt(JOptionPane.showInputDialog("Informe os minutos: "));
        int seg = Integer.parseInt(JOptionPane.showInputDialog("Informe os segundos: "));

        JOptionPane.showMessageDialog(null,"O horário é " + hora + ":" + min + ":" + seg); //mostra o horário

        //converte os dados informados para segundo e calcula o total
        hora = hora * 3600;
        min = min * 60;
        int totalSegundos = (hora + min + seg);

        JOptionPane.showMessageDialog(null,"O horário em segundos é: " + totalSegundos);
    }
}