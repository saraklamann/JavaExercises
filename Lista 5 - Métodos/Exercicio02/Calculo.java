package Exercicio02;

public class Calculo {
    public static double calcularDescontoInss(double salario){
        return 0.2 * salario;
    }
    
    public static double calcularIrpf(double salario){
        return 0.1 * salario;
    }

    public static double calcularDescontoPlanoSaude(double salario){
        return 0.05 * salario;
    }

    public static double calcularHorasExtras(double salario, int horasExtras){
        double valorHora = salario / 160;
        double valorHoraExtra = (valorHora * 0.5) + valorHora;
        return horasExtras * valorHoraExtra;
    }

    public static double calcularSalarioLiquido(double salario, double descontoInss, double descontoIrpf, double descontoPlano, double acrescimosHoraExtra){
        return (salario + acrescimosHoraExtra) - descontoInss - descontoIrpf - descontoPlano;
    }
}