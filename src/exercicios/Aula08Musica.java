
public class Aula08Musica {

    public static void main(String[] args) {
        Musica hallo = new Musica("hallo", "Beyonce", 196, true);
        Musica tudoeperda = new Musica("Tudo é perda", "Felipe Rodrigues", 145, false);
        Musica tuavoz = new Musica("Tua Voz", "Jose Wellington", 134, false);

        Musica[] musicas = {hallo, tudoeperda, tuavoz};

        for (Musica musica : musicas) {
            String classificacao = musica.explicit ? "explicit" : "limpa";
            // String classificacao;
            // if(musica.explicit) {
            //     classificacao = "explicit";
            // } else {
            //     classificacao = "limpa";
            // }
            System.out.println(musica.titulo + " - " + musica.artista + " - " + musica.duracaoSegundos + "s [" + classificacao + "]");
        } 
    }
}
