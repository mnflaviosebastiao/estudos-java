public class Aula08Classes {
    public static void main(String[] args) {
        Pessoa flavio = new Pessoa("Flávio", 31);

        Pessoa silvia = new Pessoa("Silvia", 31);

        flavio.apresentar();
        silvia.apresentar();

        flavio.aniversario();
        flavio.aniversario();

        flavio.apresentar();
    }
}