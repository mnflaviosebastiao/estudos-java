
public class Vendedor extends Funcionario {

    private double comissao;
    private int vendasMes;

    public Vendedor(String nome, double salarioBase, double comissao, int vendasMes) {
        super(nome, salarioBase);
        this.comissao = comissao;
        this.vendasMes = vendasMes;
    }

    public double getComissao() {
        return comissao;
    }

    public int getVendasMes() {
        return vendasMes;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (comissao * vendasMes);
    }

    @Override
    public void apresentar() {
        System.out.println("Vendedor: " + getNome() + " - Salário: R$ " + calcularSalario() + " - " + getVendasMes() + " x R$ " + getComissao());
    }
}
