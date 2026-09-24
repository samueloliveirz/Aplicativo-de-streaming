package model.conteudo;

public abstract class Conteudo {
    private int id;
    private String titulo;
    private int duracao;

    public Conteudo(int id, String titulo, int duracao) {
        this.id = id;
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public int getId() {
        return id;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}