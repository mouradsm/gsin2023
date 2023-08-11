package br.mil.gsin.poo.restaurante;

// Declaração da classe Cozinheiro, que herda da classe Funcionario
public class Cozinheiro extends Funcionario {

    // Atributo específico da classe Cozinheiro
    private String especialidade;

    // Construtor da classe Cozinheiro
    public Cozinheiro(String nome, String cargo) {
        super(nome, cargo); // Chama o construtor da classe base (Funcionario) com o nome e cargo
    }

    // Implementação do método abstrato "trabalhar()" da classe Funcionario
    @Override
    public void trabalhar() {
        System.out.println(this.getNome() + " está cozinhando !"); // Imprime uma mensagem de ação do cozinheiro
    }

    // Métodos getters e setters para o atributo "especialidade"

    // Getter para o atributo "especialidade"
    public String getEspecialidade() {
        return especialidade;
    }

    // Setter para o atributo "especialidade"
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}

