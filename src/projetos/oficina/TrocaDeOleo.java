public class TrocaDeOleo extends Servico {
    private String item;
    private double preco;

    public TrocaDeOleo (String item, double preco, String cliente, String placa, double valor) {
        super(cliente, placa, valor);
        this.item = item;
        this.preco = preco;
    }

    public String getItem() {
        return item;
    }

    public  double getPreco() {
        return preco;
    }

    @Override 
    public double getCobranca() {
        double precoFinal = getValor() + getPreco();
        return precoFinal;
    }

    @Override 
    public String toString() {
        return super.toString() + ", troca do(s) item(s): " + getItem();
    }

}
