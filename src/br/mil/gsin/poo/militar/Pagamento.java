package br.mil.gsin.poo.militar;

public class Pagamento {

    public static final double ADICIONAL_HABILITACAO = 0.40;
    public static final double ADICIONAL_DISPONIBILIDADE = 0.12;
    public static final double ADICIONAL_ATIVIDADE = 0.16;

    public static double calcularAdicionalHabilitacao(double soldo) {
        return soldo * ADICIONAL_HABILITACAO;
    }

    public static double calcularAdicionalDisponibilidade(double soldo) {
        return soldo * ADICIONAL_DISPONIBILIDADE;
    }

    public static double calcularAdicionalAtividade(double soldo) {
        return soldo * ADICIONAL_ATIVIDADE;
    }

    public static void pagarMilitar(Militar militar) {
        System.out.println("Pagando o militar: " + militar.getNomeGuerra());
        System.out.println("Valor: " + militar.getSalario());
    }
}