package br.mil.gsin.poo.militar;

// Declaração da classe abstrata Militar
public abstract class Militar {
    // Atributos privados da classe
    private String nomeGuerra;
    private String saram;
    private String identidadeMilitar;
    private double salario;

    // Construtor que recebe nome de guerra e SARAM
    public Militar(String nomeGuerra, String saram) {
        this.nomeGuerra = nomeGuerra;
        this.saram = saram;
    }

    // Construtor que recebe nome de guerra, SARAM e identidade militar
    public Militar(String nomeGuerra, String saram, String identidadeMilitar) {
        this.nomeGuerra = nomeGuerra;
        this.saram = saram;
        this.identidadeMilitar = identidadeMilitar;
    }

    // Método público para reformar o militar
    public void reformar() {
        System.out.println("Este militar foi reformado!");
    }

    // Método estático para gerar um SARAM
    public static String gerarSaram() {
        return "9876846";
    }

    // Método público para marchar
    public void marchar() {
        System.out.println("Estou marchando!");
    }

    // método abstrato para calcular o salário
    // public abstract void calcularSalario();

    // Getters e setters para os atributos privados
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
