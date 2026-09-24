package model.usuario;

public class Artista extends Usuario {
    private String generoMusical;

    public Artista(int id, String nome, String email, String generoMusical) {
        super(id, nome, email);
        this.generoMusical = generoMusical;
    }



    public void publicarConteudo() {
        System.out.println("Artista " + nome + " está publicando um novo conteúdo.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("--- Artista ---");
        System.out.println("ID: " + id + ", Nome: " + nome + ", Gênero: " + generoMusical);
    }
}