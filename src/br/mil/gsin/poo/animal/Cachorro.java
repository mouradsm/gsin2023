package br.mil.gsin.poo.animal;

public class Cachorro extends Animal {

    private String raca;
    private String tipoPelo;

    public Cachorro(String nome) {
        super(nome);
    }

    public void latir() {
        System.out.println(this.getNome() + ": AU AU !");
    }

    public void abanarRabo() {
        System.out.println(this.getNome() + " abanou o rabo!");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }
}
