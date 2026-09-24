package model.conteudo;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String titulo;
    private int ano;
    private List<String> musicas = new ArrayList<>();

    public Album(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void addMusica(String nomeMusica) {
        this.musicas.add(nomeMusica);
        System.out.println("Música '" + nomeMusica + "' adicionada ao álbum '" + titulo + "'.");
    }

    public void exibirInfo() {
        System.out.println("Álbum: " + titulo + " (" + ano + ")");
        System.out.println("Faixas: " + musicas);
    }
}