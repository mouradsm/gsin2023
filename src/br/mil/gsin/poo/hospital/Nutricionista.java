package br.mil.gsin.poo.hospital;

public class Nutricionista extends Medico {

    // Atributo específico da classe Nutricionista
    private String areaEspecializacao;

    // Construtor da classe Nutricionista
    public Nutricionista(String nome) {
        // Chama o construtor da classe base (Medico) para definir o nome e a especialidade do Nutricionista
        super(nome, "Nutrição");
    }

    // Implementação do método abstrato atenderPaciente da classe Medico
    @Override
    public void atenderPaciente() {
        System.out.println(this.getNome() + " está realizando uma consulta nutricional.");
    }

    // Método específico da classe Nutricionista para calcular o IMC (Índice de Massa Corporal)
    public void calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);
    }

    // Métodos getter e setter para o atributo areaEspecializacao
    public String getAreaEspecializacao() {
        return areaEspecializacao;
    }

    public void setAreaEspecializacao(String areaEspecializacao) {
        this.areaEspecializacao = areaEspecializacao;
    }
}
