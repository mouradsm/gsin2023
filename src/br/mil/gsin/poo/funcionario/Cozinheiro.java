package br.mil.gsin.poo.funcionario;

public class Cozinheiro extends Funcionario {

    private String especialidade;

    public Cozinheiro(String nome, String cargo) {
        super(nome, cargo);
    }

    @Override
    public void trabalhar() {
        System.out.println(this.getNome() + " está cozinhando !");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
