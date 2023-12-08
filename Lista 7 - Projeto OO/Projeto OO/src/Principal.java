import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        /* funções menu */
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

                        p.setMarca(EntradaSaida.pedirDados("a marca"));
                        p.setModelo(EntradaSaida.pedirDados("o modelo"));

                        opcaoValida=false;

                        while (opcaoValida==false) {
                           try{
                                p.setCodigo(Integer.parseInt(EntradaSaida.pedirDados("o código")));
                                opcaoValida=true;
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Este não é um código válido");
                            } 
                        }

                        opcao = EntradaSaida.pedirMotor();
                        opcaoValida = Validacao.validarOpcao(opcao);
                        while (opcaoValida==false) {
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
                        
                        boolean formatoValido=false, precoValido=false;
                        double preco=0;

                        while (formatoValido==false) {
                            try {
                                preco = Double.parseDouble(EntradaSaida.pedirDados("o preço"));
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Este preço não é válido");
                            }
                        }
                        
                        precoValido = Validacao.validarPreco(preco);
                        
                        while (precoValido==false) {
                            try {
                                preco = Double.parseDouble(EntradaSaida.pedirDados("o preço"));
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Este preço não é válido");
                            }
                        }

                        
                        //adicionar produto (p) no cadastro geral em lista de produtos
                    } else {
                        //cadastrar no estoque
                    }
            
                case 2:
                   
                    break;
                case 3:

                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
            }
        } while (opcao != -1);
        

        //         cadastrar produto no cadastro geral
        //         se contem o id na listaDeProdutos
        //             mostrar esse produto ja foi cadastrado
        //         fimse
        //     se 2
        //         verifica se está no cadastro geral
        //         se ta
        //             cadastrar produto no estoque
        //         se nao
        //             cadastrar produto no cadastro geral
        //             cadastrar produto no estoque

        //caso 2: //Consultar produ
        //     se 1
        //         verifica se ja existe
        //         se existe
        //             consultar produto cadastro geral
        //         se nao
        //             produto nao cadastrado no sistema
        //     se 2
        //         verifica se há produto em estoque
        //         se há
        //             consultar produto estoque
        //         senao 
        //             não há este produto em estoque

        //caso 3: //Editar produto
        //     onde?
        //     se 1
        //         verifica se ja existe
        //         se existe
        //             editar produto cadastro geral
        //         se nao
        //             produto nao cadastrado no sistema
        //     se 2
        //         verifica se há produto em estoque
        //         se há
        //             editar produto estoque
        //         senao 
        //             não há este produto em estoque
    
        //caso 4: //Excluir produto
        //     onde?
        //     se 1:
        //         verifica se existe no cadastro geral
        //         se sim
        //             verifica se há produto no estoque
        //             se sim
        //                 vce nao pode remover este produto do cadastro pois ainda há unidades em estoque
        //             se nao
        //                 excluir produto
        //         senao
        //             produto nao cadastrado
        //     se 2:
        //         verifica se existe no cadastro geral
        //         se sim
        //             verifica se há produto no estoque
        //             se sim
        //                 mostrar unidades em estoque
        //                 quantas unidades deseja remover
        //                 para i de 1 a quant
        //                 remover produto em estoque
        //             se nao
        //                 nao há este produto em estoque
        //         senao
        //             produto nao cadastrado
        //caso 0:
        //  sair
    }
}
