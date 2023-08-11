package br.mil.gsin.poo.restaurante;

public class Garcom extends Funcionario {

    public Garcom(String nome, String cargo) {
        super(nome, cargo);
    }

    @Override
    public void trabalhar() {
        System.out.println(this.getNome() + " está servindo!");
    }

}
