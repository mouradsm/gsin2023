package br.mil.gsin.poo.restaurante;

public class Main {

    // Método principal
    public static void main(String[] args) {

        // Criação de um objeto Cozinheiro chamado "jacquin"
        Cozinheiro jacquin = new Cozinheiro("Jaccquin", "Chefe Cozinha");

        // Define a especialidade do cozinheiro
        jacquin.setEspecialidade("Cozinha Francesa");

        // Define o salário do cozinheiro como o valor do salário mínimo
        jacquin.setSalario(Pagamento.SALARIO_MINIMO);

        // Criação de um objeto Garcom chamado "campeao"
        Garcom campeao = new Garcom("Campeao", "Barista");

        // Define o salário do garçom como o valor do salário mínimo
        campeao.setSalario(Pagamento.SALARIO_MINIMO);

        // Chamada ao método "trabalhar()" do cozinheiro
        jacquin.trabalhar();

        // Chamada ao método "trabalhar()" do garçom
        campeao.trabalhar();

        // Calcula e adiciona o adicional noturno ao salário do cozinheiro
        Pagamento.calcularAdicionalNoturno(jacquin);

        // Efetua o pagamento do cozinheiro
        Pagamento.pagarFuncionario(jacquin);

        // Efetua o pagamento do garçom
        Pagamento.pagarFuncionario(campeao);
    }

}
