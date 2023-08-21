package br.mil.gsin.poo.escola;

public class Professor extends Pessoa{

    private String especialidade;

    public Professor(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
