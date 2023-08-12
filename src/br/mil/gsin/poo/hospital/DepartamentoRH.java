package br.mil.gsin.poo.hospital;

public class DepartamentoRH {

    // Constante que representa o nome do hospital
    public static final String NOME_HOSPITAL = "Hospital GSIN";

    // Método para demitir um médico
    public static void demitirMedico(Medico medico) {
        System.out.println(medico.getNome() + " foi demitido!");
    }

    // Método para contratar um médico
    public static void contratarMedico(Medico medico) {
        // Define o hospital do médico como o nome do hospital constante
        medico.setHospital(NOME_HOSPITAL);
        System.out.println(medico.getNome() + " foi contratado!");
    }
}
