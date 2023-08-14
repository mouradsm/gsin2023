package br.mil.gsin.poo.interfaces.veiculos;

// Definição da classe Moto que implementa a interface VeiculoInterface
public class Moto implements VeiculoInterface {

    // Implementação do método acelerar() da interface VeiculoInterface
    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando.");
    }

    // Implementação do método frear() da interface VeiculoInterface
    @Override
    public void frear() {
        System.out.println("A moto está freando.");
    }
}

