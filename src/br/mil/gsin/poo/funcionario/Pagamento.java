package br.mil.gsin.poo.funcionario;

public class Pagamento {

    public static final double SALARIO_MINIMO = 1320;
    private static final double ADICIONAL_NOTURNO = 0.20;

    public static void calcularAdicionalNoturno(Funcionario funcionario) {
        double valorAdicionalNoturno = funcionario.getSalario() * ADICIONAL_NOTURNO;
        funcionario.setSalario(funcionario.getSalario() + valorAdicionalNoturno);
    }

    public static void pagarFuncionario(Funcionario funcionario) {
        System.out.println("Pagando funcionario: " + funcionario.getNome());
        System.out.println("Valor R$: " + funcionario.getSalario());
    }
}
