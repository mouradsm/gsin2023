package br.mil.gsin.poo.musica;

public class Musica {
    // atributos da classe
    private String titulo;
    private String artista;
    private String album;
    private String genero;
    private int ano;
    private int duracaoMinutos;

    // Construtor padrão
    public Musica() {
        // Define valores padrão para alguns atributos
        this.genero = "desconhecido";
        this.ano = 2023;
    }

    // Construtor com parâmetros
    public Musica(String titulo, String artista, String album) {
        // Define atributos a partir dos parâmetros fornecidos
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
    }

    // Método para reproduzir a música
    public void reproduzir() {
        System.out.println("reproduzindo: " + this.titulo + " - " + this.artista);
    }

    // Método para pausar a reprodução da música
    public void pausar() {
        System.out.println("pausada: " + this.titulo + " - " + this.artista);
    }

    // Método para mostrar os créditos da música
    public String mostrarCreditos() {
        return this.titulo + " - "
                + "album: " + this.album + " - "
                + "ano lançamento: " + this.ano + " - "
                + "intepretada por: " + this.artista + " - "
                + "gênero: " + this.genero + " - "
                + "duração: " + this.duracaoMinutos;
    }

    // Métodos getters e setters para as propriedades
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
}
