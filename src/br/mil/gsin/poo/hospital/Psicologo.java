package br.mil.gsin.poo.hospital;

public class Psicologo extends Medico {

    private String abordagem;

    public Psicologo(String nome) {
        super(nome, "Psicologia");
    }

    @Override
    public void atenderPaciente() {
        System.out.println(getNome() + " está realizando uma sessão de terapia.");
    }

    public void avaliarPacientePelaIdade(int idade) {
        String condicao = idade % 2 == 0 ? "Doido" : "Normal";
        System.out.println("Paciente é " + condicao);
    }

    public String getAbordagem() {
        return abordagem;
    }

    public void setAbordagem(String abordagem) {
        this.abordagem = abordagem;
    }
}
