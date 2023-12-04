import javax.swing.JOptionPane;

public class Exercicio04 {
    public static void main(String[] args) {
        String[] disciplinas = new String[4];
        int[] cargasHorarias = new int[4];
        String[] nomes = new String[4];

        for(int i=0; i < 4; i++){
            nomes[i] = JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "° professor");
            disciplinas[i] = JOptionPane.showInputDialog("Digite a disciplina do " + (i + 1) + "° professor");
            cargasHorarias[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária desta matéria"));
        }

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a disciplina que deseja ter mais informações: \n" +
        "1) " + disciplinas[0] + "\n" +
        "2) " + disciplinas[1] + "\n" +
        "3) " + disciplinas[2] + "\n" +
        "4) " + disciplinas[3] + "\n"));

        switch (opcao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Esta disciplina é lecionada por " + nomes[0] + " e tem a carga horária de " + cargasHorarias[0] + " horas.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Esta disciplina é lecionada por " + nomes[1] + " e tem a carga horária de " + cargasHorarias[1] + " horas.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Esta disciplina é lecionada por " + nomes[2] + " e tem a carga horária de " + cargasHorarias[2] + " horas.");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Esta disciplina é lecionada por " + nomes[3] + " e tem a carga horária de " + cargasHorarias[3] + " horas.");
                break;
        }
    }
}
