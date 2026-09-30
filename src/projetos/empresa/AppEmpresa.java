public class AppEmpresa {
    public static void main(String[] args) {
        Gerente silvia = new Gerente("Silvia", 15000.00, 0.20);
        Vendedor kaio = new Vendedor("Kaio", 4000.00, 45.00, 80);
        Desenvolvedor flavio = new Desenvolvedor("Flávio", 12000.00, "Java", 3500.00);

        Funcionario[] equipe = {silvia, kaio, flavio};
        for (Funcionario f : equipe) {
            f.apresentar();
        }
        double total = 0;
        for (Funcionario f : equipe) {
            total += f.calcularSalario();
        }
        System.out.println("\nFolha de pagamento total: R$ " + total);
    }
}