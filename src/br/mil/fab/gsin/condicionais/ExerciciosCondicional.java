package br.mil.fab.gsin.condicionais;

import java.util.Scanner;

public class ExerciciosCondicional {
    public static void main(String[] args) {
        pedraPapelTesoura();
    }

    public static void pedraPapelTesoura() {
        String player1 = "paper";
        String player2 = "rock";

        if (player1.equals("rock") && player2.equals("scissors")) {
            System.out.println("Player 1 ganhou !");
        } else if (player1.equals("paper") && player2.equals("rock")) {
            System.out.println("Player 1 ganhou !");
        } else if (player1.equals("scissors") && player2.equals("paper")) {
            System.out.println("Player 1 ganhou !");
        } else if (player1.equals(player2)) {
            System.out.println("Empate !");
        } else {
            System.out.println("Player 2 ganhou");
        }

    }

    public static void calcularImc() {
        double peso = 65.5;
        double altura = 1.68;

        double imc = peso / (altura * altura); // calculo IMC

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
            return;
        }

        if (imc <= 25) {
            System.out.println("Normal");
            return;
        }

        if (imc <= 30) {
            System.out.println("Acima do peso");
            return;
        }

        System.out.println("Obeso");
    }

    /**
     * Essa verificação existe porque,
     * por convenção, se o ano não for divisível por 100 (exemplo: 1901, 1902, ..., 1999),
     * consideramos que ele pertence ao século seguinte. Então, somamos 1 ao século
     * calculado pela divisão inteira.
     */
    public static void calculaSeculo() {
        int ano = 1900;
        int seculo = ano / 100;
        seculo = ano % 100 != 0 ? seculo + 1 : seculo;
        System.out.println(seculo);

    }

    public static void selecionaDiaSemana() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7");
        int dia = entrada.nextInt();
        String diaPorExtenso;

        switch (dia) {
            case 1:
                diaPorExtenso = "Domingo";
                break;
            case 2:
                diaPorExtenso = "Segunda-feira";
                break;
            case 3:
                diaPorExtenso = "Terça-feira";
                break;
            case 4:
                diaPorExtenso = "Quarta-feira";
                break;
            case 5:
                diaPorExtenso = "Quinta-feira";
                break;
            case 6:
                diaPorExtenso = "Sexta-feira";
                break;
            case 7:
                diaPorExtenso = "Sábado";
                break;
            default:
                diaPorExtenso = "Domingo";

        }

        System.out.println("O dia da semana é " + diaPorExtenso);
    }

    public static void graduacao() {

        Scanner entrada = new Scanner(System.in);
        String sigla = entrada.next().toUpperCase();
        String graduacao;

        switch (sigla) {
            case "3S":
                graduacao = "Terceiro-Sargento";
                break;
            case "2S":
                graduacao = "Segundo-Sargento";
                break;
            case "1S":
                graduacao = "Primeiro-Sargento";
                break;
            case "SO":
                graduacao = "Suboficial";
                break;
            default:
                graduacao = "Entrada não válida!";
                break;
        }

        System.out.println(graduacao);
    }

}
