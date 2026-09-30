public class AtividadePratica {

    public static void main(String[] args) {
        String jogador = "Flavio";
        double deposito = 23.45;
        boolean ativo = true;

        if (deposito > 20) {
            System.out.println("O deposito é acima de R$ 20,00");
        } else {
            System.out.println("Jogador depositou abaixo de R$ 20,00");
        }

        for (int i = 0; i < 12; i++) {
            System.out.println("Restam " + i);
        }

        try {
            int[] valores = {10, 20, 30};
            System.out.println("Tentado acessar o valor 56");
            int valor = valores[56];
            System.out.println("O valor é:" + valor);
        } catch (ArithmeticException e) {
            System.out.println("Erro: valor nao encontrado");
        }

        int[] quantidades = {6, 7, 8, 9, 10};
        for (int q : quantidades) {
            System.out.println("Numero do dado exbidido:" + q);
        }

        int[][] matriz = {
            {10, 20},
            {30, 40},
            {50, 60}
        };

        System.out.println("Exibindo os dados da matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
