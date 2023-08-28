package br.mil.gsin.poo.passagem;

import java.util.ArrayList;
import java.util.List;

public class Reserva {

    private int codigo;
    private Voo voo;
    private List<Bilhete> bilhetes;
    private double valorTotal;

    public Reserva(int codigo, Voo voo) {
        this.codigo = codigo;
        this.voo = voo;
        this.bilhetes = new ArrayList<>();
    }

    public void exibirDetalhes() {
        System.out.println("Reserva Cod." + this.codigo);
        this.voo.exibirDescricao();
        System.out.println("Bilhetes:");
        listarBilhetes();

    }

    public void listarBilhetes() {
        for (Bilhete bilhete : bilhetes) {
            bilhete.exibirDetalhes();
        }
    }

    public void adicionarBilhete(Bilhete novoBilhete) {
        this.bilhetes.add(novoBilhete);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public List<Bilhete> getBilhetes() {
        return bilhetes;
    }

    public void setBilhetes(List<Bilhete> bilhetes) {
        this.bilhetes = bilhetes;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
