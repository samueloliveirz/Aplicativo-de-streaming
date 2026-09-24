package model.usuario;

public class UsuarioGratuito extends Usuario {
    private final boolean anuncio;

    public UsuarioGratuito(int id, String nome, String email, boolean anuncio) {
        super(id, nome, email);
        this.anuncio = anuncio;
    }

    public void ouvirAnuncio() {
        System.out.println("Usuário " + getNome() + " está ouvindo um anúncio.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("--- Usuário Gratuito ---");
        System.out.println("ID: " + getId() + ", Nome: " + getNome() + ", Email: " + getEmail() + ", Com anúncios: " + anuncio);
    }
}