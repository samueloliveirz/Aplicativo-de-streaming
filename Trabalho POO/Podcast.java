public class Podcast extends Conteudo {
    private Apresentador apresentador;
    private int episodios;

    public Podcast(int id, String titulo, double duracao, Apresentador apresentador, int episodios) {
        super(id, titulo, duracao);
        this.apresentador = apresentador;
        this.episodios = episodios;
    }

    public void ouvir() {
        System.out.println("Ouvindo podcast: " + titulo + " (Episódio #" + episodios + ") com " + apresentador.getNome());
    }

    public int getEpisodios() {
        return this.episodios;
    }
}
