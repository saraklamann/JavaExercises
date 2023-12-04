import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {
        //coleta de dados
        int quantidadeMinima = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade minima que deve constar em estoque: "));
        int quantidadeMaxima = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade máxima que deve constar em estoque: "));

        //validação
        while (quantidadeMaxima < quantidadeMinima || quantidadeMaxima == quantidadeMinima || quantidadeMaxima <= 0 || quantidadeMinima <= 0) {
            quantidadeMinima = Integer.parseInt(JOptionPane.showInputDialog("Os valores digitados não são coerentes, por favor informe o valor MÍNIMO:"));
            quantidadeMaxima = Integer.parseInt(JOptionPane.showInputDialog("Os valores digitados não são coerente, por favor informe o valor MÁXIMO: "));
        }

        double media = (quantidadeMaxima + quantidadeMinima)/2;
        int estoqueAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de produtos em estoque no momento "));

        //verificação se é necessário ou não repor estoque
        if (estoqueAtual < media) {
            JOptionPane.showMessageDialog(null, "É necessário efetuar a compra de mais produtos!");
        } else {
            JOptionPane.showMessageDialog(null, "Não é necessário efetuar a compra de novos produtos!");
        }
    }
}