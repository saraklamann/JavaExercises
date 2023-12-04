package Exercicio02;

public class Validacao {
    public static boolean validarSalario(double salario){
        boolean salarioValido = false;
        if (salario >= 500 && salario <= 3000) {
            salarioValido = true;
        }
        return salarioValido;
    }
}
