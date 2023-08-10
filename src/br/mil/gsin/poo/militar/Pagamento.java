package br.mil.gsin.poo.militar;

// Declaração da classe Pagamento
public class Pagamento {

    // Atributos constantes para os adicionais
    public static final double ADICIONAL_HABILITACAO = 0.40;
    public static final double ADICIONAL_DISPONIBILIDADE = 0.12;
    public static final double ADICIONAL_ATIVIDADE = 0.16;

    // Método para calcular o adicional de habilitação
    public static double calcularAdicionalHabilitacao(double soldo) {
        return soldo * ADICIONAL_HABILITACAO;
    }

    // Método para calcular o adicional de disponibilidade
    public static double calcularAdicionalDisponibilidade(double soldo) {
        return soldo * ADICIONAL_DISPONIBILIDADE;
    }

    // Método para calcular o adicional de atividade
    public static double calcularAdicionalAtividade(double soldo) {
        return soldo * ADICIONAL_ATIVIDADE;
    }

    // Método para pagar um militar
    public static void pagarMilitar(Militar militar) {
        System.out.println("Pagando o militar: " + militar.getNomeGuerra());
        System.out.println("Valor: " + militar.getSalario());
    }
}
