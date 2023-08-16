package br.mil.gsin.poo.interfaces.pagamentos;

public class Main {

    public static void main(String[] args) {

        Carteira carteira = new Carteira("Soares");
        carteira.depositar(800);

        double valorPagoCartao = carteira.sacar(200);

        CartaoCredito cartaoCredito = new CartaoCredito();
        cartaoCredito.realizarPagamento(valorPagoCartao);

        System.out.println("Meu Saldo: " + carteira.getSaldo());

    }
}
