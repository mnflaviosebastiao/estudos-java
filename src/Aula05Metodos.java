
public class Aula05Metodos {

    public static void main(String[] args) {
        String nome = "Flavio";
        int resultado = quadrado(8);
        int a = 3;
        int b = 4;
        int resultadoSoma = somar(a, b);
        apresentar(nome);
        System.out.println("Soma de " + a + " + " + b + " é igual a " + resultadoSoma);
        System.out.println("8 ao quadrado é " + resultado);
        System.out.println("("+ a + " + " + b + ") x 2 = " + somarEDobrar(a, b));
    }

    public static void apresentar(String nome) {
        System.out.println("Meu nome é " + nome + ".");
    }

    public static int quadrado(int n) {
        return n * n;
    }

    public static int somar(int a, int b) {
        return a + b;
    }
    public static int dobrar(int a) {
        return a * 2;
    }

    public static int somarEDobrar(int a, int b) {
       int resultado = somar(a, b);
        return dobrar(resultado);
    }
}
