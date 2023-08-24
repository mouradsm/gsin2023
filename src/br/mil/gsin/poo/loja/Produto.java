package br.mil.gsin.poo.loja;

public class Produto {
    private int codigo;
    private String nome;
    private double valor;
    private char tamanho;

    public void exibirDescricao(){
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("valor: R$ " + this.valor);
        System.out.println("Tamanho: " + this.tamanho);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
}
