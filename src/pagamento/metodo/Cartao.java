package pagamento.metodo;

public class Cartao implements MetodoPagamento {
    private String titular;
    private String ultimosDigitos;

    public Cartao(String titular, String ultimosDigitos) {
        this.titular = titular;
        this.ultimosDigitos = ultimosDigitos;
    }

    @Override
    public boolean processar(double valor) {
        System.out.println("Pagamento de R$ " + String.format("%.2f", valor)
                + " no cartão final " + ultimosDigitos + " (" + titular + ")");
        return true;
    }

    @Override
    public String getDescricao() {
        return "Cartão final " + ultimosDigitos;
    }
}