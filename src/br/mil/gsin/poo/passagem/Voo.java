package br.mil.gsin.poo.passagem;

public class Voo {

    private int codigo;
    private String origem;
    private String destino;
    private String data;
    private double preco;

    public Voo(int codigo, String origem, String destino, String data, double preco) {
        this.codigo = codigo;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
        this.preco = preco;
    }

    public void exibirDescricao() {
        System.out.println("Voo Cod." + this.codigo);
        System.out.println("Origem: " + this.origem);
        System.out.println("Destino: " + this.destino);
        System.out.println("Data: " + this.data);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("-----");
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
