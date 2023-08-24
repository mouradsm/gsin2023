package br.mil.gsin.poo.loja;

public class Cliente {

    private String nome;
    private long cpf;
    private Carrinho carrinho;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.carrinho = new Carrinho();
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
}
