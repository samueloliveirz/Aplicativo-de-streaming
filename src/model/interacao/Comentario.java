package model.interacao;

import model.usuario.Usuario;

public class Comentario {
    private String texto;
    private Usuario usuario;

    public Comentario(String texto, Usuario usuario) {
        this.texto = texto;
        this.usuario = usuario;
    }

    public String getTexto() {
        return texto;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}