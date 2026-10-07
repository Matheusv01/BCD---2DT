import static java.lang.IO.*;

public final class PagamentoBoleto extends Pagamento {
    private final int diasParaVencimento;

    public PagamentoBoleto(double valor, int diasParaVencimento) {
        super(valor);
        this.diasParaVencimento = diasParaVencimento;
    }

    public int getDiasParaVencimento() {
        return diasParaVencimento;
    }

    @Override
    public void processarPagamento() {
        if (!validarValor()) {
            setAprovado(false);
            return;
        }
        setAprovado(true);
        println("Boleto gerado com sucesso! Vencimento em " + diasParaVencimento + " dias.");
    }
}