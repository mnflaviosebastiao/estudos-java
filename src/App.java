
public class App {

    public static void main(String[] args) {

        // ─── AULA 1: Variáveis e Tipos de Dados ───────────────────────
        // int → números inteiros
        int idade = 25;

        // double → números com casas decimais
        double altura = 1.75;

        // boolean → verdadeiro ou falso
        boolean estudando = true;

        // char → um único caractere
        char inicial = 'F';

        // String → texto (sequência de caracteres)
        String nome = "Flavio";

        // Exibindo os valores no console
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Estudando Java? " + estudando);
        System.out.println("Inicial do nome: " + inicial);

        // Exercício resolvido ✔
        String cidade = "Natal";
        System.out.println("Minha cidade favorita é: " + cidade);

        // ─── AULA 2: Operadores ───────────────────────────────────────
        int a = 10;
        int b = 3;

        // Aritméticos → fazem cálculos
        System.out.println("Soma: " + (a + b));  // 13
        System.out.println("Subtração: " + (a - b));  // 7
        System.out.println("Divisão: " + (a / b));  // 3  ← atenção! inteiro / inteiro = inteiro
        System.out.println("Resto: " + (a % b));  // 1  ← sobra da divisão

        // Relacionais → comparam valores e retornam boolean
        System.out.println("a > b? " + (a > b));   // true
        System.out.println("a == b? " + (a == b));  // false

        // Lógicos → combinam condições
        boolean temIdade = idade >= 18;
        boolean temDinheiro = true;
        System.out.println("Pode comprar? " + (temIdade && temDinheiro)); // true = os dois precisam ser true

        // Exercício 1 resolvido ✔ (aritmético)
        int preco = 50;
        int desconto = 15;
        System.out.println("Preço com desconto: R$ " + (preco - desconto));

        // ─── EXERCÍCIO 2 (relacional) ──────────────────────────────────
        // Declare: int velocidade = 120 e int limite = 80
        // Imprima se o motorista está acima do limite: "Acima do limite? ..."
        // Use o operador >
        int velocidade = 120;
        int limite = 80;

        System.out.println("Acima do limite? " + (velocidade > limite));

        // ─── EXERCÍCIO 3 (lógico) ─────────────────────────────────────
        // Declare: boolean temCNH = true  e  boolean temCarro = false
        // Imprima se a pessoa pode dirigir (precisa ter os dois): "Pode dirigir? ..."
        // Use o operador &&
        boolean temCNH = true;
        boolean temCarro = false;

        System.out.println("Pode dirigir? " + (temCNH && temCarro));

        // ─── AULA 3: if / else ────────────────────────────────────────
        // if = "se". Executa um bloco só se a condição for true.
        int pontos = 75;

        if (pontos >= 60) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado.");
        }

        // else if → testa mais de uma condição em sequência
        if (pontos >= 90) {
            System.out.println("Conceito A");
        } else if (pontos >= 70) {
            System.out.println("Conceito B");
        } else if (pontos >= 60) {
            System.out.println("Conceito C");
        } else {
            System.out.println("Reprovado");
        }

        // ─── EXERCÍCIO ────────────────────────────────────────────────
        // Declare: int temperatura = 38
        // Se temperatura > 37.5 → imprima "Febre!"
        // Se temperatura >= 36 → imprima "Temperatura normal"
        // Caso contrário      → imprima "Hipotermia"
        double temperatura = 38.0;

        if (temperatura > 37.5) {
            System.out.println("Febre!");
        } else if (temperatura >= 36) {
            System.out.println("Temperatura normal");
        } else {
            System.out.println("Hipotermia");
        }

        // ─── AULA 4: Loops (for e while) ──────────────────────────────
        // Loops repetem um bloco de código várias vezes.

        // FOR → quando você sabe quantas vezes vai repetir
        // Estrutura: for (início; condição; passo)
        for (int i = 1; i <= 5; i++) {
            System.out.println("Repetição número: " + i);
        }
        // i = 1  → testa 1<=5 ✔ executa → i++ vira 2
        // i = 2  → testa 2<=5 ✔ executa → i++ vira 3
        // ... até i = 6 → testa 6<=5 ✘ para o loop

        // i++ é o mesmo que i = i + 1 (incrementa em 1)

        // WHILE → quando você NÃO sabe quantas vezes, depende de uma condição
        int saldo = 100;
        while (saldo > 0) {
            System.out.println("Saldo atual: " + saldo);
            saldo = saldo - 30; // saca 30 por vez
        }
        System.out.println("Conta zerada!");

        // ─── EXERCÍCIO ────────────────────────────────────────────────
        // 1) Use um FOR para imprimir os números de 1 até 10
        // 2) Use um WHILE para imprimir uma contagem regressiva de 5 até 1
        //    (dica: comece com int n = 5 e use n--)
        
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
            
        int n = 5;
        while (n >= 1) {
            System.out.println(n);
            n--;
        }

        // ─── AULA 5: Métodos ──────────────────────────────────────────
        // Método = um pedaço de código com nome, que você pode reutilizar.
        // Os métodos ficam DENTRO da classe, mas FORA do main.
        // Veja os métodos definidos no final desta classe ↓

        // Chamando métodos:
        saudacao();                              // sem parâmetro, sem retorno
        saudacaoPersonalizada("Flavio");         // com parâmetro, sem retorno

        int resultado = somar(10, 20);           // com parâmetro E com retorno
        System.out.println("Soma: " + resultado);

        // Você pode chamar várias vezes, com valores diferentes
        System.out.println("Soma: " + somar(5, 7));
        System.out.println("Soma: " + somar(100, 200));

        // ─── EXERCÍCIO ────────────────────────────────────────────────
        // Crie um método chamado "multiplicar" que:
        //   - recebe dois int (a, b)
        //   - retorna o resultado de a * b
        // Depois chame ele aqui no main e imprima o resultado de 6 * 7
    }

    // ─── DEFINIÇÃO DOS MÉTODOS ────────────────────────────────────────
    // Estrutura: [modificadores] tipoRetorno nomeMetodo(parâmetros) { ... }

    // void = não retorna nada
    static void saudacao() {
        System.out.println("Olá, mundo!");
    }

    // recebe um parâmetro String chamado "nome"
    static void saudacaoPersonalizada(String nome) {
        System.out.println("Olá, " + nome + "!");
    }

    // recebe dois int e retorna um int
    static int somar(int a, int b) {
        return a + b;   // a palavra "return" devolve o valor
    }

    // 👉 Crie aqui o seu método multiplicar(int a, int b)

}
