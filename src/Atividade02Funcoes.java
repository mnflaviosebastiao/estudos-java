
public class Atividade02Funcoes {

    public static void main(String[] args) {
        String nome = "Flávio";
        int number = 3;
        int resultadoQuadrado = calcularQuadrado(number);

        exibirMensagem(nome);
        System.out.println("O resultado do quadrado de " + number + " é " + resultadoQuadrado + ".");
    }

    public static void exibirMensagem(String nome) {
        System.out.println("Olá, " + nome + "! Seja bem-vindo ao sistema!");
    }

    public static int calcularQuadrado(int number) {
        return number * number;
    }
}
