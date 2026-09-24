package model.interacao;

import model.conteudo.Conteudo;
import model.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private Usuario dono;
    private List<Conteudo> conteudos = new ArrayList<>();

    public Playlist(String nome, Usuario dono) {
        this.nome = nome;
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public Usuario getDono() {
        return dono;
    }

    public List<Conteudo> getConteudos() {
        return List.copyOf(conteudos);
    }

    public void addConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
    }

    public void reproduzir() {
        System.out.println("Playlist '" + nome + "' de " + dono.getNome()
                + " (" + conteudos.size() + " itens)");
        for (Conteudo c : conteudos) {
            c.reproduzir();
        }
    }
}