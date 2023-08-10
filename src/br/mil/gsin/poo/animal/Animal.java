package br.mil.gsin.poo.animal;

public abstract class Animal {

    private String nome;
    private int idade;
    private double peso;
    private String sexo;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void comer(){
        System.out.println(this.nome + " está comendo");
    }

    public void dormir(){
        System.out.println(this.nome + " está dormindo");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
