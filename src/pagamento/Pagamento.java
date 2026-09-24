package pagamento;

import pagamento.metodo.MetodoPagamento;

public class Pagamento {
    private MetodoPagamento metodo;
    private double valor;
    private boolean aprovado;

    public Pagamento(MetodoPagamento metodo, double valor) {
        this.metodo = metodo;
        this.valor = valor;
    }

    public void processar() {
        aprovado = metodo.processar(valor);
    }

    public MetodoPagamento getMetodo() {
        return metodo;
    }

    public double getValor() {
        return valor;
    }

    public boolean isAprovado() {
        return aprovado;
    }
}