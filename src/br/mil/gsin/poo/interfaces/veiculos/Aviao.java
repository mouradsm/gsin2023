package br.mil.gsin.poo.interfaces.veiculos;

// Classe Aviao que implementa a interface VeiculoInterface
public class Aviao implements VeiculoInterface {

    // Implementação do método acelerar da interface VeiculoInterface
    @Override
    public void acelerar() {
        System.out.println("O avião está acelerando.");
    }

    // Implementação do método frear da interface VeiculoInterface
    @Override
    public void frear() {
        System.out.println("O avião está freando.");
    }
}
