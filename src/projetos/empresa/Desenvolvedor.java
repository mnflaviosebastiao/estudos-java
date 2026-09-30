public class Desenvolvedor extends Funcionario {
    private String linguagem;
    private double bonusTi;

    public Desenvolvedor(String nome, double salarioBase, String linguagem, double bonusTi) {
        super(nome, salarioBase);
        this.linguagem = linguagem;
        this.bonusTi = bonusTi;
    }
    public String getLinguagem() {
        return linguagem;
    }
    public double getBonusTi() {
        return bonusTi;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + getBonusTi();
    }
    @Override
    public void apresentar() {
        System.out.println("Desenvolvedor: " + getNome() + " - Salário: R$ " + calcularSalario() + " - Linguagem: " + getLinguagem());
        }
}