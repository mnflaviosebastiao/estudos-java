
public class Aluno extends Pessoa {

    private String matricula;
    private double nota;

    public Aluno(String nome, int idade, String matricula, double nota) {
        super(nome, idade);
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    public void estudar() {
        System.out.println(getNome() + " está estudando.");
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Sou aluno. Matricula: " + getMatricula() + " - " + getNota());
    }
}
