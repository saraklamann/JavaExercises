import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {
    public static int pedirOpcao() {
        String opcoes[] = { "--", "Cadastrar produto", "Listar produtos", "Consultar produto especifico",
                "Editar produto", "Excluir produto", "Consultar produtos a serem repostos", "Sair" };
        JComboBox<String> menu = new JComboBox<String>(opcoes);
        String msg = "Escolha a opção desejada";
        Object[] menuCompleto = { msg, menu };
        JOptionPane.showMessageDialog(null, menuCompleto);
        if (menu.getSelectedItem().equals("Sair")) {
            return -1;
        } else {
            return menu.getSelectedIndex();
        }
    }

    public static int pedirLocal() {
        String opcoes[] = { "--", "Cadastro Geral", "Estoque", "Sair" };
        JComboBox<String> menu = new JComboBox<String>(opcoes);
        String msg = "Selecione o local que deseja realizar a operação";
        Object[] menuCompleto = { msg, menu };
        JOptionPane.showMessageDialog(null, menuCompleto);
        if (menu.getSelectedItem().equals("Sair")) {
            return -1;
        } else {
            return menu.getSelectedIndex();
        }
    }

    public static String pedirDados(String msg) {
        return JOptionPane.showInputDialog("Insira " + msg + " do veículo");
    }

    public static int pedirMotor() {
        String opcoes[] = { "--", "Combustão", "Elétrico", "Híbrido" };
        JComboBox<String> menu = new JComboBox<String>(opcoes);
        String msg = "Selecione o tipo do motor";
        Object[] menuCompleto = { msg, menu };
        JOptionPane.showMessageDialog(null, menuCompleto);
        if (menu.getSelectedItem().equals("Sair")) {
            return -1;
        } else {
            return menu.getSelectedIndex();
        }
    }

    public static void mostrarProdutos(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static int pedirOpcaoAdicionar() {
        return Integer.parseInt(JOptionPane.showInputDialog("Deseja adicionar um produto ao estoque? \n" +
                "1 - Sim \n" +
                "2 - Não \n"));
    }

    public static int pedirQuantidade(String msg) {
        return Integer.parseInt(JOptionPane.showInputDialog("Digite quantas unidades do produto deseja " + msg + ": "));
    }

    public static int perguntarComoProcurar() {
        String opcoes[] = { "--", "Procurar por id", "Procurar por marca"};
        JComboBox<String> menu = new JComboBox<String>(opcoes);
        String msg = "Selecione como deseja procurar o produto";
        Object[] menuCompleto = { msg, menu };
        JOptionPane.showMessageDialog(null, menuCompleto);
        if (menu.getSelectedItem().equals("Sair")) {
            return -1;
        } else {
            return menu.getSelectedIndex();
        }
    }

    public static int pedirOqueRemover() {
        String opcoes[] = { "--", "Remover unidades", "Remover produto do estoque"};
        JComboBox<String> menu = new JComboBox<String>(opcoes);
        String msg = "Selecione como deseja procurar o produto";
        Object[] menuCompleto = { msg, menu };
        JOptionPane.showMessageDialog(null, menuCompleto);
        if (menu.getSelectedItem().equals("Sair")) {
            return -1;
        } else {
            return menu.getSelectedIndex();
        }
    }
}
