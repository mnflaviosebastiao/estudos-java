public enum Status {
    CHECK_IN, AVALIACAO, ORCAMENTO, AGUARDANDO_APROVACAO, AGUARDANDO_PECAS, MANUTENCAO, TESTE, ENTREGUE, ORCAMENTO_RECUSADO, PAGO;
    
    public boolean isEncerrado() {
        return switch (this) {
            case ENTREGUE, ORCAMENTO_RECUSADO -> true;
            case CHECK_IN, AVALIACAO, ORCAMENTO, AGUARDANDO_APROVACAO, AGUARDANDO_PECAS, MANUTENCAO, TESTE, PAGO -> false;
        };
    }

    public Status proximoPasso()
    {
        return switch(this) {
            case CHECK_IN -> AVALIACAO;
            case AVALIACAO -> ORCAMENTO;
            case ORCAMENTO -> AGUARDANDO_APROVACAO;
            case AGUARDANDO_APROVACAO -> AGUARDANDO_PECAS;
            case AGUARDANDO_PECAS -> MANUTENCAO;
            case MANUTENCAO -> TESTE;
            case TESTE -> PAGO;
            case PAGO -> ENTREGUE;
            case ENTREGUE, ORCAMENTO_RECUSADO -> null;
        };
    }
}
