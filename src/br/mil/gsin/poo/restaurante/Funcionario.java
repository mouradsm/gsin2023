package br.mil.gsin.poo.restaurante;

// Declaração da classe abstrata Funcionario
public abstract class Funcionario {

    // Atributos privados da classe
    private String nome;    // Armazena o nome do funcionário
    private String cargo;   // Armazena o cargo do funcionário
    private double salario; // Armazena o salário do funcionário

    // Construtor da classe Funcionario
    public Funcionario(String nome, String cargo) {
        this.nome = nome;   // Inicializa o nome com o valor passado como parâmetro
        this.cargo = cargo; // Inicializa o cargo com o valor passado como parâmetro
    }

    // Método abstrato "trabalhar()", que será implementado nas classes filhas
    public abstract void trabalhar();

    // Métodos getters e setters para os atributos privados

    // Getter para o atributo "nome"
    public String getNome() {
        return nome;
    }

    // Setter para o atributo "nome"
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo "cargo"
    public String getCargo() {
        return cargo;
    }

    // Setter para o atributo "cargo"
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Getter para o atributo "salario"
    public double getSalario() {
        return salario;
    }

    // Setter para o atributo "salario"
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
