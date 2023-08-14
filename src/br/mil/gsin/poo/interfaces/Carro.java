package br.mil.gsin.poo.interfaces;

// Classe Carro que implementa a interface VeiculoInterface
public class Carro implements VeiculoInterface {

    // Implementação do método acelerar da interface VeiculoInterface
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    // Implementação do método frear da interface VeiculoInterface
    @Override
    public void frear() {
        System.out.println("O carro está freando.");
    }
}
