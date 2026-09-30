public abstract class Servico {
    private String cliente;
    private String placa;
    private double valor;
    private boolean concluido;

    public Servico(String cliente, String placa, double valor) {
        this.cliente = cliente;
        this.placa = placa;
        this.valor = valor;
        this.concluido = false;
    }

    // consulta
    public String getCliente() {
        return cliente;
    }

    // consulta
    public String getPlaca() {
        return placa;
    }

    // consulta
    public double getValor() {
        return valor;
    }

    // consulta
    public boolean isConcluido() {
        return concluido;
    }

    // comando
    public void concluir() {
        if (concluido) {
            System.out.println("Serviço já foi concluído.");
        } else {
            concluido = true;
            System.out.println("Serviço atualizado para concluído.");
        }
    }

    // consulta, apesar de depois a gente manipular como falou, mas aqui ele
    // continua sendo consulta, porem Uma consulta que calcula o valor total a cobrar
    public double getCobranca() {
        return valor;
    }

    // consulta
    @Override
    public String toString() {
        String finalizado = isConcluido() ? "finalizado" : "não finalizado";
        return "Servico realizado para o cliente " + getCliente() + " do veiculo com placa " + getPlaca() +  ", status do servico: " + finalizado + ", no valor total de " + getCobranca();
    }
}
