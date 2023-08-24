package br.mil.gsin.poo.loja;

public class Main {
    public static void main(String[] args) {
        Cliente novoCliente = new Cliente("Soares",1686373765L );

        Estoque.cadastrarNovoProduto("Camisa fluminense", 250,'M');
        Estoque.cadastrarNovoProduto("Camisa fluminense", 250,'M');
        Estoque.cadastrarNovoProduto("Camisa fluminense", 250,'P');
        Estoque.cadastrarNovoProduto("Camisa fluminense", 250,'P');
        Estoque.cadastrarNovoProduto("Camisa flamengo", 250,'G');
        Estoque.cadastrarNovoProduto("Camisa flamengo", 250,'G');

        Estoque.listarProdutosEmEstoque();
        Estoque.removerProdutoEstoquePorCodigo(6);

        novoCliente.getCarrinho().adicionarProduto(Estoque.obterProdutoEstoquePorCodigo(1));
        novoCliente.getCarrinho().adicionarProduto(Estoque.obterProdutoEstoquePorCodigo(2));
        novoCliente.getCarrinho().adicionarProduto(Estoque.obterProdutoEstoquePorCodigo(3));

        Estoque.checkout(novoCliente.getCarrinho());
    }
}
