import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Estoque e = new Estoque();
        int i =0;
        int opcao=0;

        do{
            opcao = EntradaSaida.pedirOpcao();
            boolean opcaoValida = false;
            opcaoValida = Validacao.validarOpcao(opcao);

            while (opcaoValida==false) {
                opcao = EntradaSaida.pedirOpcao();
                opcaoValida = Validacao.validarOpcao(opcao);
            }
            
            switch (opcao) {
                case 1:
                    opcao=0;
                    opcao = EntradaSaida.pedirLocal();
                    opcaoValida = false;
                    opcaoValida = Validacao.validarOpcao(opcao);
                    while (opcaoValida==false) {
                        opcao = EntradaSaida.pedirOpcao();
                        opcaoValida = Validacao.validarOpcao(opcao);
                    }
                    
                    if (opcao==1) {
                        Produto p = new Produto();
                        e.cadastrarCarro(i, p);
                        i++;
                    } else {
                        int id=0;
                        boolean idValido=false;
                        while (idValido==false) {
                            try {
                                id = Integer.parseInt(EntradaSaida.pedirDados("o código"));
                                idValido=true;
                            } catch (Exception x) {
                                JOptionPane.showMessageDialog(null, "Código Inválido!");
                            }
                        }
                        
                        boolean encontrado = e.procurarId(id);

                        if (encontrado==true) {
                            ProdutoEstoque pEstoque = new ProdutoEstoque();
                            e.cadastrarCarroEmEstoque(pEstoque, id);
                            break;
                        } else {
                            id = (i+1);
                            ProdutoEstoque pEstoque = new ProdutoEstoque();
                            Produto p = new Produto();
                            e.cadastrarCarro(i, p);
                            i++;
                            e.cadastrarCarroEmEstoque(pEstoque, id);
                        }
                    }
                    break;
                case 2:
                    opcao=0;
                    opcao = EntradaSaida.pedirLocal();
                    opcaoValida = false;
                    opcaoValida = Validacao.validarOpcao(opcao);
                    while (opcaoValida==false) {
                        opcao = EntradaSaida.pedirOpcao();
                        opcaoValida = Validacao.validarOpcao(opcao);
                    }
                    if (opcao==1) {
                        if (!e.listaDeProdutos.isEmpty()) {
                            EntradaSaida.mostrarProdutos(e.listarProdutos());
                        } else {
                            JOptionPane.showMessageDialog(null, "Não há produtos cadastrados no sistema");
                        }
                        break;
                    } else {
                        if (!e.listaDeProdutosEmEstoque.isEmpty()) {
                            EntradaSaida.mostrarProdutos(e.listarProdutosEmEstoque());
                        } else {
                            JOptionPane.showMessageDialog(null, "Não há produtos em estoque");
                        }
                    }
                    break;
                case 3:
                    opcao = EntradaSaida.perguntarComoProcurar();
                    opcaoValida = false;
                    opcaoValida = Validacao.validarOpcao(opcao);
                    while (opcaoValida==false) {
                        opcao = EntradaSaida.pedirOpcao();
                        opcaoValida = Validacao.validarOpcao(opcao);
                    }
                    if (opcao == 1) {
                        int id = Integer.parseInt(EntradaSaida.pedirDados("o id"));
                        boolean encontrado = e.procurarId(id);
                        if (encontrado==true) {
                            EntradaSaida.mostrarProdutos(e.listarAtributosProduto(id));
                        } else {
                            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                        }
                    } else {
                        String marca = EntradaSaida.pedirDados("marca");
                        boolean encontrado = e.procurarMarca(marca);
                        if (encontrado==true) {
                            EntradaSaida.mostrarProdutos(e.listarProdutosMarca(marca));
                        } else {
                            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                        }
                    }
                    break;
                case 4:
                    int id = Integer.parseInt(EntradaSaida.pedirDados("o id"));
                    boolean encontrado = e.procurarId(id);
                    if (encontrado==true) {
                        e.editarProduto(id);
                    } else {
                        JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                    }
                    break;
                case 5: 
                    opcao=0;
                    boolean haEstoque=false;
                    opcao = EntradaSaida.pedirLocal();
                    opcaoValida = false;

                    opcaoValida = Validacao.validarOpcao(opcao);
                    while (opcaoValida==false) {
                        opcao = EntradaSaida.pedirOpcao();
                        opcaoValida = Validacao.validarOpcao(opcao);
                    }

                    if (opcao==1) {
                        id = Integer.parseInt(EntradaSaida.pedirDados("o id"));
                        encontrado = e.procurarId(id);

                        if (encontrado==true) {
                            haEstoque = e.verificarSeHaEstoque(id);
                            if (haEstoque==true) {
                                JOptionPane.showMessageDialog(null, "Não foi possivel remover o produto pois ainda há estoque");
                            } else{
                                e.removerProduto(id);
                                JOptionPane.showMessageDialog(null, "Produto removido com sucesso");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                        }
                    } else{
                        id = Integer.parseInt(EntradaSaida.pedirDados("o id"));
                        encontrado = e.procurarId(id);

                        if (encontrado==true) {
                            boolean encontradoEstoque = e.verificarSeEstaCadastradaNoEstoque(id);
                            if (encontradoEstoque==true) {
                                opcao = EntradaSaida.pedirOqueRemover();
                                if (opcao == 1) {
                                    int quantidade = EntradaSaida.pedirQuantidade("remover");
                                    for(int j=0; j < quantidade; j++){
                                        e.removerUnidade(id);
                                        JOptionPane.showMessageDialog(null, (j+1) + "° Unidade foi removida com sucesso");
                                    }
                                } else {
                                    haEstoque = e.verificarSeHaEstoque(id);
                                    if (haEstoque==true) {
                                        JOptionPane.showMessageDialog(null, "Não foi possivel remover o produto pois ainda há estoque");
                                     } else {
                                        e.removerProdutoEstoque(id);
                                        JOptionPane.showMessageDialog(null, "Produto removido com sucesso");
                                     }
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Produto não registrado em estoque!");
                            } 
                        } else {
                            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                        }
                        //se estoque
                        //remover unidades ou remover o produto
                        //se unidades
                            //quantas
                            //remove x unidades
                        //se produto
                            //remove produto
                    }
                    break;
                case 6:
                    if (!e.listaDeProdutosEmEstoque.isEmpty()) {
                            EntradaSaida.mostrarProdutos(e.listarProdutosParaSeremRepostos());
                        } else {
                            JOptionPane.showMessageDialog(null, "Não há produtos a serem repostos");
                    }
                    break;
            }
        } while (opcao != -1);
    }
}
