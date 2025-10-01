public class Musica extends Conteudo {
    private Artista artista;
    private Album album;

    public Musica(int id, String titulo, double duracao, Artista artista, Album album) {
        super(id, titulo, duracao);
        this.artista = artista;
        this.album = album;
    }

    public void tocar() {
        System.out.println("Tocando música: " + titulo + " - " + artista.getNome() + " (Álbum: " + album.getTitulo() + ")");
    }

    public Album getAlbum() {
        return this.album;
    }
}