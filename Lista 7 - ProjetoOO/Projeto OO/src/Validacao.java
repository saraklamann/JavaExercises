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
        if (preco > 0) {
            precoValido = true;
        }
        
        return precoValido;
    }
        
}