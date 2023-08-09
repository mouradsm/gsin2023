package br.mil.gsin.poo.militar;

import java.util.Random;

// Declaração da classe abstrata Militar
public abstract class Militar {

    // Atributos da classe Militar
    private String nomeGuerra;
    private String saram;
    private String identidadeMilitar;
    private double soldo;

    // Construtor da classe Militar
    public Militar(String nomeGuerra, String saram) {
        this.nomeGuerra = nomeGuerra;
        this.saram = saram;
    }

    // Método estático para gerar um número aleatório para o SARAM
    public static String gerarSaram() {
        return "1234567";
    }

    // Método para realizar a ação de marchar
    public void marchar() {
        System.out.println(this.nomeGuerra + " está marchando!");
    }

    // Método para realizar a ação de prestar continência
    public void prestarContinencia() {
        System.out.println(this.nomeGuerra + " prestou continência!");
    }

    // Métodos getters e setters para as propriedades
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

    public double getSoldo() {
        return soldo;
    }

    public void setSoldo(double soldo) {
        this.soldo = soldo;
    }
}
