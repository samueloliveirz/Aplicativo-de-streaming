package pagamento.metodo;

public class Boleto implements MetodoPagamento {
    private String codigoBarras;

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public boolean processar(double valor) {
        System.out.println("Boleto de R$ " + String.format("%.2f", valor)
                + " gerado: " + codigoBarras);
        return true;
    }

    @Override
    public String getDescricao() {
        return "Boleto " + codigoBarras;
    }
}