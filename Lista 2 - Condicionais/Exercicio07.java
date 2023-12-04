import javax.swing.JOptionPane;

public class Exercicio07 {
    public static void main(String[] args) {
        //menu pergunta
        int pergunta = Integer.parseInt(JOptionPane.showInputDialog("Deseja responder a qual pergunta?\n" +
        "1) Quem descobriu o Brasil?\n" +
        "2) Qual a capital do Brasil?"));

        //validação da escolha da pergunta
        while (pergunta < 1 || pergunta > 2) {
            pergunta = Integer.parseInt(JOptionPane.showInputDialog("Opção inválida! Deseja responder a qual pergunta?\n" +
            "1) Quem descobriu o Brasil?\n" +
            "2) Qual a capital do Brasil?"));
        }

        switch (pergunta) {
            case 1:
                //pergunta 1
                String resposta = JOptionPane.showInputDialog("Quem descobriu o Brasil? \n"+
                "A) Pedro álvares cabral \n" +
                "B) Cristovão Colombo \n" +
                "C) Padre Fabio de Melo \n");

                resposta = resposta.toLowerCase(); //deixa em letra mínuscula

                //valida se a alternativa existe
                while (!"a".equals(resposta) && !"b".equals(resposta) && !"c".equals(resposta)) {
                    resposta = JOptionPane.showInputDialog("Alternativa inválida! Quem descobriu o Brasil? \n"+
                    "A) Pedro álvares cabral \n" +
                    "B) Cristovão Colombo \n" +
                    "C) Padre Fabio de Melo \n");
                }
                
                resposta = resposta.toLowerCase(); //deixa em letra mínuscula

                //verifica resposta
                switch (resposta) {
                    case "a":
                        JOptionPane.showMessageDialog(null, "Você acertou! Pode retirar seu bônus na Shostners and Shostners");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Você não acertou, mas tente novamente numa próxima!");
                        break;
                }
                break;
            case 2:
                //pergunta 2
                resposta = JOptionPane.showInputDialog("Qual a capital do Brasil? \n"+
                "A) Rio de Janeiro \n" +
                "B) Brasilia \n" +
                "C) Joinville \n");

                resposta = resposta.toLowerCase(); //deixa em letra mínuscula

                //valida se a alternativa existe
                while (!"a".equals(resposta) && !"b".equals(resposta) && !"c".equals(resposta)) {
                    resposta = JOptionPane.showInputDialog("Alternativa inválida! Qual a capital do Brasil? \n"+
                    "A) Rio de Janeiro \n" +
                    "B) Brasilia \n" +
                    "C) Joinville \n");
                }

                resposta = resposta.toLowerCase(); //deixa em letra mínuscula

                //verifica resposta
                switch (resposta) {
                    case "b":
                        JOptionPane.showMessageDialog(null, "Você acertou! Pode retirar seu bônus na Shostners and Shostners");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Você não acertou, mas tente novamente numa próxima!");
                        break;
                }
                break;
                
            }
    }
}
