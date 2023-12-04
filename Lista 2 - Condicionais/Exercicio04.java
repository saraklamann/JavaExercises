import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.00");

        double VALOR_BASE = 3000; //constante

        //menu destino
        int destino = Integer.parseInt(JOptionPane.showInputDialog("Insira o destino da viagem \n" +
        "1) Maceió \n" +
        "2) Porto de galinhas"));

        //validação destino
        while(destino < 1 || destino > 2){
        destino = Integer.parseInt(JOptionPane.showInputDialog("Destino inválido! Insira novamente o destino da viagem \n" +
        "1) Maceió \n" +
        "2) Porto de galinhas"));
        }

        double valorViagem = 0;

        switch(destino){
            case 1:
                //menu almoço e janta inclusos
                int comidaInclusa = Integer.parseInt(JOptionPane.showInputDialog("Deseja almoço e janta inclusos no pacote? \n" +
                "1) Sim \n" +
                "2) Não"));

                //validação comida inclusa
                while(comidaInclusa < 1 || comidaInclusa > 2){
                    comidaInclusa = Integer.parseInt(JOptionPane.showInputDialog("Opção Inválida! Deseja almoço e janta inclusos no pacote? \n" +
                    "1) Sim \n" +
                    "2) Não"));
                }

                //cálculo do valor da viagem para o primeiro destino
                switch (comidaInclusa) {
                    case 1:
                        valorViagem = VALOR_BASE;
                        break;
                    case 2:
                        valorViagem = VALOR_BASE * 0.85;
                        break;
                }
                break;
            case 2:
                //menu almoço e janta inclusos
                comidaInclusa = Integer.parseInt(JOptionPane.showInputDialog("Deseja almoço e janta inclusos no pacote? \n" +
                "1) Sim \n" +
                "2) Não"));

                //validação comida inclusa
                while(comidaInclusa < 1 || comidaInclusa > 2){
                    comidaInclusa = Integer.parseInt(JOptionPane.showInputDialog("Opção Inválida! Deseja almoço e janta inclusos no pacote? \n" +
                    "1) Sim \n" +
                    "2) Não"));
                }

                //cálculo do valor da viagem para o segundo destino
                switch (comidaInclusa) {
                    case 1:
                        valorViagem = VALOR_BASE * 0.6;
                        break;
                    case 2:
                        valorViagem = VALOR_BASE * 0.45;
                        break;
                }
                break;
            default:
        }   
        JOptionPane.showMessageDialog(null, "O valor final da viagem será R$" + df.format(valorViagem));
    }
}
