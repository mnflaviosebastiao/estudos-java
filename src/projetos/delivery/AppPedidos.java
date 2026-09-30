import java.util.ArrayList;

public class AppPedidos {
    public static void main(String[] args) {
        Pedido cafe = new Pedido("flavio", 20);
        Pedido acucar = new Pedido("pedro", 30);
        Pedido arroz = new Pedido("kaio", 50);
        Pedido feijao = new Pedido("silvia", 60);

        ArrayList<Pedido> pedidos = new ArrayList<>();

        pedidos.add(feijao);
        pedidos.add(cafe);
        pedidos.add(acucar);
        pedidos.add(arroz);

        cafe.entregar();
        // esperado:Entregue!
        acucar.entregar();
        // esperado:Entregue!

        apresentarPedidos(pedidos);
        // esperado: Cliente silvia, valor do pedido: R$ 60.0 , status: não entregue.
        // esperado: Cliente flavio, valor do pedido: R$ 20.0 , status: entregue.
        // esperado: Cliente pedro, valor do pedido: R$ 30.0 , status: entregue.
        // esperado: Cliente kaio, valor do pedido: R$ 50.0 , status: não entregue.

        System.out.println("Total somado dos pedidos entregues é: R$ " + totalEntregue(pedidos));
        // esperado: Total somado dos pedidos entregues é: R$ 50.0
        System.out.println("Total de pedidos pendentes é: " + pedidosPendentes(pedidos));
        // esperado: Total de pedidos pendentes é: 2
        System.out.println("O maior pedido e do(a) " + maiorPedido(pedidos));
        // esperado: O pedido com maior valor é da cliente silvia 60
    }

    public static void apresentarPedidos(ArrayList<Pedido> pedidos) {
        for (Pedido p : pedidos) {
            System.out.println(p);
        }
    }

    public static double totalEntregue(ArrayList<Pedido> pedidos) {
        double total = 0;
        for (Pedido p : pedidos) {
            if (p.isEntregue()) {
                total += p.getValor();
            }
        }
        return total;
    }

    public static int pedidosPendentes(ArrayList<Pedido> pedidos) {
        int total = 0;
        for (Pedido p : pedidos) {
            if (!p.isEntregue()) {
                total++;
            }
        }
        return total;
    }

    public static Pedido maiorPedido(ArrayList<Pedido> pedidos) {
        Pedido campeao = pedidos.get(0);
        for (Pedido p : pedidos) {
            if (p.getValor() > campeao.getValor()) {
                campeao = p;
            }
        }
        return campeao;
    }
}
