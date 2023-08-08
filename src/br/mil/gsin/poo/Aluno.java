package br.mil.gsin.poo;

public class Aluno {

    // Atributos da classe
    private String nomeGuerra;
    private String milhao;
    private String esquadrao;

    // método construtor
    public Aluno() {
    }

    // método construtor. Usado para instanciar um Aluno passando nomeGuerra e esquadrao como parametro
    public Aluno(String nomeGuerra, String esquadrao) {
        this.nomeGuerra = nomeGuerra;
        this.esquadrao = esquadrao;
    }

    // Método nomeMilhao RETORNA uma String
    public String nomeMilhao() {
        return this.nomeGuerra + " - " + this.milhao;
    }

    // Método void NÃO retorna nada. Apenas executa o método println()
    public void pagar() {
        System.out.println("1...2...3...4...5...");
    }

    public void estudar() {
    }

    public String seApresentar() {
        return "Aluno " + this.nomeGuerra + " do esquadrão " + this.esquadrao;
    }

    public String getNomeGuerra() {
        return this.nomeGuerra;
    }

    // setta todo nome de guerra em maiusculo
    public void setNomeGuerra(String nomeGuerra) {
        this.nomeGuerra = nomeGuerra.toUpperCase();
    }

    public String getMilhao() {
        return this.milhao;
    }

    public void setMilhao(String milhao) {
        this.milhao = milhao;
    }

    public String getEsquadrao() {
        return this.esquadrao;
    }

    public void setEsquadrao(String esquadrao) {
        this.esquadrao = esquadrao;
    }
}
