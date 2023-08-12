package br.mil.gsin.poo.hospital;

public class Psicologo extends Medico {

    // Atributo específico da classe Psicologo
    private String abordagem;

    // Construtor da classe Psicologo
    public Psicologo(String nome) {
        // Chama o construtor da classe base (Medico) para definir o nome e a especialidade do Psicologo
        super(nome, "Psicologia");
    }

    // Implementação do método abstrato atenderPaciente da classe Medico
    @Override
    public void atenderPaciente() {
        System.out.println(getNome() + " está realizando uma sessão de terapia.");
    }

    // Método específico da classe Psicologo para diagnosticar um paciente com base na idade
    public void diagnosticarPacientePelaIdade(int idade) {
        String condicao = idade % 2 == 0 ? "Doido" : "Normal";
        System.out.println("Paciente é " + condicao);
    }

    // Métodos getter e setter para o atributo abordagem
    public String getAbordagem() {
        return abordagem;
    }

    public void setAbordagem(String abordagem) {
        this.abordagem = abordagem;
    }
}
