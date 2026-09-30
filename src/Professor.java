
public class Professor extends Pessoa {

    private String disciplina;
    private double salario;

    public Professor(String nome, int idade, String disciplina, double salario) {
        super(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Sou professor. Disciplina: " + getDisciplina() + " — Salário: " + getSalario());
    }

}
