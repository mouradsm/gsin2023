package br.mil.fab.gsin.arrays;

public class BubbleSort {


    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(array);
    }

    /**
     * compara um valor com o valor do lado e joga para o final da fila o valor maior.
     * ordenando o array.
     * 1 - percorrer de 2 em 2 comparando e fazendo a troca
     * 2 - quantidade maxima de vezes é baseado na quantidade de elementos do vetor
     *
     * @param vetor
     */
    public static void bubbleSort(int[] vetor) {
        int aux;
        boolean controle;

        for (int i = 0; i < vetor.length; i++) { // percorrendo todos os elementos do vetor
            controle = true;
            for (int j = 0; j < (vetor.length - 1); j++) {
                if (vetor[j] > vetor[j + 1]) { // comparando de 2 em dois e fazendo a troca
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    controle = false;
                }
            }

            if (controle) {
                break;
            }
        }

        imprimirVetor(vetor);
    }

    public static void imprimirVetor(int[] vetor) {
        System.out.println("Vetor: ");
        for (int i : vetor) {
            System.out.print(i + " ");
        }
    }

}
