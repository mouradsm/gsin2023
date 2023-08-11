package br.mil.gsin.poo.hospital;

public class Main {

    public static void main(String[] args) {

        Nutricionista nutriMaria = new Nutricionista("Maria");
        Psicologo psiCarol = new Psicologo("Ana Carolina");

        DepartamentoRH.contratarMedico(nutriMaria);
        DepartamentoRH.contratarMedico(psiCarol);

        psiCarol.atenderPaciente();
        nutriMaria.atenderPaciente();

        psiCarol.avaliarPacientePelaIdade(28);
        nutriMaria.calcularIMC(59,1.68);

        DepartamentoRH.demitirMedico(nutriMaria);
    }
}
