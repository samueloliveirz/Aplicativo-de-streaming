public class UsuarioPremium extends Usuario {
    private double valorMensal;

    public UsuarioPremium(int id, String nome, String email, double valorMensal) {
        super(id, nome, email);
        this.valorMensal = valorMensal;
    }

    public void baixar(String musica) {
        System.out.println("Usuário " + nome + " está baixando a faixa: " + musica);
    }

    @Override
    public void exibirInfo() {
        System.out.println("--- Usuário Premium ---");
        System.out.println("ID: " + id + ", Nome: " + nome + ", Email: " + email + ", Mensalidade: R$" + valorMensal);
    }
}