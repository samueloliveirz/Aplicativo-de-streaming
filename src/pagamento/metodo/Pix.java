package pagamento.metodo;

public class Pix implements MetodoPagamento {
    private String chave;

    public Pix(String chave) {
        this.chave = chave;
    }

    @Override
    public boolean processar(double valor) {
        System.out.println("PIX de R$ " + String.format("%.2f", valor)
                + " enviado para a chave " + chave);
        return true;
    }

    @Override
    public String getDescricao() {
        return "PIX (" + chave + ")";
    }
}