public final class PagamentoPix extends Pagamento {
    private final double saldoConta;

    public PagamentoPix(double valor, double saldoConta) {
        super(valor);
        this.saldoConta = saldoConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    @Override
    public void processarPagamento() {
        if (!validarValor()) {
            setAprovado(false);
            return;
        }
        if (saldoConta >= getValor()) {
            setAprovado(true);
            IO.println("pix feito");
        } else {
            setAprovado(false);
            IO.println("sem saldo");
        }
    }
}