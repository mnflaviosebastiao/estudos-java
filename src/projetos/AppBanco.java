
public class AppBanco {

    public static void main(String[] args) {
        Conta flavio = new Conta("Flávio", "rg4592df", 450.00);
        Conta silvia = new Conta("Silvia", "rg1234f", 220.00);

        flavio.consultarSaldo();
        silvia.consultarSaldo();
        flavio.depositar(230.00);
        silvia.depositar(100.00);
        flavio.sacar(300);
        silvia.sacar(500);
        flavio.consultarSaldo();
        silvia.consultarSaldo();

        System.out.println("Soma dos saldos: R$ " + (flavio.getSaldo() + silvia.getSaldo()));
        // silvia.saldo = 2300.00;  // ERRO: 'saldo' é atributo privado — só acessível via método
        System.out.println(flavio.getTitular());
        System.out.println(silvia.getTitular());

        flavio.setTitular("Flávio Sebastião");
        flavio.setTitular("");
        flavio.consultarSaldo();
    }
}
