package Exercicio03;

public class Calculo {
    public static double calcularValorEmprestimo (double valorEmprestado, double taxa){
        double valorTotalEmprestimo = (valorEmprestado * taxa) + valorEmprestado;
        return valorTotalEmprestimo;
    }

    public static double calcularValorParcela (double valorTotalEmprestimo, int prazo){
        double valorParcela = valorTotalEmprestimo / prazo;
        return valorParcela;
    }
}
