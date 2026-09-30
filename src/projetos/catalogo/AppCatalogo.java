
import java.util.ArrayList;

public class AppCatalogo {

    public static void main(String[] args) {
        Filme velozesFuriosos = new Filme("Velozes e furiosos", "Rob Cohen", 2001, 106);
        Filme jumanji = new Filme("Jumanji", "Jake Kasdan", 2017, 119);
        Filme viagemAoCentroDaTerra = new Filme("Viagem ao Centro da Terra", "Eric Brevig", 2008, 93);
        Filme avengers = new Filme("Os vingadores", "Joss Whedon", 2012, 143);
        Filme procurandoNemo = new Filme("Procurando nemo", "Andrew Stanton", 2003, 100);

        ArrayList<Filme> favoritos = new ArrayList<>();
        favoritos.add(avengers);
        favoritos.add(velozesFuriosos);
        favoritos.add(jumanji);
        favoritos.add(viagemAoCentroDaTerra);
        favoritos.add(procurandoNemo);

        System.out.println("Catálogo: " + favoritos.size() + " filmes.");

        apresentarFilmes(favoritos);

        int duracaoTotal = calcularDuracaoTotal(favoritos);
        System.out.println("Duração total: " + duracaoTotal + " minutos (" + (duracaoTotal / 60) + "h " + (duracaoTotal % 60) + "min)");

        Filme achado = buscarPorTitulo(favoritos, "Jumanji");
        if (achado != null) {
            achado.apresentar();
        } else {
            System.out.println("Filme nao encontrado.");
        }
        Filme naoAchado = buscarPorTitulo(favoritos, "hulk");
        if (naoAchado != null) {
            naoAchado.apresentar();
        } else {
            System.out.println("Filme nao encontrado.");
        }
        int anoMinimo = 2010;
        ArrayList<Filme> recentes = filtrarPorAno(favoritos, anoMinimo);
        System.out.println("Filmes desde " + anoMinimo + ": " + recentes.size());
        apresentarFilmes(recentes);
    }

    public static void apresentarFilmes(ArrayList<Filme> catalogo) {
        for (Filme filme : catalogo) {
            filme.apresentar();
        }
    }

    public static int calcularDuracaoTotal(ArrayList<Filme> catalogo) {
        int totalMinutos = 0;
        for (Filme filme : catalogo) {
            totalMinutos += filme.getDuracaoMinutos();
        }
        return totalMinutos;
    }

    public static Filme buscarPorTitulo(ArrayList<Filme> catalogo, String titulo) {
        for (Filme f : catalogo) {
            if (f.getTitulo().equals(titulo)) {
                return f;
            }
        }
        return null;
    }

    public static ArrayList<Filme> filtrarPorAno(ArrayList<Filme> catalogo, int anoMinimo) {
        ArrayList<Filme> listaNova = new ArrayList<>();
        for (Filme f : catalogo) {
            if (f.getAnoLancamento() >= anoMinimo) {
                listaNova.add(f);
            }
        }
        return listaNova;
    }
}
