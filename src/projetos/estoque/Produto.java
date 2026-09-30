
public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque < 0) {
            System.out.println("Valor não pode ser negativo");
        } else {
            this.quantidadeEstoque = quantidadeEstoque;
            System.out.println("Quantidade Atualizada!");
        }
    }

    public void apresentar() {
        System.out.println(getNome() + " - R$ " + getPreco() + " - " + getQuantidadeEstoque() + " em estoque");
    }
}
