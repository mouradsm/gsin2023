package br.mil.gsin.poo.militar;

public class Main {
    public static void main(String[] args) {

        String frase = "olá, tudo bem?";

        Sargento sargentoSoares = new TerceiroSargento("Soares",
                Militar.gerarSaram());

        Militar sargentoMoura = new SegundoSargento("Moura",
                "6383416");

        Aluno alunoDeLima = new Aluno("De Lima",
                "654321",
                "23/3135");
        Militar alunaAndressa = new Aluno("Andressa",
                "987654",
                "23/5363");

        Sargento sargentoMaisonete = new PrimeiroSargento("Maisonete",
                "012585");


        alunaAndressa.marchar();
        sargentoMaisonete.marchar();

        //System.out.println(Pagamento.calcularAdicionalHabilitacao(SegundoSargento.SOLDO));

//        sargentoSoares.setSalario(8500);
//        sargentoMoura.setSalario(5000);
//        sargentoMaisonete.setSalario(15000);
//
//        alunoDeLima.setSalario(500);

//        Pagamento.pagarMilitar(sargentoSoares);
//        Pagamento.pagarMilitar(sargentoMoura);
//        Pagamento.pagarMilitar(sargentoMaisonete);
//        Pagamento.pagarMilitar(alunoDeLima);


    }
}

