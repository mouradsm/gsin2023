package br.mil.gsin.poo.loja;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private static List<Produto> estoqueDisponivel = new ArrayList<>();

    public static int gerarCodigoProduto() {
        return estoqueDisponivel.size() + 1;
    }

    public static void cadastrarNovoProduto(String nome, double valor, char tamanho){
        Produto novoProduto = new Produto();
        novoProduto.setNome(nome);
        novoProduto.setValor(valor);
        novoProduto.setTamanho(tamanho);
        novoProduto.setCodigo(gerarCodigoProduto());

        estoqueDisponivel.add(novoProduto);

        System.out.println("Novo produto adicionado ao estoque: ");
        novoProduto.exibirDescricao();
    }

    public static void listarProdutosEmEstoque(){
        System.out.println("Produtos disponiveis em estoque: ");
        for (Produto produto : estoqueDisponivel){
            produto.exibirDescricao();
        }
        System.out.println("Quantidade: " + estoqueDisponivel.size());
    }

    public static void removerProdutoEstoquePorCodigo(int codigo){
        for (Produto produto: estoqueDisponivel){
            if (produto.getCodigo() == codigo){
                estoqueDisponivel.remove(produto);
                System.out.println("Produto removido do estoque");
                return;
            }
        }

        System.out.println("Nenhum produto encontrado com este código");
    }

    public static Produto obterProdutoEstoquePorCodigo(int codigo){
        for (Produto produto: estoqueDisponivel){
            if (produto.getCodigo() == codigo){
                return produto;
            }
        }

        System.out.println("Nenhum produto encontrado com este código");
        return null;
    }

    public static void checkout(Carrinho carrinho){
        for (Produto produto: carrinho.getProdutos()){
            estoqueDisponivel.remove(produto);
        }

        carrinho.exibirCarrinho();
        System.out.println("Compra finalizada com sucesso!");
    }

}
