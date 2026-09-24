package model.conteudo;

import model.usuario.Narrador;

public class Audiobook extends Conteudo {
    private Narrador autor;
    private int capitulos;

    public Audiobook(int id, String titulo, double duracao, Narrador autor, int capitulos) {
        super(id, titulo, duracao);
        this.autor = autor;
        this.capitulos = capitulos;
    }


    public void ouvir() {
        System.out.println("Ouvindo audiobook: " + titulo + ", narrado por " + autor.getNome() + " (" + capitulos + " capítulos).");
    }

    public int getCapitulos() {
        return this.capitulos;
    }
}