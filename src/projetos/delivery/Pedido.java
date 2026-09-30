public class Pedido {
    private String cliente;
    private double valor;
    private boolean entregue;

    public Pedido(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.entregue = false;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public boolean isEntregue() {
        return entregue;
    }

    @Override
    public String toString() {
        String entrega = entregue ? "entregue" : "não entregue";
        return "Cliente " + getCliente() + ", valor do pedido: R$ " + getValor()+ ", status: " + entrega;
    }

    public void entregar() {
        if (entregue) {
            System.out.println("Pedido já entregue.");
        } else {
            entregue = true;
            System.out.println("Entregue!");
        }
    }
}
