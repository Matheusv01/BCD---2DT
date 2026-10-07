public final class PagamentoCartaoCredito extends Pagamento {
    private final double limiteDisponivel;

    public PagamentoCartaoCredito(double valor, double limiteDisponivel) {
        super(valor);
        this.limiteDisponivel = limiteDisponivel;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    @Override
    public void processarPagamento() {
        if (!validarValor()) {
            setAprovado(false);
            return;
        }
        if (limiteDisponivel >= getValor()) {
            setAprovado(true);
            IO.println("cartao aprovado");
        } else {
            setAprovado(false);
            IO.println("cartao recusado");
        }
    }
}