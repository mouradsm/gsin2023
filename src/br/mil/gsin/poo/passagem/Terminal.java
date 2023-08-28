package br.mil.gsin.poo.passagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Terminal {
    private static List<Voo> voosDisponiveis = new ArrayList<>();
    private static final double TARIFA_EMBARQUE = 0.1;
    private static final String PREFIXO_LOCALIZADOR = "GSIN";


    private static int gerarCodigoVoo() {
        return voosDisponiveis.size() + 1;
    }

    public static void cadastrarVoo(String origem, String destino, String dataHora, double preco) {
        Voo novoVoo = new Voo(gerarCodigoVoo(), origem, destino, dataHora, preco);
        voosDisponiveis.add(novoVoo);
    }

    public static void listarVoosDisponiveis() {
        for (Voo voo : voosDisponiveis) {
            voo.exibirDescricao();
        }
    }

    public static Voo obterVooPorCodigo(int codigoVoo) {
        for (Voo voo : voosDisponiveis) {
            if (voo.getCodigo() == codigoVoo) {
                return voo;
            }
        }

        System.out.printf("Voo não encontrado!");
        return null;
    }

    public static Reserva reservarVoo(int codigoVoo, String nomePassageiro, String codigoAssento) {
        Voo vooSelecionado = obterVooPorCodigo(codigoVoo);
        int codigoReserva = new Random().nextInt(900) - 1;
        Reserva novaReserva = new Reserva(codigoReserva, vooSelecionado);
        novaReserva.adicionarBilhete(new Bilhete(nomePassageiro, codigoAssento));
        return novaReserva;
    }

    public static void comprarNovoBilhete(Reserva reserva, String nomePassageiro, String codigoAssento) {
        reserva.adicionarBilhete(new Bilhete(nomePassageiro, codigoAssento));
    }

    private static double calcularValorTotalComTarifas(double valorTotal) {
        return valorTotal + (valorTotal * TARIFA_EMBARQUE);
    }

    public static void fazerCheckin(Reserva reserva) {
        double novoValorTotal = calcularValorTotalComTarifas(reserva.getValorTotal());
        reserva.setValorTotal(novoValorTotal);

        for (Bilhete bilhete : reserva.getBilhetes()) {
            bilhete.setLocalizador(PREFIXO_LOCALIZADOR + reserva.getCodigo());
        }

        reserva.exibirDetalhes();
    }

}
