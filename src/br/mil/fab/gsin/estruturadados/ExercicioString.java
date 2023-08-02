package br.mil.fab.gsin.estruturadados;

public class ExercicioString {
    public static void main(String[] args) {
        contarQuantidadePalavrasSeparadas();
    }

    public static String saudacao(String name) {
        return String.format("Hello, %s how are you doing today?", name);
    }

    public static String obterCentroString(String palavra) {
        int centro = palavra.length() / 2;
        if (palavra.length() % 2 == 0) {
            return palavra.substring(centro - 1, centro + 1);
        }
        return palavra.substring(centro, centro + 1);
    }

    public static void contarQuantidadePalavrasSeparadas() {
        String frase = "Eu gosto de programar em Java";
        String[] palavras = frase.split(" ");
        System.out.println("Quantidade de palavras: " + palavras.length);
        System.out.println(frase.split(" ").length);
    }


}
