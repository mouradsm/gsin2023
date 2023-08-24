package br.mil.gsin.poo.loja;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private double valorTotal;
    private List<Produto> produtos;

    public Carrinho() {
        this.valorTotal = 0;
        this.produtos = new ArrayList<>();
    }

    public void listarProdutos(){
        System.out.println("Produtos no carrinho: ");
        for (Produto produto: produtos){
            produto.exibirDescricao();
        }
    }

    public void adicionarProduto(Produto novoProduto){
        this.valorTotal += novoProduto.getValor();
        this.produtos.add(novoProduto);
        System.out.println("Novo produto adicionado ao carrinho: ");
        novoProduto.exibirDescricao();
    }

    public void exibirCarrinho(){
        System.out.println("=== Meu carrinho ===");
        listarProdutos();
        System.out.println("Valor total: R$ " + this.valorTotal);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
