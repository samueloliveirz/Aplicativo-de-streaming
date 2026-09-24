package model.usuario;

public class Apresentador extends Usuario {
    private String programa;

    public Apresentador(int id, String nome, String email, String programa) {
        super(id, nome, email);
        this.programa = programa;
    }

    public void apresentar() {
        System.out.println("Apresentador(a) " + getNome() + " está apresentando o programa '" + programa + "'.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("--- Apresentador ---");
        System.out.println("ID: " + getId() + ", Nome: " + getNome() + ", Programa: " + programa);
    }
}
