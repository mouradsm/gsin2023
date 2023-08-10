package br.mil.gsin.poo.militar;

// Declaração da classe SegundoSargento que herda da classe Sargento
public class SegundoSargento extends Sargento {

    // Atributo constante público e estático
    public static final double SOLDO = 4770;

    // Construtor da classe SegundoSargento que recebe nome de guerra e SARAM
    public SegundoSargento(String nomeGuerra, String saram) {
        // Chamando o construtor da classe base (Sargento) usando o super
        super(nomeGuerra, saram);
    }
}
