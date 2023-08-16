package br.mil.gsin.poo.interfaces.pagamentos;

public class Carteira {

    private String nomeUsuario;
    private double saldo;

    public Carteira(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado na carteira de " + this.nomeUsuario);
    }

    public double sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente na carteira de " + this.nomeUsuario);
            return 0.0;
        }

        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado na carteira de " + this.nomeUsuario);
        return valor;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public double getSaldo() {
        return saldo;
    }

}
