package Exercicio01;
public class Validacao {
    public static boolean validarNota (double nota){
        boolean notaValida = false;
        if (nota >= 0 && nota <= 10) {
            notaValida = true;
        }
        return notaValida;
    }

    public static boolean validarOpcao (int opcao){
        boolean opcaoValida = false;
        if (opcao == 1 || opcao == 2) {
            opcaoValida = true;
        }
        return opcaoValida;
    }

    public static boolean validarPesos (double peso1, double peso2){
        boolean pesoValido = false;
        if (peso1 > 0 && peso1 < 1 && peso2 > 0 && peso2 < 1 && peso1 + peso2 == 1) {
            pesoValido = true;
        }
        return pesoValido;
    }
}
