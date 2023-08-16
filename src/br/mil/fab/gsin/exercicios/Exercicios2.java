package br.mil.fab.gsin.exercicios;

import java.util.Arrays;

public class Exercicios2 {
    public static void main(String[] args) {
        int[] array = {2, 5, 4, 7, 9, 8};

        System.out.println(Arrays.toString(arrayPares(array)));// exercicio 6
        System.out.println(somaElementosArray(array));// exercicio 7
        System.out.println(converteCharParaString(new char[]{'A', 'N', 'A'}));// exercicio 8
        System.out.println(stringParaArrayChar("ANA"));// exercicio 9
        System.out.println(nomesEstados("RJ"));// exercicio 10
    }

    // Crie uma estrutura switch que receba a sigla de um estado e retorne o nome por extenso
    private static String nomesEstados(String sigla) {
        switch (sigla) {
            case "RJ":
                return "Rio de Janeiro";
            case "SP":
                return "São Paulo";
            case "MG":
                return "Minas Gerais";
            case "RS":
                return "Rio Grande do Sul";
            case "BA":
                return "Bahia";

            default:
                return "Sigla inválida";
        }
    }

    //Crie um algoritmo que receba uma String e retorne um array de char
    private static char[] stringParaArrayChar(String texto) {
        int tamanhoArray = texto.length();
        char[] arrayChar = new char[tamanhoArray];
        for (int i = 0; i < arrayChar.length; i++) {
            arrayChar[i] = texto.charAt(i);
        }
        return arrayChar; // ou apenas texto.toCharArray();
    }

    // Crie um algoritmo que receba um array de elementos do tipo char e crie um String a partir dele
    private static String converteCharParaString(char[] arrayChar) {
        String concatenado = "";
        for (int i = 0; i < arrayChar.length; i++) {
            concatenado += arrayChar[i];
        }
        return concatenado;
    }

    // Crie um algoritmo que receba um array e retorne a soma de todos os seus elementos
    private static int somaElementosArray(int[] array) {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        return soma;
    }

    // Crie um algoritmo que receba um array e retorne um novo array contendo apenas numeros pares
    private static int[] arrayPares(int[] arrayInteiros) {
        int numerosPares = 0;
        for (int i = 0; i < arrayInteiros.length; i++) {
            if (arrayInteiros[i] % 2 == 0) {
                numerosPares++;
            }
        }
        int[] arrayPares = new int[numerosPares];
        int contador = 0;
        for (int i = 0; i < arrayInteiros.length; i++) {
            if (arrayInteiros[i] % 2 == 0) {
                arrayPares[contador] = arrayInteiros[i];
                contador++;
            }
        }
        return arrayPares;
    }
}
