package br.mil.gsin.poo.escola;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Aluno alunoLucas = new Aluno("Lucas",28,"M");
        Aluno alunaMaria = new Aluno("Maria",21,"F");
        Aluno alunoJoao = new Aluno("Joao",22,"M");

        Professor moura = new Professor("Moura",32,"M");
        moura.setEspecialidade("POO");

        Curso cursoPoo = new Curso("Programação Orientada a Objetos",2);

        Turma turmaGsin = new Turma();
        turmaGsin.setCurso(cursoPoo);
        turmaGsin.setProfessor(moura);

        Secretaria.matricularAluno(alunoLucas);
        Secretaria.matricularAluno(alunaMaria);
        Secretaria.matricularAluno(alunoJoao);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(alunaMaria);
        alunos.add(alunoJoao);
        alunos.add(alunoLucas);

        turmaGsin.setAlunos(alunos);
        turmaGsin.exibirDescricao();
    }
}
