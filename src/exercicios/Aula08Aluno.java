
public class Aula08Aluno {

    public static void main(String[] args) {
        Aluno flavio = new Aluno("Flávio", "fl45b23", 9.8);
        Aluno silvia = new Aluno("Silvia", "fkr64mw", 10.0);
        Aluno pedro = new Aluno("Pedro", "fl45b23", 7.5);

        avaliar(pedro);
        avaliar(silvia);
        avaliar(flavio);
    }

    public static void avaliar(Aluno aluno) {
        if (aluno.nota > 7) {
            System.out.println(aluno.nome + "(mat. " + aluno.matricula + ") - Nota: " + aluno.nota + " - Aprovada");
        } else {
            System.out.println(aluno.nome + "(mat. " + aluno.matricula + ") - Nota: " + aluno.nota + " - Reprovada");
        }
    }
}
