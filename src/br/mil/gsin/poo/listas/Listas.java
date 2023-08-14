package br.mil.gsin.poo.listas;

import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        // Criando um ArrayList de Strings
        ArrayList<String> listaNomes = new ArrayList<>();

        // Adicionando elementos ao ArrayList
        listaNomes.add("Alice");
        listaNomes.add("Bob");
        listaNomes.add("Carol");
        listaNomes.add("David");

        // Acessando elementos pelo índice
        String primeiroNome = listaNomes.get(0);
        System.out.println("Primeiro nome: " + primeiroNome);

        // Iterando pelos elementos usando um loop for-each
        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        // Verificando se o ArrayList contém um elemento
        boolean contemAlice = listaNomes.contains("Alice");
        System.out.println("Contém Alice? " + contemAlice);

        // Removendo um elemento
        listaNomes.remove("Bob");

        // Obtendo o tamanho do ArrayList
        int tamanho = listaNomes.size();
        System.out.println("Tamanho do ArrayList: " + tamanho);
    }
}
