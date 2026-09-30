public class Aula09Heranca {
    public static void main(String[] args) {
        Pessoa silvia = new Pessoa("Silvia", 31);
        Aluno joao = new Aluno("João", 15, "err1506", 70);
        Professor flavio = new Professor("Flávio", 32, "fisica", 4500.00);

        joao.apresentar();
        // joao.estudar();
        // System.out.println("Matrícula: " + joao.getMatricula() + " - Nota: " + joao.getNota());

        Pessoa[] pessoas = {silvia, joao, flavio};
        for (Pessoa p : pessoas) {
            p.apresentar();
            System.out.println();
        }
    }
}