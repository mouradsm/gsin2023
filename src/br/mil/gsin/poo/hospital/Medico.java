package br.mil.gsin.poo.hospital;

// Declaração de uma classe abstrata chamada Medico
public abstract class Medico {

    // Atributos privados para armazenar informações sobre o médico
    private String nome;          // Armazena o nome do médico
    private String especialidade; // Armazena a especialidade do médico
    private String hospital;      // Armazena o nome do hospital onde o médico trabalha

    // Construtor da classe Medico, que recebe o nome e a especialidade como parâmetros
    public Medico(String nome, String especialidade) {
        this.nome = nome;                    // Inicializa o atributo nome
        this.especialidade = especialidade;  // Inicializa o atributo especialidade
    }

    // Método abstrato que representa o atendimento de um paciente (será implementado nas subclasses)
    public abstract void atenderPaciente();

    // Método getter para obter o nome do médico
    public String getNome() {
        return nome;
    }

    // Método setter para definir o nome do médico
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para obter a especialidade do médico
    public String getEspecialidade() {
        return especialidade;
    }

    // Método setter para definir a especialidade do médico
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    // Método getter para obter o nome do hospital onde o médico trabalha
    public String getHospital() {
        return hospital;
    }

    // Método setter para definir o nome do hospital onde o médico trabalha
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
}
