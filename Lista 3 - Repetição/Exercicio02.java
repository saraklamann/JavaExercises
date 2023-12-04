import javax.swing.JOptionPane;

public class Exercicio02 {
    public static void main(String[] args) {
        int acimaCinquenta=0, menosDeOitenta=0, acimaDe160=0, idade=0, altura=0;
        double peso=0;

        for(int i=0; i<10; i++){
            idade = Integer.parseInt(JOptionPane.showInputDialog("(" + (i + 1) + "° Pessoa) Digite sua idade: "));
            peso = Double.parseDouble(JOptionPane.showInputDialog("(" + (i + 1) + "° Pessoa) Digite seu peso (kg)"));
            altura = Integer.parseInt(JOptionPane.showInputDialog("(" + (i + 1) + "° Pessoa) Digite sua altura (cm): "));
            if(idade > 50){
                acimaCinquenta += 1;
            }
            if(peso < 80){
                menosDeOitenta += 1;
            }
            if(altura > 160){
                acimaDe160 += 1;
            }
        }

        JOptionPane.showMessageDialog(null, "Foram inseridas " + acimaCinquenta + " pessoas de mais de 50 anos \n" +
        "Foram inseridas " + menosDeOitenta + " pessoas que pesam menos de 80kg \n" +
        "Foram inseridas " + acimaDe160 + " pessoas de mais de 1.60m \n");
    }
}
