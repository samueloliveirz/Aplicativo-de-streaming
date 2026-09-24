package model.conteudo;

import model.usuario.Artista;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String titulo;
    private int ano;
    private List<Musica> musicas = new ArrayList<>();

    public Album(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Musica addMusica(int id, String titulo, int duracao, Artista artista) {
        Musica musica = new Musica(id, titulo, duracao, artista, this);
        musicas.add(musica);
        return musica;
    }

    public void exibirInfo() {
        System.out.println("Álbum: " + titulo + " (" + ano + ")");
        for (Musica m : musicas) {
            System.out.println("  - " + m.getTitulo() + " [" + m.getDuracaoFormatada() + "]");
        }
    }

    public int getAno() {
        return ano;
    }

    public List<Musica> getMusicas() {
        return List.copyOf(musicas);
    }
}