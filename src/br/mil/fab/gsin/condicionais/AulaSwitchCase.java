package br.mil.fab.gsin.condicionais;

import java.util.Scanner;

public class AulaSwitchCase {

    /**
     * Caixa Eletronico
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("$   Caixa 24H   $");
        System.out.println("Escolha uma opção: [1 - Saldo, 2 - Sacar, 3 - Emprestimo, 4 - Extrato]");

        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Seu saldo: R$4,500");
                break;
            case 2:
                System.out.println("Sacando ...$$$");
                break;
            case 3:
                System.out.println("Emprestimo solicitado ... $$$");
                break;
            case 4:
                System.out.println("Seu extrato . . .");
                break;
            default:
                System.out.println("Opção inválida !");
                break;
        }

    }
}
