public class Historico {
    private String conteudo;

    public Historico(String conteudo) {
        this.conteudo = conteudo;
    }

    public void exibir() {
        System.out.println("Exibindo histórico: " + conteudo);
    }
}