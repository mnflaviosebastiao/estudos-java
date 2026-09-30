public class Lavagem extends Servico{
    private int quantidade;
    private double preco;
    
    public Lavagem (String cliente, String placa, double valor, int quantidade, double preco) {
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
        double precoFinal = getPreco() * getQuantidade();
        return precoFinal; 
    }

    @Override 
    public String toString() {
        return super.toString() + ", lavagem premium";
    }
}
