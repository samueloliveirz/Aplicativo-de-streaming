package servico;

import model.conteudo.Conteudo;
import model.interacao.Historico;

import java.util.ArrayList;
import java.util.List;

public class Recomendacao {
    private String criterio;

    public Recomendacao(String criterio) {
        this.criterio = criterio;
    }

    public List<Conteudo> sugerir(Historico historico, List<Conteudo> catalogo) {
        List<Conteudo> sugestoes = new ArrayList<>();
        for (Conteudo c : catalogo) {
            if (!historico.getReproduzidos().contains(c)) {
                sugestoes.add(c);
            }
        }

        System.out.println("Recomendações para " + historico.getUsuario().getNome()
                + " (" + criterio + "):");
        for (Conteudo c : sugestoes) {
            System.out.println("  - " + c.getTitulo());
        }
        return sugestoes;
    }

    public String getCriterio() {
        return criterio;
    }
}