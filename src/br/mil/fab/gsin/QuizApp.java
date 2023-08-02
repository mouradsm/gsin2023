package br.mil.fab.gsin;

import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir o número de questões
        int numQuestoes = 1;

        // Criar arrays para armazenar as questões, alternativas e respostas corretas
        String[] questoes = new String[numQuestoes];
        String[][] alternativas = new String[numQuestoes][4];
        int[] respostasCorretas = new int[numQuestoes];

        // Solicitar ao usuário para inserir as questões e alternativas
        for (int i = 0; i < numQuestoes; i++) {
            System.out.println("Insira a questão " + (i + 1) + ":");
            questoes[i] = scanner.nextLine();

            System.out.println("Insira as 4 alternativas (A, B, C, D) separadas por vírgula:");
            String[] alternativasStr = scanner.nextLine().split(",");

            if (alternativasStr.length != 4) {
                System.out.println("Você deve inserir exatamente 4 alternativas!");
                return;
            }

            for (int j = 0; j < 4; j++) {
                alternativas[i][j] = alternativasStr[j].trim();
            }

            System.out.println("Insira o número da resposta correta (1, 2, 3 ou 4):");
            respostasCorretas[i] = Integer.parseInt(scanner.nextLine());
        }

        // Exibir as questões e alternativas e permitir ao usuário responder
        for (int i = 0; i < numQuestoes; i++) {
            System.out.println("\nQuestão " + (i + 1) + ": " + questoes[i]);
            System.out.println("A) " + alternativas[i][0]);
            System.out.println("B) " + alternativas[i][1]);
            System.out.println("C) " + alternativas[i][2]);
            System.out.println("D) " + alternativas[i][3]);

            System.out.println("Insira a letra da resposta correta (A, B, C ou D):");
            String respostaUsuario = scanner.nextLine().toUpperCase();

            int indiceRespostaCorreta = respostasCorretas[i] - 1;
            String respostaCorreta = alternativas[i][indiceRespostaCorreta];

            if (respostaUsuario.equals(respostaCorreta.toUpperCase())) {
                System.out.println("Resposta correta!");
            } else {
                System.out.println("Resposta incorreta. A resposta correta é: " + respostaCorreta);
            }
        }

        scanner.close();
    }
}
