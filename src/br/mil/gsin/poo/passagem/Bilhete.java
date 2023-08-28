package br.mil.gsin.poo.passagem;

public class Bilhete {

    private String localizador;
    private String nomePassageiro;
    private String codigoAssento;

    public Bilhete(String nomePassageiro, String codigoAssento) {
        this.nomePassageiro = nomePassageiro;
        this.codigoAssento = codigoAssento;
    }

    public void exibirDetalhes(){
        System.out.println("Localizador: " + this.localizador);
        System.out.println("Passageiro: " + this.nomePassageiro);
        System.out.println("Assento: " + this.codigoAssento);
    }

    public String getLocalizador() {
        return localizador;
    }

    public void setLocalizador(String localizador) {
        this.localizador = localizador;
    }
}
