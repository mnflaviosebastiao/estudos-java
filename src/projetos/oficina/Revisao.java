public class Revisao extends Servico {
    private int quantidade;
    private double preco;

    public Revisao(int quantidade, double preco, String cliente, String placa, double valor) {
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
    public double getCobranca() {
        double precoFinal = getValor() + (getQuantidade() * getPreco());
        return precoFinal;
    }

    @Override
    public String toString() {
        return super.toString() + ", revisao com total de itens revisados de " + getQuantidade();
    }
}