import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Estoque {
    public ArrayList<ProdutoEstoque> listaDeProdutosEmEstoque = new ArrayList<ProdutoEstoque>();
    public ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();

    public void cadastrarCarro(int i, Produto p) {
        int opcao;

        p.setMarca(EntradaSaida.pedirDados("a marca"));
        p.setModelo(EntradaSaida.pedirDados("o modelo"));

        boolean opcaoValida = false;

        opcao = EntradaSaida.pedirMotor();
        opcaoValida = Validacao.validarOpcao(opcao);
        while (opcaoValida == false) {
            opcao = (EntradaSaida.pedirMotor());
            opcaoValida = Validacao.validarOpcao(opcao);
        }
        switch (opcao) {
            case 1:
                p.setMotor("Combustão");
                break;
            case 2:
                p.setMotor("Elétrico");
                break;
            case 3:
                p.setMotor("Híbrido");
        }

        boolean formatoValido = false, precoValido = false;
        double preco = 0;

        while (formatoValido == false) {
            try {
                preco = Double.parseDouble(EntradaSaida.pedirDados("o preço"));
                precoValido = Validacao.validarPreco(preco);
                while (precoValido == false) {
                    JOptionPane.showMessageDialog(null, "Este preço não é válido");
                    preco = Double.parseDouble(EntradaSaida.pedirDados("o preço"));
                    precoValido = Validacao.validarPreco(preco);
                }
                formatoValido = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Este preço não é válido");
            }
        }
        p.setPreco(preco);

        p.setCodigo(i + 1);

        this.listaDeProdutos.add(p);
    }

    public boolean procurarId(int id) {
        boolean cadastrado = false;
        for (Produto p : this.listaDeProdutos) {
            if (id == p.getCodigo()) {
                cadastrado = true;
            }
        }
        return cadastrado;
    }

    public void cadastrarCarroEmEstoque(ProdutoEstoque pEstoque, int id) {
        for (Produto p : this.listaDeProdutos) {
            if (p.getCodigo() == id) {
                pEstoque.setProduto(p);
                pEstoque.setQuantidadeMinima(
                        Integer.parseInt(EntradaSaida.pedirDados("a quantidade mínima em estoque")));
                pEstoque.setQuantidadeAtual(Integer.parseInt(EntradaSaida.pedirDados("a quantidade atual em estoque")));
                this.listaDeProdutosEmEstoque.add(pEstoque);
            }
        }
    }

    public String listarProdutos() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        String produtos = "Os produtos cadastrados no sistema são:\n\n";
        int i = 0;
        for (Produto p : this.listaDeProdutos) {
            produtos += (i + 1) + "° Produto: \n"
                    + "Código: " + p.getCodigo() + "\n"
                    + "Marca: " + p.getMarca() + "\n"
                    + "Modelo: " + p.getModelo() + "\n"
                    + "Motor: " + p.getMotor() + "\n"
                    + "Preço: " + df.format(p.getPreco()) + "\n\n";
            i++;
        }
        return produtos;
    }

    public String listarProdutosEmEstoque() {
        DecimalFormat df = new DecimalFormat("#,###.00");
        String produtos = "Os produtos em estoque são:\n\n";
        int i = 0;

        for (ProdutoEstoque pEstoque : this.listaDeProdutosEmEstoque) {
            produtos += (i + 1) + "° Produto: \n"
                    + "Código: " + pEstoque.getProduto().getCodigo() + "\n"
                    + "Marca: " + pEstoque.getProduto().getMarca() + "\n"
                    + "Modelo: " + pEstoque.getProduto().getModelo() + "\n"
                    + "Motor: " + pEstoque.getProduto().getMotor() + "\n"
                    + "Preço: " + df.format(pEstoque.getProduto().getPreco()) + "\n"
                    + "Quantidade mínima: " + pEstoque.getQuantidadeMinima() + "\n"
                    + "Quantidade atual: " + pEstoque.getQuantidadeAtual() + "\n\n";
            i++;
        }
        return produtos;
    }

    public String listarAtributosProduto(int id) {
        String produto = "O produto encontrado com este código foi: \n\n";
        DecimalFormat df = new DecimalFormat("R$#,###.00");

        for (ProdutoEstoque pEstoque : this.listaDeProdutosEmEstoque) {
            if (id == pEstoque.getProduto().getCodigo()) {
                produto += "Código: " + pEstoque.getProduto().getCodigo() + "\n"
                        + "Marca: " + pEstoque.getProduto().getMarca() + "\n"
                        + "Modelo: " + pEstoque.getProduto().getModelo() + "\n"
                        + "Motor: " + pEstoque.getProduto().getMotor() + "\n"
                        + "Preço: " + df.format(pEstoque.getProduto().getPreco()) + "\n"
                        + "Quantidade mínima: " + pEstoque.getQuantidadeMinima() + "\n"
                        + "Quantidade atual: " + pEstoque.getQuantidadeAtual() + "\n\n";
            }
        }
        return produto;
    }

    public boolean procurarMarca(String marca) {
        boolean cadastrado = false;
        for (ProdutoEstoque pEstoque : this.listaDeProdutosEmEstoque) {
            if (marca.equals(pEstoque.getProduto().getMarca())) {
                cadastrado = true;
            }
        }
        return cadastrado;
    }

    public String listarProdutosMarca(String marca) {
        String produtos = "Os produtos dessa marca disponiveis são: \n\n";
        DecimalFormat df = new DecimalFormat("R$#,###.00");

        for (ProdutoEstoque pEstoque : this.listaDeProdutosEmEstoque) {
            if (marca.equals(pEstoque.getProduto().getMarca())) {
                produtos += "Código: " + pEstoque.getProduto().getCodigo() + "\n"
                        + "Marca: " + pEstoque.getProduto().getMarca() + "\n"
                        + "Modelo: " + pEstoque.getProduto().getModelo() + "\n"
                        + "Motor: " + pEstoque.getProduto().getMotor() + "\n"
                        + "Preço: " + df.format(pEstoque.getProduto().getPreco()) + "\n"
                        + "Quantidade mínima: " + pEstoque.getQuantidadeMinima() + "\n"
                        + "Quantidade atual: " + pEstoque.getQuantidadeAtual() + "\n\n";
            }
        }
        return produtos;
    }

    public void editarProduto(int id) {
        for (Produto p : this.listaDeProdutos) {
            if (id == p.getCodigo()) {
                int opcao;

                p.setMarca(EntradaSaida.pedirDados("a marca"));
                p.setModelo(EntradaSaida.pedirDados("o modelo"));

                boolean opcaoValida = false;

                opcao = EntradaSaida.pedirMotor();
                opcaoValida = Validacao.validarOpcao(opcao);
                while (opcaoValida == false) {
                    opcao = (EntradaSaida.pedirMotor());
                    opcaoValida = Validacao.validarOpcao(opcao);
                }
                switch (opcao) {
                    case 1:
                        p.setMotor("Combustão");
                        break;
                    case 2:
                        p.setMotor("Elétrico");
                        break;
                    case 3:
                        p.setMotor("Híbrido");
                }

                p.setPreco(Double.parseDouble(EntradaSaida.pedirDados("o preço")));
                JOptionPane.showMessageDialog(null, "Produto editado com sucesso!");
            }
        }
    }

    public boolean verificarSeHaEstoque(int id) {
        boolean haEstoque = false;
        for (ProdutoEstoque pEstoque : this.listaDeProdutosEmEstoque) {
            if (pEstoque.getQuantidadeAtual() > 0) {
                haEstoque = true;
            }
        }
        return haEstoque;
    }

    public void removerProduto(int id) { 
        for (Produto p : listaDeProdutos) {
            if (p.getCodigo() == id) {
                
                this.listaDeProdutos.remove(p);
                break;
            }
        }
    }

    public boolean verificarSeEstaCadastradaNoEstoque(int id) {
        boolean cadastradoEstoque=false;
        for(ProdutoEstoque pEstoque : listaDeProdutosEmEstoque){
            if (id==pEstoque.getProduto().getCodigo()) {
                cadastradoEstoque = true;
            }
        }
        return cadastradoEstoque;
    }

    public void removerUnidade(int id) {
        for(ProdutoEstoque pEstoque : listaDeProdutosEmEstoque){
            if(id==pEstoque.getProduto().getCodigo()){
                pEstoque.setQuantidadeAtual((pEstoque.getQuantidadeAtual() - 1));
            }
        }
    }

    public void removerProdutoEstoque(int id) {
        for (ProdutoEstoque pEstoque: listaDeProdutosEmEstoque) {
            if (pEstoque.getProduto().getCodigo() == id) {
                this.listaDeProdutosEmEstoque.remove(pEstoque);
                break;
            }
        }
    }

    public String listarProdutosParaSeremRepostos() {
        DecimalFormat df = new DecimalFormat("R$#,###.00");

        String produtos="Os produtos que devem ser repostos são: \n\n";
        for(ProdutoEstoque pEstoque : this.listaDeProdutosEmEstoque){
            if (pEstoque.getQuantidadeAtual() <= pEstoque.getQuantidadeMinima()) {
                 produtos += "Código: " + pEstoque.getProduto().getCodigo() + "\n"
                        + "Marca: " + pEstoque.getProduto().getMarca() + "\n"
                        + "Modelo: " + pEstoque.getProduto().getModelo() + "\n"
                        + "Motor: " + pEstoque.getProduto().getMotor() + "\n"
                        + "Preço: " + df.format(pEstoque.getProduto().getPreco()) + "\n"
                        + "Quantidade mínima: " + pEstoque.getQuantidadeMinima() + "\n"
                        + "Quantidade atual: " + pEstoque.getQuantidadeAtual() + "\n\n";
            }
        }
        return produtos;
    }
}
