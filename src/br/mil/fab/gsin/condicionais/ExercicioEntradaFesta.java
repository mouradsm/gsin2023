package br.mil.fab.gsin.condicionais;

import java.util.Scanner;

public class ExercicioEntradaFesta {

    /**
     * 1) Receber informações cliente [Nome, cpf, idade, aluno, esquadrao]
     * 2) validar CPF possui 11 digitos (SE Não, exibir mensagem: CPF INVALIDO !)
     * 3) Validar idade ( SE menor 18 exibir mensagem : Entrada Não permitida !)
     * 4) validar cliente é aluno ( SE for aluno receber informação de esquadrao)
     * 5) Se cliente for aluno aplicar desconto de 5%
     * 6) Se cliente for aluno e do esquadrao Chronus dar desconto de 10%
     * 7) Exibir valor do ingresso
     * @param args
     */
    public static void main(String[] args) {

        double valorIngresso = 30;

        String nome;
        String cpf;
        int idade;
        boolean aluno = false;
        String esquadrao;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        nome = scanner.next();

        System.out.println("Informe seu cpf: [Apenas números]");
        cpf = scanner.next();

        if (cpf.length() < 11){
            System.out.println("CPF INVÁLIDO !");
            return;
        }

        System.out.println("Informe sua idade:");
        idade = scanner.nextInt();

        if (idade < 18){
            System.out.println("Entrada não permitida, menor de idade !");
            return;
        }
        System.out.println("Você é aluno ? [ S ou N]");
        aluno = scanner.next().equalsIgnoreCase("S") ? true : false;

        if (aluno) {

            valorIngresso = valorIngresso - (valorIngresso*0.05);

            System.out.println("informe seu esquadrao:");
            esquadrao = scanner.next();

            if (esquadrao.equalsIgnoreCase("Chronus")){
                valorIngresso = valorIngresso - (valorIngresso*0.05);
            }
        }

        System.out.println("Total a pagar: R$ " + valorIngresso);



    }


}
