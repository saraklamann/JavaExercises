package Exercicio03;

public class Validacao {
    public static Boolean validarSalario(double salario){
        boolean salarioValido = false;
        if (salario > 0) {
            salarioValido = true;
        }
        return salarioValido;
    }

    public static boolean validarValorEmprestado(double valorEmprestado){
        boolean valorValido = false;
        if (valorEmprestado < 200000) {
            valorValido = true;
        }
        return valorValido;
    }

    public static boolean validarEmprestimoPossivel(double salario, double valorParcela){
        boolean emprestimoValido = false;
        salario *= 0.15;
        if (valorParcela < salario) {
            emprestimoValido = true;
        }
        return emprestimoValido;
    }
}
