package br.mil.gsin.poo;

public class Main {

    public static void main(String[] args) {
        // Instanciando o objeto alunoDeLima
        Aluno alunoDeLima = new Aluno();

        alunoDeLima.setNomeGuerra("De Lima");
        alunoDeLima.setEsquadrao("Prata");
        alunoDeLima.setMilhao("23/12345");

        System.out.println(alunoDeLima.seApresentar());
        System.out.println(alunoDeLima.nomeMilhao());

        alunoDeLima.pagar();

        // Instanciando alunaMaria passando os atributos pelo método construtor
        Aluno alunaMaria = new Aluno("Maria", "Prata");
        alunaMaria.setMilhao("23/67891");

        System.out.println(alunaMaria.seApresentar());
        System.out.println(alunaMaria.nomeMilhao());

    }

}
