import javax.swing.JOptionPane;

public class Exercicio01{
    //função que representa um intervalo
    public static boolean verificarIntervalo(int numero, int min, int max) {
        return min <= numero && numero <= max;
    }

    public static void main(String[] args) {
        int idade=Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade:"));
        
        //validação da idade
        while (idade<0) {
            idade=Integer.parseInt(JOptionPane.showInputDialog("Idade inválida! Insira corretamente sua idade:"));
        }

        //classifica os intervalos
        if (verificarIntervalo(idade, 0, 14)) { // da pra fazer a usando o if(idade >= 0 && idade <= 14 mas tava com tempo quis fazer gracinha)
            JOptionPane.showMessageDialog(null, "Sua classificação é 'criança'");
        } else if(verificarIntervalo(idade, 15, 17)){
            JOptionPane.showMessageDialog(null, "Sua classificação é 'adolescente'");
        } else if(verificarIntervalo(idade, 18, 30)){
            JOptionPane.showMessageDialog(null, "Sua classificação é 'jovem adulto'");
        } else {
            JOptionPane.showMessageDialog(null, "Sua classificação é 'adulto'");
        }
    }
}