import javax.swing.JOptionPane;

public class Exercicio01{
    public static void main(String[] args) {
        int n=0, pares=0, impares=0, negativos=0, positivos=0;
        
        for(int i = 0; i < 10; i++){
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+ (i + 1)+ "° número: \n"));
            if(n % 2 == 0){
                pares += 1;
            } else {
                impares += 1;
            }
            if(n < 0){
                negativos += 1;
            } else if(n > 0) {
                positivos += 1;
            }
        }
        
        String opcao = JOptionPane.showInputDialog("O que deseja saber sobre os números digitados? \n" +
        "a. Quantos são pares? \n" +
        "b. Quantos são impares? \n" +
        "c. Quantos são negativos? \n" +
        "d. Quantos são positivos? \n" +
        "e. Sair");

        opcao = opcao.toLowerCase();

        while (!opcao.equals("a") && !opcao.equals("b") && !opcao.equals("c") && !opcao.equals("d") && !opcao.equals("e")) {
            opcao = JOptionPane.showInputDialog("Opção inválida! O que deseja saber sobre os números digitados? \n" +
            "a. Quantos são pares? \n" +
            "b. Quantos são impares? \n" +
            "c. Quantos são negativos? \n" +
            "d. Quantos são positivos? \n" +
            "e. Sair"); 
        }

        switch (opcao) {
            case "a":
                JOptionPane.showMessageDialog(null, "Foram digitados " + pares + " números pares.");
                break;
            case "b":
                JOptionPane.showMessageDialog(null, "Foram digitados " + impares + " números impares.");
                break;
            case "c":
                JOptionPane.showMessageDialog(null, "Foram digitados " + negativos + " números negativos.");
                break;
            case "d":
                JOptionPane.showMessageDialog(null, "Foram digitados " + positivos + " números positivos.");
                break;
            case "e":
                System.exit(0);
                break;
        }
    }
}