package servico;

import model.conteudo.Conteudo;
import model.interacao.Historico;

import java.util.LinkedHashMap;
import java.util.Map;

public class RelatorioUso {

    public void gerar(Historico historico) {
        int tempoTotal = 0;
        Map<String, Integer> porTipo = new LinkedHashMap<>();

        for (Conteudo c : historico.getReproduzidos()) {
            tempoTotal += c.getDuracao();
            String tipo = c.getClass().getSimpleName();
            porTipo.put(tipo, porTipo.getOrDefault(tipo, 0) + 1);
        }

        System.out.println("Relatório de uso de " + historico.getUsuario().getNome() + ":");
        System.out.println("  Conteúdos reproduzidos: " + historico.getReproduzidos().size());
        System.out.println("  Tempo total: " + formatarTempo(tempoTotal));
        for (Map.Entry<String, Integer> entrada : porTipo.entrySet()) {
            System.out.println("  " + entrada.getKey() + ": " + entrada.getValue());
        }
    }

    private String formatarTempo(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int resto = segundos % 60;
        return String.format("%dh %02dmin %02ds", horas, minutos, resto);
    }
}