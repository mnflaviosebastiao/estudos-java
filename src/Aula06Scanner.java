
import java.util.Scanner;

public class Aula06Scanner {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Qual seu nome? ");
            String nome = sc.nextLine();

            System.out.print("Qual a sua idade? ");
            int idade = sc.nextInt();

            System.out.println("Olá " + nome + " você tem " + idade + " anos.");

            System.out.print("Digite o primeiro numero: ");
            int firstNumber = sc.nextInt();

            System.out.print("Digite o segundo numero: ");
            int secondNumber = sc.nextInt();

            System.out.println(firstNumber + " + " + secondNumber + " = " + somar(firstNumber, secondNumber));
        }
    }
    public static int somar(int a, int b) {
        return a + b;
    }
}
