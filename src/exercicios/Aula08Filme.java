public class Aula08Filme {
    public static void main(String[] args) {
        Filme jumanji = new Filme("Jumanji", "Jake Kasdan", 2017, 119);
        Filme avengers = new Filme("Avengers", "Joss Whedon", 2012, 143);
        Filme osenhordosaneis = new Filme("O senhor dos aneis", "Peter Jackson", 2001, 178);

        System.out.println(jumanji.titulo + " (" + jumanji.ano + "), dirigido por " + jumanji.diretor + ", " + jumanji.duracaoMinutos + " min");
        System.out.println(avengers.titulo + " (" + avengers.ano + "), dirigido por " + avengers.diretor + ", " + avengers.duracaoMinutos + " min");
        System.out.println(osenhordosaneis.titulo + " (" + osenhordosaneis.ano + "), dirigido por " + osenhordosaneis.diretor + ", " + osenhordosaneis.duracaoMinutos + " min");
    }
}