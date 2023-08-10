package br.mil.gsin.poo.militar;

// Declaração da classe final Aluno que herda da classe Militar
public final class Aluno extends Militar {
    // Atributo privado específico da classe Aluno
    private String milhao;

    // Atributo constante público e estático
    public static final double SOLDO = 1199;

    // Construtor da classe Aluno que recebe nome de guerra, SARAM e milhao
    public Aluno(String nomeGuerra, String saram, String milhao) {
        // Chamando o construtor da classe PAI (Militar) usando o super
        super(nomeGuerra, saram);
        // Inicializando o atributo milhao
        this.milhao = milhao;
    }

    // Método para estudar
    public void estudar() {
        // Implementação específica de estudo
    }

    // Sobrescrevendo o método marchar da classe pai Militar
    @Override
    public void marchar() {
        System.out.println("Estou marchando no padrão!");
    }

    // Método getter para o atributo milhao
    public String getMilhao() {
        return milhao;
    }

    // Método setter para o atributo milhao
    public void setMilhao(String milhao) {
        this.milhao = milhao;
    }
}

