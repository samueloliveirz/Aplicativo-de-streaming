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




    public String getDuracaoFormatada() {
        int horas = duracao / 3600;
        int minutos = (duracao % 3600) / 60;
        int segundos = duracao % 60;

        if (horas > 0) {
            return String.format("%d:%02d:%02d", horas, minutos, segundos);
        }
        return String.format("%d:%02d", minutos, segundos);
    }

    public abstract void reproduzir();
}