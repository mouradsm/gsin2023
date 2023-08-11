package br.mil.gsin.poo.hospital;

public abstract class Medico {

    private String nome;
    private String especialidade;
    private String hospital;

    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public abstract void atenderPaciente();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
}
