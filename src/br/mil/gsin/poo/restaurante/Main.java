package br.mil.gsin.poo.restaurante;

public class Main {

    public static void main(String[] args) {

        Cozinheiro jacquin = new Cozinheiro("Jaccquin", "Chefe Cozinha");
        jacquin.setEspecialidade("Cozinha Francesa");
        jacquin.setSalario(Pagamento.SALARIO_MINIMO);

        Garcom campeao = new Garcom("Campeao", "Barista");
        campeao.setSalario(Pagamento.SALARIO_MINIMO);

        jacquin.trabalhar();
        campeao.trabalhar();

        Pagamento.calcularAdicionalNoturno(jacquin);
        Pagamento.pagarFuncionario(jacquin);

        Pagamento.pagarFuncionario(campeao);
    }
}
