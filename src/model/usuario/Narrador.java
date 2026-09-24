package model.usuario;

public class Narrador extends Usuario {
    private String estiloNarracao;

    public Narrador(int id, String nome, String email, String estiloNarracao) {
        super(id, nome, email);
        this.estiloNarracao = estiloNarracao;
    }

    public void narrar() {
        System.out.println("Narrador " + getNome() + " está narrando com estilo " + estiloNarracao + ".");
    }

    @Override
    public void exibirInfo() {
        System.out.println("--- Narrador ---");
        System.out.println("ID: " + getId() + ", Nome: " + getNome() + ", Estilo: " + estiloNarracao);
    }
}