public sealed abstract class Pagamento
        permits PagamentoPix, PagamentoCartaoCredito, PagamentoBoleto {

    private final String idTransacao;
    private final double valor;
    private boolean aprovado;

    public Pagamento(double valor) {
        this.valor = valor;
        this.idTransacao = java.util.UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        this.aprovado = false;
    }

    public String getIdTransacao() {
        return idTransacao;
    }

    public double getValor() {
        return valor;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    protected void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public boolean validarValor() {
        if (valor <= 0) {
            IO.println("Erro [" + idTransacao + "]: O valor do pagamento deve ser maior que zero.");
            return false;
        }
        return true;
    }

    public abstract void processarPagamento();

    public void exibirResumo() {
        IO.println("----------------------------------------");
        IO.println("ID Transação: " + idTransacao);
        IO.println("Forma de Pagamento: " + getClass().getSimpleName());
        IO.println("Valor: R$ " + valor);
        IO.println("Status: " + (aprovado ? "APROVADO" : "RECUSADO"));
    }
}