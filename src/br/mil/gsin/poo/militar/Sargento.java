package br.mil.gsin.poo.militar;

// Declaração da classe Sargento, que herda de Militar
public class Sargento extends Militar {

    // Construtor da classe Sargento
    public Sargento(String nomeGuerra, String saram) {
        // Chama o construtor da classe pai (Militar) passando os parâmetros
        super(nomeGuerra, saram);
    }

    // Método específico da classe Sargento
    public void trabalhar() {
        // Imprime uma mensagem indicando que o sargento está trabalhando
        System.out.println(this.getNomeGuerra() + " está trabalhando!");
    }
}

