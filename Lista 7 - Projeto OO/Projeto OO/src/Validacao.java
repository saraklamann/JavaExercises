import javax.swing.JOptionPane;

public class Validacao {

    public static boolean validarOpcao(int opcao) {
        boolean opcaoValida=false;
        if (opcao!=0) {
            opcaoValida=true;
        }
        return opcaoValida;
    }

    public static boolean validarPreco(double preco) {
        boolean precoValido=false;
        while (preco<=0) {
            JOptionPane.showMessageDialog(null, "Este preço não é válido!");
            preco = Double.parseDouble(EntradaSaida.pedirDados("o preço"));
            precoValido = Validacao.validarPreco(preco);
        }
        precoValido=true;
        return precoValido;
    }
}
