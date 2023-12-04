package Exercicio01;
public class Principal {
    public static void main(String[] args) {
        double nota1 = EntradaSaida.pedirNumero("1ª ", "");
        boolean notaValida = Validacao.validarNota(nota1);
        while (notaValida == false) { //valida se a nota 1 está entre 0 e 10
            nota1 = EntradaSaida.pedirNumero("1ª ", "A nota não pode ser menor que zero ou maior que dez! ");
            notaValida = Validacao.validarNota(nota1);
        }

        double nota2 = EntradaSaida.pedirNumero("2ª ", "");
        notaValida = Validacao.validarNota(nota2);
        while (notaValida == false) { //valida se a nota 2 está entre 0 e 10
            nota2 = EntradaSaida.pedirNumero("2ª ", "A nota não pode ser menor que zero ou maior que dez! ");
            notaValida = Validacao.validarNota(nota2);
        }
        
        int opcao = EntradaSaida.pedirOpcao("");
        boolean opcaoValida = Validacao.validarOpcao(opcao);
        while (opcaoValida == false) {
            opcao = EntradaSaida.pedirOpcao("Opção Inválida! ");
            opcaoValida = Validacao.validarOpcao(opcao);
        }

        if (opcao == 1) { //média aritmética
            double media = Calculo.calcularMediaAritmetica(nota1, nota2);
            boolean aprovado = Resultado.avaliarMedia(media);
            EntradaSaida.mostrarResultado(media, aprovado);
        } else { //média ponderada
            double peso1 = EntradaSaida.pedirPeso("1ª ", "");
            double peso2 = EntradaSaida.pedirPeso("2ª ", "");
            boolean pesoValido = Validacao.validarPesos(peso1, peso2);
            while (pesoValido == false) { //verifica se os pesos são válidos
                peso1 = EntradaSaida.pedirPeso("1ª ", "A soma dos pesos deve ser 1 e nenhum dos pesos deve ser nulo ou negativo! \n");
                peso2 = EntradaSaida.pedirPeso("2ª ", "A soma dos pesos deve ser 1 e nenhum dos pesos deve ser nulo ou negativo! \n");
                pesoValido = Validacao.validarPesos(peso1, peso2);
            }
            
            double media = Calculo.calcularMediaPonderada(nota1, nota2, peso1, peso2);
            boolean aprovado = Resultado.avaliarMedia(media);
            EntradaSaida.mostrarResultado(media, aprovado);
        }
    }
}