package br.mil.fab.gsin.exercicios;

public class Exercicios {

    public static void main(String[] args) {

        // Exercício 01: Calcula o resto da divisão entre 2 e 2
        System.out.println(restoDivisao(2, 2));

        // Exercício 02: Encontra o menor número entre 4, 6, 2 e 8
        System.out.println(menorNumero(4, 6, 2, 8));

        // Exercício 03: Inverte a string "EAGS" para "SGAE"
        System.out.println(inverteString("EAGS"));

        // Exercício 04: Concatena o primeiro e último caractere da string "PAI" para "PI"
        System.out.println(primeiroEhUltimo("PAI"));

        // Exercício 05: Calcula a soma do primeiro e último elemento do array {5, 8, 10, 15}
        System.out.println(somaPrimeiroUltimoElemento(new int[]{5, 8, 10, 15}));
    }

    // Exercício 05: Recebe um array e retorna a soma do primeiro e último elemento
    private static int somaPrimeiroUltimoElemento(int[] array) {
        int tamanhoArray = array.length;
        return array[0] + array[tamanhoArray - 1];
    }

    // Exercício 04: Recebe uma String e retorna o primeiro caractere concatenado com o último
    private static String primeiroEhUltimo(String texto) {
        int tamanhoTexto = texto.length();
        return "" + texto.charAt(0) + texto.charAt(tamanhoTexto - 1);
    }

    // Exercício 03: Recebe uma String e retorna outra String invertida
    private static String inverteString(String texto) {
        String textoInvertido = "";
        int tamanhoTexto = texto.length();

        for (int i = 0; i < tamanhoTexto; i++) {
            textoInvertido += texto.charAt(tamanhoTexto - i - 1);
        }

        return textoInvertido;
    }

    // Exercício 02: Recebe 4 números e retorna o menor entre eles
    private static int menorNumero(int n1, int n2, int n3, int n4) {
        int[] array = new int[]{n1, n2, n3, n4};
        int menorNumero = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < menorNumero) {
                menorNumero = array[i];
            }
        }
        return menorNumero;
    }

    // Exercício 01: Recebe 2 números e retorna o resto da divisão entre eles
    private static int restoDivisao(int n1, int n2) {
        return n1 % n2;
    }
}
