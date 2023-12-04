import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {
        String nome="";
        String nomeMaisPesado="", nomeMaisAlto="";
        double pesoMaisPesado=0;
        double alturaMaisAlto=0;

        for(int i=0; i<2; i++){
            nome = JOptionPane.showInputDialog("(" + (i + 1) + "° Pessoa) Digite seu nome: ");
            double peso = Double.parseDouble(JOptionPane.showInputDialog("(" + (i + 1) + "° Pessoa) Digite seu peso (kg)"));
            int altura = Integer.parseInt(JOptionPane.showInputDialog("(" + (i + 1) + "° Pessoa) Digite sua altura (cm): "));
            if (peso > pesoMaisPesado) {
                pesoMaisPesado = peso;
                nomeMaisPesado = nome;
            }

            if (altura > alturaMaisAlto) {
                alturaMaisAlto = altura;
                nomeMaisAlto = nome;
            }
        }

        JOptionPane.showMessageDialog(null, "A pessoa mais pesada é " + nomeMaisPesado + " e seu peso é " + pesoMaisPesado + "kg \n" +
        "A pessoa mais alta é " + nomeMaisAlto + " e sua altura é " + (alturaMaisAlto / 100) + "m");
    }
}
