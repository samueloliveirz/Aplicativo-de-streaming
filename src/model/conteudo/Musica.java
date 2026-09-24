package model.conteudo;

import model.usuario.Artista;

public class Musica extends Conteudo {
    private Artista artista;
    private Album album;

    public Musica(int id, String titulo, int duracao, Artista artista, Album album) {
        super(id, titulo, duracao);
        this.artista = artista;
        this.album = album;
    }


    @Override
    public void reproduzir() {
        tocar();
    }

    public void tocar() {
        System.out.println("Tocando música: " + getTitulo() + " - " + artista.getNome() + " (Álbum: " + album.getTitulo() + ") [" + getDuracaoFormatada() + "]");
    }

    public Album getAlbum() {
        return this.album;
    }
}