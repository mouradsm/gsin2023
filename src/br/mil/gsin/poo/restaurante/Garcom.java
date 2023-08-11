package br.mil.gsin.poo.restaurante;

// Declaração da classe Garcom, que herda da classe Funcionario
public class Garcom extends Funcionario {

    // Construtor da classe Garcom
    public Garcom(String nome, String cargo) {
        super(nome, cargo); // Chama o construtor da classe base (Funcionario) com o nome e cargo
    }

    // Implementação do método abstrato "trabalhar()" da classe Funcionario
    @Override
    public void trabalhar() {
        System.out.println(this.getNome() + " está servindo!"); // Imprime uma mensagem de ação do garçom
    }
}
