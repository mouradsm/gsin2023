package br.mil.gsin.poo.militar;

// Declaração da classe PrimeiroSargento que herda da classe Sargento
public class PrimeiroSargento extends Sargento {

    // Atributo constante público e estático
    public static final double SOLDO = 5483;

    // Construtor da classe PrimeiroSargento que recebe nome de guerra e SARAM
    public PrimeiroSargento(String nomeGuerra, String saram) {
        // Chamando o construtor da classe base (Sargento) usando o super
        super(nomeGuerra, saram);
    }

    // Sobrescrevendo o método marchar da classe base Sargento
    @Override
    public void marchar() {
        System.out.println("Estou marchando mais ou menos");
    }
}
