public class Pintura extends Servico implements Garantia {
    private double dimensao;
    private double preco;
    private boolean personalizada;

    public Pintura(double dimensao, double preco, boolean personalizada, String cliente, String placa, double valor) {
        super(cliente, placa, valor);
        this.dimensao = dimensao;
        this.preco = preco;
        this.personalizada = personalizada;
    }

    public double getDimensao() {
        return dimensao;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isPersonalizada() {
        return personalizada;
    }

    public void personalizar() {
        if (personalizada) {
            System.out.println("Personalização já concluida.");
        } else {
            personalizada = true;
            System.out.println("Personalização realizada");
        }
    }

    @Override
    public double getCobranca() {
        double percentualPersonalizacao = 0.6;
        double precoFinal = getValor() + (getDimensao() * getPreco());
        if (personalizada) {
            precoFinal += precoFinal * percentualPersonalizacao;
        }
        return precoFinal;
    }

    @Override
    public String toString() {
        String tipoPintura = isPersonalizada() ? "personalizada" : "";
        return super.toString() + ", pintura " + tipoPintura;
    }

    @Override
    public String garantia() {
        return "Defeitos de aplicação, bolhas, descascamento precoce ou corrosão.";
    }

    @Override
    public int prazo() {
        return 120;
    }
}
