package br.mil.fab.gsin;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(5+5); // operação soma
        System.out.println("Minha idade é: " + 28); // concatenação

        int idade = 28;
        char sexo = 'M';
        boolean aluno = true;
        double salario = 4.500;
        long qtDiasReserva = 150000L;

        System.out.println("Minha idade é: " + idade);

        // OPERADORES MATEMATICOS E LÓGICOS

        int n1 = 5;
        int n2 = 5;
        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;
        int divisao = n1 / n2;
        int modulo = n1 % n2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Modulo: " + modulo);

        /**
         *  EXERCICIO 1 - ANO NASCIMENTO
         *  Criar uma variavel anoAtual = 2023 e exibir a data de nascimento
         *  Criar uma variavel anoNascimento e exibir no console
         *
         */

        int anoAtual = 2023;
        int anoNascimento = anoAtual - idade;
        System.out.println("Eu nasci no ano: " + anoNascimento);

        /**
         * EXERCICIO 2 - AREA TRIANGULO
         *  Criar variaveis e executar calculo area = (altura * base) / 2
         */

        int altura = 12;
        int base = 9;
        int area = (altura * base) / 2;
        System.out.println("A área do triângulo é: " + area);

        /**
         * EXERCICIO 3 - MEDIA
         */

        double nota1 = 6.5;
        double nota2 = 8.5;
        double media = (nota1 + nota2 * 2) /2;

        System.out.println("Media: " + media );

        // OPERADORES LÓGICOS E ESTRUTURA CONDICIONAL

        media = (nota1 + nota2) /2;

        if (media >= 7 ){
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO");
        }

        /**
         * EXERCICIO 4 - VERIFICA MAIOR IDADE
         */

        if (idade > 16){
            System.out.println("PODE DIRIGIR");
        } else {
            System.out.println("MENOR DE IDADE");
        }

        /**
         * EXERCICIO 5 - VERIFICA MAIOR IDADE E CARTEIRA
         */

        boolean possuiCarteira = true;
        if (idade > 16 && possuiCarteira){
            System.out.println("PODE DIRIGIR");
        } else {
            System.out.println("NAO PODE DIRIGIR");
        }

        /**
         * EXERCICIO 5 - INCREMENTAR LÓGICA
         */

        possuiCarteira = false;

        if (idade > 16){
            if (possuiCarteira){
                System.out.println("PODE DIRIGIR");
            } else {
                System.out.println("NÃO PODE DIRIGIR");
            }
        }else {
            System.out.println("MENOR DE IDADE");
        }

        // MÉTODOS

        String mensagem = "OLÁ ALUNO !!";
        exibirMensagem(mensagem);

        double ingresso = 10;
        double valorFinal = calcularDescontoAluno(ingresso);
        exibirMensagem("Valor do ingresso: " + ingresso);
        exibirMensagem("Valor com desconto:  " + valorFinal);

        calcularSeculo(1945);


    }

    public static double calcularDescontoAluno(double valor){
        return valor - valor * 0.10;
    }

    public static void exibirMensagem(String mensagem){
        System.out.println(mensagem);
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void calcularSeculo(int ano) {
        int seculo = ano / 100;
        if (ano % 100 != 0) {
            seculo++; // Arredonda para cima se não for exato
        }
        System.out.println("O século é: " + seculo);
    }

    public static boolean ehPalindromo(String palavra) {
        // Remover espaços e converter tudo para letras minúsculas para tornar a verificação não sensível a maiúsculas e minúsculas
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();

        int inicio = 0;
        int fim = palavra.length() - 1;

        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }
}
