public class Funilaria extends Servico {
    private int quantidade;
    private double preco;

    public Funilaria(String cliente, String placa, double valor, int quantidade, double preco) {
        super(cliente, placa, valor);
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getPreco() {
        return preco;
    }
    @Override 
    public String toString() {
        return super.toString() + ", servico de funilaria";
    }
    @Override 
    public double getCobranca() {
        return getValor() + (getQuantidade() * getPreco());
    }
}