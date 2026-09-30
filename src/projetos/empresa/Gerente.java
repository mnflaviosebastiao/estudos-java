public class Gerente extends Funcionario{
    private double bonusGerenciaPercentual;
    public Gerente(String nome, double salarioBase, double bonusGerenciaPercentual) {
        super(nome, salarioBase);
        this.bonusGerenciaPercentual = bonusGerenciaPercentual;
    }
    public double getBonusGerenciaPercentual() {
        return bonusGerenciaPercentual;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (getSalarioBase() * bonusGerenciaPercentual);
    }
    @Override
    public void apresentar() {
        System.out.println("Gerente: " + getNome() + " - Salário: R$ " + calcularSalario() + " - Bônus: " + (getBonusGerenciaPercentual() * 100) + "%");
    }
}