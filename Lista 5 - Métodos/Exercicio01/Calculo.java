package Exercicio01;
public class Calculo {
    public static double calcularMediaAritmetica(double n1, double n2){
        double media = (n1 + n2) / 2;
        return media;
    }

    public static double calcularMediaPonderada(double n1, double n2, double peso1, double peso2){
        double media = (n1 * peso1) + (n2 * peso2);
        return media;
    }
}
