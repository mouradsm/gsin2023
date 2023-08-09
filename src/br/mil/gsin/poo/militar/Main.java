package br.mil.gsin.poo.militar;

public class Main {

    public static void main(String[] args) {

        // Criação de uma instância da classe Sargento chamada sargentoMoura
        // O construtor recebe o nome de guerra "Moura" e um número SARAM gerado aleatoriamente
        Sargento sargentoMoura = new Sargento("Moura", Militar.gerarSaram());
        // Define a identidade militar do sargentoMoura como "123456"
        sargentoMoura.setIdentidadeMilitar("123456");

        // Criação de uma instância da classe Aluno chamada alunaAndressa
        Aluno alunaAndressa = new Aluno("Andressa", Militar.gerarSaram());
        // Define a identidade militar da alunaAndressa como "654321"
        alunaAndressa.setIdentidadeMilitar("654321");
        // Define o atributo específico de Aluno, milhao, como "23/12345"
        alunaAndressa.setMilhao("23/12345");

        alunaAndressa.prestarContinencia();
        sargentoMoura.prestarContinencia();

        alunaAndressa.estudar();
        sargentoMoura.trabalhar();


    }
}
