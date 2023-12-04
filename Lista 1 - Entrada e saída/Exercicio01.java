import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio01{
    public static void main(String[] args){

        DecimalFormat df = new DecimalFormat("#,###.00"); //define o formato

        String nome, sobrenome, dataNascimento, grauInstrucao, cargoPretendido, cnh;
        double pretensaoSalarial;

        //coleta de dados
        nome = JOptionPane.showInputDialog("Informe seu nome: ");
        sobrenome = JOptionPane.showInputDialog("Informe seu sobrenome: ");
        dataNascimento = JOptionPane.showInputDialog("Informe sua data de nascimento XX/XX/XXXX: ");
        grauInstrucao = JOptionPane.showInputDialog("Informe seu grau de instrução (ensino médio, ensino técnico ou ensino superior): ");
        cargoPretendido = JOptionPane.showInputDialog("Informe o cargo pretendido: ");
        cnh = JOptionPane.showInputDialog("Possui CNH B (sim/não)?: ");
        pretensaoSalarial = Double.parseDouble(JOptionPane.showInputDialog("Informe a pretensão salarial: R$"));

        //mostra os dados cadastrados
        JOptionPane.showMessageDialog(null,"Cadastro confirmado!\n" + "Os dados cadastrados foram: \n" + "Nome completo: " + nome + " "+ sobrenome + "\n"
        + "Data de nascimento: " + dataNascimento + "\n" 
        + "Grau de instrução: " + grauInstrucao + "\n"
        + "Cargo pretendido: " + cargoPretendido + "\n"
        + "CNH B: " + cnh + "\n"
        + "Pretensão salarial: " + df.format(pretensaoSalarial));
        
    }
}