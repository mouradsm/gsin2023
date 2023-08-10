package br.mil.gsin.poo.militar;

// Declaração da classe abstrata Sargento que herda da classe Militar
public abstract class Sargento extends Militar {

    // Construtor da classe Sargento que recebe nome de guerra e SARAM
    public Sargento(String nomeGuerra, String saram) {
        // Chamando o construtor da classe base (Militar) usando o super
        super(nomeGuerra, saram);
    }

    // Método para instruir
    public void instruir() {
        // Implementação específica de instrução
    }

    // Método para trabalhar
    public void trabalhar() {
        // Implementação específica de trabalho
    }
}
