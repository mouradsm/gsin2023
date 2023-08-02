package br.mil.fab.gsin.repeticao;

import java.util.Random;
import java.util.Scanner;

public class AulaWhile {

    public static void main(String[] args) {
        int contador = 0;
        /**
         * Estrutura de repetição. Repete o bloco ENQUANTO a condição for verdadeira
         * É necessario que a condição SOFRA ALTERAÇÃO DENTRO DA ESTRUTURA
         * Teste lógico no inicio
         */
        while (contador <= 10) {
            System.out.println("contador: " + contador);
            contador++;
        }
    }

    /**
     * Escreva um programa que solicite ao usuário um número inteiro
     * e exiba a tabuada desse número de 1 a 10.
     */
    public static void tabuada() {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int entrada = in.nextInt();

        int contador = 1;
        while (contador <= 10) {
            System.out.println(entrada + " x " + contador + " = " + entrada * contador);
            contador++;
        }
    }

    /**
     * Crie um programa que gera um número aleatório entre 1 e 100 e peça ao usuário para adivinhar o número.
     * O programa deve fornecer dicas se o palpite for muito alto ou muito baixo,
     * até que o usuário adivinhe corretamente.
     */
    public static void adivinharNumero() {

        int numeroAleatorio = new Random().nextInt(100);

        Scanner in = new Scanner(System.in);
        System.out.println("Qual número o programa escolheu ? ");
        int tentativaUsuario = in.nextInt();

        while (tentativaUsuario != numeroAleatorio) {
            if (tentativaUsuario < numeroAleatorio) {
                System.out.println("Tente um número maior !");
                tentativaUsuario = in.nextInt();
            } else {
                System.out.println("Tente um número menor !");
                tentativaUsuario = in.nextInt();
            }
        }

        System.out.println("Você ACERTOU ! Número: " + numeroAleatorio);


    }
}
