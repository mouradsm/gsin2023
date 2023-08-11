package br.mil.gsin.poo.hospital;

public class DepartamentoRH {

    public static final String NOME_HOSPITAL = "Hospital GSIN";

    public static void demitirMedico(Medico medico) {
        System.out.println(medico.getNome() + " foi demitido!");
    }

    public static void contratarMedico(Medico medico) {
        medico.setHospital(NOME_HOSPITAL);
        System.out.println(medico.getNome() + " foi contratado!");
    }
}
