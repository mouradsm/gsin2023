package br.mil.gsin.poo.militar;

public class PrimeiroSargento extends Sargento{

    public static final double SOLDO = 5483;

    public PrimeiroSargento(String nomeGuerra, String saram) {
        super(nomeGuerra, saram);
    }

    @Override
    public void marchar() {
        System.out.println("Estou marchando mais ou menos");
    }

}
