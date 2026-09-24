package pagamento.metodo;

public interface MetodoPagamento {
    boolean processar(double valor);
    String getDescricao();
}