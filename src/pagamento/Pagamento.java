package pagamento;

public class Pagamento {
    private String metodo;
    private double valor;

    public Pagamento(String metodo, double valor) {
        this.metodo = metodo;
        this.valor = valor;
    }

    public void processar() {
        System.out.println("Processando pagamento de R$" + valor + " via " + metodo + ".");
    }
}