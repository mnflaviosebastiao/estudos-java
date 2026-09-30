
public class Conta {

    private String titular;
    private String numeroConta;
    private double saldo;

    public Conta(String titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para sacar R$ " + valor + ". Saldo atual: R$ " + saldo);
        }
    }

    public void consultarSaldo() {
        System.out.println("Conta " + numeroConta + " de " + titular + ": R$ " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            System.out.println("Titular inválido. Alteração ignorada.");
        }
        this.titular = titular;
        System.out.println("Titular alterado para: " + titular);
    }
}
