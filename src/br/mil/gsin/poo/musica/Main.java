package br.mil.gsin.poo.musica;

public class Main {
    public static void main(String[] args) {

        // Cria uma nova instância da classe Musica usando o construtor padrão
        Musica musicaPericles = new Musica();

        // Configuração dos ATRIBUTOS da música usando os métodos SETTERS
        musicaPericles.setTitulo("Até que durou");
        musicaPericles.setArtista("Péricles");
        musicaPericles.setAno(2018);
        musicaPericles.setGenero("Pagode");
        musicaPericles.setAlbum("Em sua direção");

        // Exibe os créditos da música Pericles usando o método mostrarCreditos()
        System.out.println(musicaPericles.mostrarCreditos());

        // Inicia a reprodução da música Pericles usando o método reproduzir()
        musicaPericles.reproduzir();

        // Pausa a reprodução da música Pericles usando o método pausar()
        musicaPericles.pausar();

        // Cria uma nova instância da classe Musica com parâmetros através do construtor
        Musica musicaYellow = new Musica("Yellow", "Coldplay", "Parachutes");

        // Configuração dos atributos da música Yellow usando os métodos setters
        musicaYellow.setAno(2000);
        musicaYellow.setGenero("Pop Rock");
        musicaYellow.setDuracaoMinutos(4);

        // exibe os créditos da música Yellow usando o método mostrarCreditos()
        System.out.println(musicaYellow.mostrarCreditos());

        // Inicia a reprodução da música Yellow usando o método reproduzir()
        musicaYellow.reproduzir();

        // Pausa a reprodução da música Yellow usando o método pausar()
        musicaYellow.pausar();

    }
}
