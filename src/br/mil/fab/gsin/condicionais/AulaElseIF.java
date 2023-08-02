package br.mil.fab.gsin.condicionais;

public class AulaElseIF {

    public static void main(String[] args) {
        boolean sinalVerde = true;
        boolean sinalAmarelo = false;

        if (sinalVerde) {
            /**
             * Quando o programa executa um bloco dentro de um IF
             * ele pula pra o final de toda a cadeia de condições
             */
            System.out.println("acelerar !");
        } else if (sinalAmarelo) {
            System.out.println("diminuir velocidade . . .");
        } else {
            System.out.println("parar !");
        }

        sinalAmarelo = true;
        /**
         * Se os IFs não estiverem encadeados
         * é necessario usar o return para interromper o método.
         */
        if (sinalVerde) {
            System.out.println("acelerar !");
            return;
        }

        if (sinalAmarelo) {
            System.out.println("diminuir velocidade . . .");
            return;
        }
    }
}
