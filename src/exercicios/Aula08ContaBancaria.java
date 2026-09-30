public class Aula08ContaBancaria {
    public static void main(String[] args) {
        ContaBancaria  flavio = new ContaBancaria("Flávio", 232323, 85000.00);
        ContaBancaria  silvia = new ContaBancaria("Silvia", 16116270, 125000.00);
        ContaBancaria  joao = new ContaBancaria("João", 445678, 150.00);

        System.out.println("Conta " + flavio.numeroConta + " de " + flavio.titular + ": R$ " + flavio.saldo);
        System.out.println("Conta " + silvia.numeroConta + " de " + silvia.titular + ": R$ " + silvia.saldo);
        System.out.println("Conta " + joao.numeroConta + " de " + joao.titular + ": R$ " + joao.saldo);
    }
}