package br.mil.fab.gsin.exercicios;

import java.util.Arrays;

public class Exercicios3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sequenciaDecrescente(10)));
        System.out.println("Quantidade negativos: " + contaNegativos(new int[]{2, 5, -12, -8, -10, -5, 6}));
        System.out.println("Quantidade de vezes que 5 aparece: " + contaRepetidos(new int[]{22, 3, 5, 4, 87, 5, 60, 5, 42, 11, 5, 32, 10, 5, 7}, 5));
        System.out.println("Indice maior valor: " + posicaoMaiorValor(new int[]{15, 7, 8, 6, 45, 75, 12, 2, 25, 33, 60}));
        System.out.println("Novos elementos array: " + Arrays.toString(substituiElementos(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
    }

    private static int[] substituiElementos(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] % 2 == 0 ? array[i] + 1 : array[i] - 1;
        }
        return array;
    }

    private static int posicaoMaiorValor(int[] array) {
        int indice = 0;
        int maiorValor = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maiorValor) {
                maiorValor = array[i];
                indice = i;
            }
        }
        return indice;
    }

    private static int contaRepetidos(int[] array, int num) {
        int repetidos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                repetidos++;
            }
        }
        return repetidos;
    }

    private static int contaNegativos(int[] array) {
        int negativos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativos++;
            }
        }
        return negativos;
    }

    private static int[] sequenciaDecrescente(int num) {
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = num;
            num--;
        }
        return array;
    }


}
