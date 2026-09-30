public class Musica {
    String titulo;
    String artista;
    int duracaoSegundos;
    boolean explicit;

    public Musica(String titulo, String artista, int duracaoSegundos, boolean explicit) {
        this.titulo = titulo;
        this.artista =  artista;
        this.duracaoSegundos = duracaoSegundos;
        this.explicit = explicit;
    }
}