public abstract class Servico {
    private String cliente;
    private String placa;
    private double valor;
    private Status status;

    public Servico(String cliente, String placa, double valor) {
        this.cliente = cliente;
        this.placa = placa;
        this.valor = valor;
        this.status = Status.CHECK_IN;
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
    public Status getStatus() {
        return status;
    }

    // comando
    public void avancar() {
        Status atual = getStatus();
        if (!atual.isEncerrado()) {
            Status proximo = atual.proximoPasso();
            status = proximo;
            System.out.println("Serviço movido para " + getStatus() + ".");
        } else {
            System.out.println("Serviço concluído.");
        }
    }

    // consulta, apesar de depois a gente manipular como falou, mas aqui ele
    // continua sendo consulta, porem Uma consulta que calcula o valor total a
    // cobrar
    public abstract double getCobranca();

    // consulta
    @Override
    public String toString() {
        return "Servico realizado para o cliente " + getCliente() + " do veiculo com placa " + getPlaca()
                + ", status do servico: " + getStatus() + ", no valor total de " + getCobranca();
    }

    public void recusar() {
        Status atual = getStatus();
        if (atual != Status.AGUARDANDO_APROVACAO) {
            System.out.println("Nessa fase atual não é permitido recusar");
            return;
        }
        status = Status.ORCAMENTO_RECUSADO;
        System.out.println("Status atualizado para " + getStatus());
    }
}
