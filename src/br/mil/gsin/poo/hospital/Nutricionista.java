package br.mil.gsin.poo.hospital;

public class Nutricionista extends Medico {

    private String areaEspecializacao;

    public Nutricionista(String nome) {
        super(nome, "Nutrição");
    }

    @Override
    public void atenderPaciente() {
        System.out.println(this.getNome() + " está realizando uma consulta nutricional.");
    }

    public void calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        System.out.println("Seu imc é: " + imc);
    }

    public String getAreaEspecializacao() {
        return areaEspecializacao;
    }

    public void setAreaEspecializacao(String areaEspecializacao) {
        this.areaEspecializacao = areaEspecializacao;
    }
}
