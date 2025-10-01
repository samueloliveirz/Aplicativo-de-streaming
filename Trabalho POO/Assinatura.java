public class Assinatura {
    private String tipo;
    private double preco;
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibir() {
        System.out.println("Assinatura Tipo: " + tipo + ", Preço: R$" + preco);
    }
}