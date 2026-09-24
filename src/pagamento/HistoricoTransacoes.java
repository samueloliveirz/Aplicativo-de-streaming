package pagamento;

import java.util.ArrayList;
import java.util.List;

public class HistoricoTransacoes {
    private List<Pagamento> pagamentos = new ArrayList<>();

    public void registrar(Pagamento pagamento) {
        pagamento.processar();
        pagamentos.add(pagamento);
    }

    public double getTotalAprovado() {
        double total = 0;
        for (Pagamento p : pagamentos) {
            if (p.isAprovado()) {
                total += p.getValor();
            }
        }
        return total;
    }

    public void exibir() {
        System.out.println("Histórico de transações:");
        for (Pagamento p : pagamentos) {
            String status = p.isAprovado() ? "aprovado" : "recusado";
            System.out.println("  - " + p.getMetodo().getDescricao()
                    + " | R$ " + String.format("%.2f", p.getValor())
                    + " | " + status);
        }
        System.out.println("Total aprovado: R$ " + String.format("%.2f", getTotalAprovado()));
    }

    public List<Pagamento> getPagamentos() {
        return List.copyOf(pagamentos);
    }
}