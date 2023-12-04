package Exercicio01;

public class Principal {
    public static void main(String[] args) {
        Produto p = new Produto();
        Marca m = new Marca();
        m.nome = EntradaSaida.solicitarDados("a marca");
        p.marca = m.nome;
        p.modelo = EntradaSaida.solicitarDados("o modelo");
        p.ano = Integer.parseInt(EntradaSaida.solicitarDados("o ano"));
        p.motor = EntradaSaida.solicitarDados("o motor");
        p.preco = Double.parseDouble(EntradaSaida.solicitarDados("o preço"));
        EntradaSaida.mostrarProduto(p);

    }
}
