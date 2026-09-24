package model.conteudo;

import model.usuario.Artista;

public class VideoMusical extends Conteudo {
    private Artista artista;
    private String resolucao;

    public VideoMusical(int id, String titulo, int duracao, Artista artista, String resolucao) {
        super(id, titulo, duracao);
        this.artista = artista;
        this.resolucao = resolucao;
    }

    @Override
    public void reproduzir() {
        assistir();
    }

    public void assistir() {
        System.out.println("Assistindo vídeo: " + getTitulo() + " - " + artista.getNome()
                + " (" + resolucao + ") [" + getDuracaoFormatada() + "]");
    }

    public Artista getArtista() {
        return artista;
    }

    public String getResolucao() {
        return resolucao;
    }
}