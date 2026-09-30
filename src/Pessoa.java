
public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void apresentar() {
        System.out.println("Olá, sou " + nome + " e tenho " + idade + " anos.");
    }

    public void aniversario() {
        idade++;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
}
