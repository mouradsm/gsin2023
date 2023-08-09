package br.mil.gsin.poo.militar;

// Declaração da classe Aluno, que herda de Militar
public class Aluno extends Militar {

    // Atributo específico da classe Aluno
    private String milhao;

    // Construtor da classe Aluno
    public Aluno(String nomeGuerra, String saram) {
        // Chama o construtor da classe pai (Militar) passando os parâmetros
        super(nomeGuerra, saram);
    }

    // Método para pagar (ainda não implementado)
    public void pagar() {
        // Implementação do método pagar
    }

    // Método para estudar
    public void estudar() {
        // Imprime uma mensagem indicando que o aluno está estudando
        System.out.println(this.getNomeGuerra() + " está estudando!");
    }

    // Métodos getters e setters para a propriedade milhao
    public String getMilhao() {
        return milhao;
    }

    public void setMilhao(String milhao) {
        this.milhao = milhao;
    }
}

