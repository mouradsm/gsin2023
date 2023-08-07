package br.mil.fab.gsin.arrays;

import java.util.Arrays;

public class ExerciciosArray {

    static int[] listaNumeros = new int[]{1, 2, 3, 4, 55, 6, 78, 8, 9, 10};

    public static void main(String[] args) {
       /* int[] input = new int[]{-1, -2, -3, -4, -5};
        System.out.println(Arrays.toString(invert(input)));
        countingSheep();
        int[] a = new int[]{1, 2, 2};
        System.out.println(squareSum(a));*/
        //verificaParImpar();
        //inverterPalavra();
        //verificarPalindromo();
        //encontrarMaior();
        //encontrarMenor();
        inverterArray();
    }

    public static void inverterArray(){
        int[] array = {1, 2, 3, 4, 5};

        int[] arrayInvertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInvertido[i] = array[array.length - i - 1];
        }

        System.out.println("Array original: " + Arrays.toString(array));
        System.out.println("Array invertido: " + Arrays.toString(arrayInvertido));
    }

    public static void verificaParImpar() {

        for (int i = 0; i < listaNumeros.length; i++) {
            String resultado = listaNumeros[i] % 2 == 0 ? "par" : "impar";
            System.out.println(listaNumeros[i] + " é " + resultado);
        }
    }

    public static void encontrarMaior() {
        int maior = 0;
        for (int i = 0; i < listaNumeros.length; i++) {
            maior = listaNumeros[i] > maior ? listaNumeros[i] : maior;
        }
        System.out.println("O maior é " + maior);
    }

    public static void encontrarMenor() {
        int[] args = new int[]{78, 56, 232, 12, 11, 43};
        int smallest = args[0];
        for (int i = 0; i < args.length; i++) {
            smallest = args[i] < smallest ? args[i] : smallest;
        }
        System.out.println("O menor é " + smallest);

        Arrays.sort(args);
        System.out.println("O menor é " + args[0]);

    }


    /**
     * Exercicio 1 - trocar sinal elementos do array
     *
     * @param array
     * @return
     */
    public static int[] trocarSinalElementosArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }

        return array;
    }

    /**
     * Exercicio 2 - Contar Ovelinhas
     */
    public static void contarOvelhas() {
        int num = 5;
        String resultado = "";
        for (int i = 1; i <= num; i++) {
            resultado += i + " ovelinha...";
        }

        System.out.println(resultado);
    }

    /**
     * Soma dos quadrados
     *
     * @param n
     * @return
     */
    public static int somaDosQuadrados(int[] n) {
        int soma = 0;
        for (int i = 0; i < n.length; i++) {
            soma += n[i] * n[i];
        }
        return soma;
    }

    /**
     * Inverter palavra
     */

    public static void inverterPalavra() {
        String world = "world";
        String inverso = "";
        char[] array = world.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            inverso += array[i];
        }

        System.out.println(inverso);
    }

    public static void verificarPalindromo() {
        String palavra = "teste";
        String inverso = new StringBuilder(palavra).reverse().toString();
        if (inverso.equals(palavra)) {
            System.out.println("PALINDROMO");
            return;
        }

        System.out.println("NÃO É PALINDROMO");
    }

    public static int maiorProduto(int[] inputArray) {
        int maiorProduto = Integer.MIN_VALUE;

        for (int j = 0; j < inputArray.length - 1; j++) {
            if (inputArray[j] * inputArray[j + 1] > maiorProduto) {
                maiorProduto = inputArray[j] * inputArray[j + 1];
            }
        }

        return maiorProduto;
    }


}


