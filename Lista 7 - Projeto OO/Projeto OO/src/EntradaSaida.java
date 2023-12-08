import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class EntradaSaida {

    public static int pedirOpcao() {
        String opcoes[] = {"--", "Cadastrar produto", "Listar produtos", "Consultar produto especifico", "Editar produto", "Excluir produto", "Sair"};
        JComboBox menu = new JComboBox<String>(opcoes);
        String msg="Escolha a opção desejada";
        Object[] menuCompleto= {msg, menu};
        JOptionPane.showMessageDialog(null, menuCompleto);
        if (menu.getSelectedItem().equals("Sair")) {
            return -1;
        } else{
            return menu.getSelectedIndex();
        }
    }

    public static int pedirLocal() {
        String opcoes[] = {"--", "Cadastro Geral", "Estoque", "Sair"};
        JComboBox menu = new JComboBox<String>(opcoes);
        String msg="Selecione o local que deseja realizar o cadastro";
        Object[] menuCompleto= {msg, menu};
        JOptionPane.showMessageDialog(null, menuCompleto);
        if (menu.getSelectedItem().equals("Sair")) {
            return -1;
        } else{
            return menu.getSelectedIndex();
        }
    }

    public static String pedirDados(String msg) {
        return JOptionPane.showInputDialog("Insira "+msg+" do veículo");
    }

    public static int pedirMotor() {
        String opcoes[] = {"--", "Combustão", "Elétrico", "Híbrido"};
        JComboBox menu = new JComboBox<String>(opcoes);
        String msg="Selecione o tipo do motor";
        Object[] menuCompleto= {msg, menu};
        JOptionPane.showMessageDialog(null, menuCompleto);
        if (menu.getSelectedItem().equals("Sair")) {
            return -1;
        } else{
            return menu.getSelectedIndex();
        }
    }
}
