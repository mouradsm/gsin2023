package br.mil.fab.gsin;

public class EscopoVariavel {

    /**
     * STATIC é usado para indicar que um ATRIBUTO ou método
     * PERTECEM A CLASSE !
     *  tem escopo em toda a classe e podem ser
     *  compartilhadas por todas as instâncias dessa classe.
     *
     */
    static String placaCarro = "ABC123";
    /**
     * Variavel com escopo de instancia
     *  Elas têm escopo em toda a classe e
     *  podem ser usadas em qualquer método da mesma
     *  classe (desde que não sejam declaradas como static).
     */
    String modeloCarro = "Palio";

    public static void main(String[] args) {
        /**
         * Variável com Escopo de MÉTODO.
         * têm escopo restrito apenas ao MÉTODO em que foram declaradas.
         * Elas não são acessíveis fora desse bloco.
         */
        boolean sinalVerde = true;

        if (sinalVerde) {
            /**
             * Variavel com escopo de bloco.
             * só pode ser acessada dentro do IF {}
             */
            int velocidadeCarro = 100;
        }

        /**
         * Chama variavel de Classe placaCarro declarada com a palavra-chave STATIC
         */
        System.out.println("A placa do carro é : " + placaCarro);

    }
}
