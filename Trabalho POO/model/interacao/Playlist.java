package model.interacao;

import model.usuario.Usuario;

public class Playlist {
    private Usuario dono;
    private int quantidadeMusicas;

    public Playlist(Usuario dono, int quantidadeMusicas) {
        this.dono = dono;
        this.quantidadeMusicas = quantidadeMusicas;
    }

    public void reproduzir() {
        System.out.println("Reproduzindo playlist de " + dono.getNome() + " com " + quantidadeMusicas + " músicas.");
    }
}