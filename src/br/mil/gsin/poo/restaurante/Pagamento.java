package br.mil.gsin.poo.restaurante;

// Declaração da classe Pagamento
public class Pagamento {

    // Constante que representa o valor do salário mínimo
    public static final double SALARIO_MINIMO = 1320;

    // Constante que representa o adicional noturno (20%)
    private static final double ADICIONAL_NOTURNO = 0.20;

    // Método estático para calcular o adicional noturno de um funcionário
    public static void calcularAdicionalNoturno(Funcionario funcionario) {
        // Calcula o valor do adicional noturno baseado no salário do funcionário
        double valorAdicionalNoturno = funcionario.getSalario() * ADICIONAL_NOTURNO;

        // Adiciona o valor do adicional noturno ao salário do funcionário
        funcionario.setSalario(funcionario.getSalario() + valorAdicionalNoturno);
    }

    // Método estático para efetuar o pagamento de um funcionário
    public static void pagarFuncionario(Funcionario funcionario) {
        System.out.println("Pagando funcionario: " + funcionario.getNome());
        System.out.println("Valor R$: " + funcionario.getSalario());
    }
}

