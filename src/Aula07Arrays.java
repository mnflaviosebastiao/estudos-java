
public class Aula07Arrays {

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int[] notas = {7, 9, 5, 8, 6};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
        numeros[0] = 100;
        numeros[numeros.length - 1] = 999;
        System.out.println("Array após modificação:");

        for (int numero : numeros) {
            System.out.println(numero);
        }
        int soma = somarTodos(notas);
        System.out.println("Soma das notas: " + soma);

        double media = (double) soma / notas.length;

        System.out.println("Média das notas: " + media);

    }


    public static int somarTodos(int[] valores) {
        int total = 0;
        for (int v : valores) {
            total += v;
        }
        return total;
    }
}
