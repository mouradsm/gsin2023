package br.mil.gsin.poo.militar;

public final class Aluno extends Militar {
    private String milhao;

    public static final double SOLDO = 1199;

    public Aluno(String nomeGuerra, String saram, String milhao) {
        super(nomeGuerra, saram);

        this.milhao = milhao;
    }

    public void estudar() {

    }

    @Override
    public void marchar() {
        System.out.println("Estou marchando no padrão!");
    }

    public String getMilhao() {
        return milhao;
    }

    public void setMilhao(String milhao) {
        this.milhao = milhao;
    }
}
