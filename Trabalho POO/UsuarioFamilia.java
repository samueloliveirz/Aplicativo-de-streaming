public class UsuarioFamilia extends Usuario {
    private int numeroMembros;

    public UsuarioFamilia(int id, String nome, String email, int numeroMembros) {
        super(id, nome, email);
        this.numeroMembros = numeroMembros;
    }

    public void adicionarMembro() {
        System.out.println("Um novo membro foi adicionado ao plano da " + nome + ".");
    }

    @Override
    public void exibirInfo() {
        System.out.println("--- Usuário Família ---");
        System.out.println("ID: " + id + ", Nome: " + nome + ", Email: " + email + ", Membros: " + numeroMembros);
    }
}