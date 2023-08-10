package br.mil.gsin.poo.militar;

public abstract class Militar {
    private String nomeGuerra;
    private String saram;
    private String identidadeMilitar;

    private double salario;

    public Militar(String nomeGuerra, String saram) {
        this.nomeGuerra = nomeGuerra;
        this.saram = saram;
    }

    public Militar(String nomeGuerra, String saram, String identidadeMilitar) {
        this.nomeGuerra = nomeGuerra;
        this.saram = saram;
        this.identidadeMilitar = identidadeMilitar;
    }

    public void reformar() {
        System.out.println("Este militar foi reformado!");
    }


    public static String gerarSaram() {
        return "9876846";
    }

    public void marchar() {
        System.out.println("Estou marchando!");
    }

    //public abstract void calcularSalario();

    public String getNomeGuerra() {
        return nomeGuerra;
    }

    public void setNomeGuerra(String nomeGuerra) {
        this.nomeGuerra = nomeGuerra;
    }

    public String getSaram() {
        return saram;
    }

    public void setSaram(String saram) {
        this.saram = saram;
    }

    public String getIdentidadeMilitar() {
        return identidadeMilitar;
    }

    public void setIdentidadeMilitar(String identidadeMilitar) {
        this.identidadeMilitar = identidadeMilitar;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
