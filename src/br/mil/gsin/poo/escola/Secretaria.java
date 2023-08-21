package br.mil.gsin.poo.escola;

import java.util.Random;

public class Secretaria {

    public static final String TURNO_TARDE = "Tarde";
    public static final String TURNO_MANHA = "Manha";

    private static int gerarMatricula() {
        return new Random().nextInt(6);
    }

    public static void matricularAluno(Aluno novoAluno) {
        novoAluno.setMatricula(gerarMatricula());
        novoAluno.setTurno(novoAluno.getIdade() % 2 == 0 ? TURNO_TARDE : TURNO_MANHA);
        System.out.println("Novo aluno matriculado: " + novoAluno.getMatricula() + " - " + novoAluno.getNome());
    }
}
