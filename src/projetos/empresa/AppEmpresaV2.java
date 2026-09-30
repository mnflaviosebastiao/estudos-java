
import java.util.ArrayList;

public class AppEmpresaV2 {

    public static void main(String[] args) {
        Funcionario ross = new Funcionario("Ross", 4000.00);
        Gerente silvia = new Gerente("Silvia", 15000.00, 0.20);
        Vendedor kaio = new Vendedor("Kaio", 4000.00, 45.00, 80);
        Desenvolvedor flavio = new Desenvolvedor("Flávio", 12000.00, "Java", 3500.00);

        ArrayList<Funcionario> equipe = new ArrayList<>();

        equipe.add(ross);
        equipe.add(silvia);
        equipe.add(kaio);
        equipe.add(flavio);

        System.out.println("A empresa tem " + equipe.size() + " funcionários:");

        apresentarTodos(equipe);

        double total = calcularFolha(equipe);
        System.out.println("Folha de pagamento total: R$ " + total);

        equipe.remove(2);

        System.out.println("Funcionário demitido. Restam " + equipe.size() + " funcionários.");
        apresentarTodos(equipe);

        double totalDepoisDaDemissao = calcularFolha(equipe);
        System.out.println("Folha de pagamento total: R$ " + totalDepoisDaDemissao);

        Desenvolvedor cristina = new Desenvolvedor("Silvia Cristina", 12000.00, "Java", 3500.00);

        equipe.add(cristina);
        System.out.println("Novo funcionário contratado: " + cristina.getNome() + ". Total: " + equipe.size() + " funcionários.");

        double totalFinal = calcularFolha(equipe);
        System.out.println("Folha de pagamento total: R$ " + totalFinal);
        apresentarTodos(equipe);
    }

    public static void apresentarTodos(ArrayList<Funcionario> equipe) {
        for (Funcionario f : equipe) {
            f.apresentar();
        }
    }

    public static double calcularFolha(ArrayList<Funcionario> equipe) {
        double folhaPagamento = 0;
        for (Funcionario f : equipe) {
            folhaPagamento += f.calcularSalario();
        }
        return folhaPagamento;
    }
}
