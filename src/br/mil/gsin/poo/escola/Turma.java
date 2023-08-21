package br.mil.gsin.poo.escola;

import java.util.List;
import java.util.Random;

public class Turma {

    private String numero;
    private Curso curso;
    private Professor professor;
    private List<Aluno> alunos;

    public Turma() {
        this.numero = 2023 + "/" + new Random().nextInt(10);
    }

    public void exibirDescricao() {
        System.out.println("Numero: " + this.numero);
        System.out.println("Curso: " + this.curso.getNome());
        System.out.println("Professor: " + this.professor.getNome());
        System.out.println("Alunos Matriculados:");
        listarAlunosMatriculados();
    }

    public void listarAlunosMatriculados() {
        for (Aluno aluno : this.alunos) {
            System.out.println(aluno.getMatricula() + " - " + aluno.getNome());
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
