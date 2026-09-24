package model.conteudo;

import model.usuario.Apresentador;

public class Podcast extends Conteudo {
    private Apresentador apresentador;
    private int episodios;

    public Podcast(int id, String titulo, int duracao, Apresentador apresentador, int episodios) {
        super(id, titulo, duracao);
        this.apresentador = apresentador;
        this.episodios = episodios;
    }


    @Override
    public void reproduzir() {
        ouvir();
    }

    public void ouvir() {
        System.out.println("Ouvindo podcast: " + getTitulo() + " (Episódio #" + episodios + ") com " + apresentador.getNome() + " [" + getDuracaoFormatada() + "]");
    }

    public int getEpisodios() {
        return this.episodios;
    }
}
