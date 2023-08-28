package br.mil.gsin.poo.passagem;

public class Main {

    public static void main(String[] args) {

        Terminal.cadastrarVoo("SDU", "CGO", "24/12/2023", 850);
        Terminal.cadastrarVoo("SDU", "GUA", "29/12/2023", 1500);
        Terminal.cadastrarVoo("SDU", "POR", "29/12/2023", 1350);

        Terminal.listarVoosDisponiveis();

        Passageiro passageiro = new Passageiro("Passageiro da Silva", "12345678910");
        Reserva novaReserva = Terminal.reservarVoo(1, passageiro.getNome(), "L22");
        passageiro.setReserva(novaReserva);

        Terminal.comprarNovoBilhete(passageiro.getReserva(),"Passageira da Silva", "L21");
        Terminal.fazerCheckin(passageiro.getReserva());

    }
}
