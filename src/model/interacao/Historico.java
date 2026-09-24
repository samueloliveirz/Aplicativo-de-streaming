package model.interacao;

import model.conteudo.Conteudo;
import model.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    private Usuario usuario;
    private List<Conteudo> reproduzidos = new ArrayList<>();

    public Historico(Usuario usuario) {
        this.usuario = usuario;
    }

    public void registrar(Conteudo conteudo) {
        conteudo.reproduzir();
        reproduzidos.add(conteudo);
    }

    public void exibir() {
        System.out.println("Histórico de " + usuario.getNome() + ":");
        for (Conteudo c : reproduzidos) {
            System.out.println("  - " + c.getTitulo() + " [" + c.getDuracaoFormatada() + "]");
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<Conteudo> getReproduzidos() {
        return List.copyOf(reproduzidos);
    }
}