package servico;

public class Recomendacao {
    private String criterio;

    public Recomendacao(String criterio) {
        this.criterio = criterio;
    }

    public void sugerir() {
        System.out.println("Gerando recomendação com base no critério: '" + criterio + "'.");
    }
}