package br.mil.gsin.poo.escola;

public class Aluno extends Pessoa {


    private int matricula;
    private String turno;

    public Aluno(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
