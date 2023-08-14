package br.mil.gsin.poo.interfaces.veiculos;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();
        Aviao aviao = new Aviao();

        carro.acelerar();
        carro.frear();

        moto.acelerar();
        moto.frear();

        aviao.acelerar();
        aviao.frear();
    }
}
