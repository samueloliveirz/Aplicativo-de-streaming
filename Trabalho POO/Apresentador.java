public class Apresentador extends Usuario {
    private String programa;

    public Apresentador(int id, String nome, String email, String programa) {
        super(id, nome, email);
        this.programa = programa;
    }

    public void apresentar() {
        System.out.println("Apresentador(a) " + nome + " está apresentando o programa '" + programa + "'.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("--- Apresentador ---");
        System.out.println("ID: " + id + ", Nome: " + nome + ", Programa: " + programa);
    }
}
