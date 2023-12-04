package Exercicio02;

public class Principal {
    public static void main(String[] args) {
        double salario = EntradaSaida.pedirSalario("");
        boolean salarioValido = Validacao.validarSalario(salario);

        while (salarioValido == false) { //valida se o salario está entre 500 e 3000
            salario = EntradaSaida.pedirSalario("O sálario não pode ser menor que R$500,00 ou maior que R$3000,00! ");
            salarioValido = Validacao.validarSalario(salario);
        }

        int extras = EntradaSaida.pedirHorasExtras();
        double descontoInss = Calculo.calcularDescontoInss(salario);
        double descontoIrpf = Calculo.calcularIrpf(salario);
        double descontoPlano = Calculo.calcularDescontoPlanoSaude(salario);
        double acrescimosHoraExtra = Calculo.calcularHorasExtras(salario, extras);
        double salarioLiquido = Calculo.calcularSalarioLiquido(salario, descontoInss, descontoIrpf, descontoPlano, acrescimosHoraExtra);
        
        EntradaSaida.mostrarSalario(salarioLiquido);
    }
}
