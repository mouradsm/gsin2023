package br.mil.gsin.poo.animal;

public class Passarinho extends Animal{

    private String especie;
    private String corPenas;

    public Passarinho(String nome) {
        super(nome);
    }

    public void voar(){
        System.out.println(this.getNome() + " está voando!");
    }

    public void cantar(){
        System.out.println(this.getNome() + " está cantando!");
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }
}
