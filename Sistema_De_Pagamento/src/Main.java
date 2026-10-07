import static java.lang.IO.*;
void main() {
    Checkout checkout = new Checkout();

    Pagamento pixValido = new PagamentoPix(150.00, 500.00);
    checkout.realizarCheckout(pixValido);

    Pagamento cartaoSemLimite = new PagamentoCartaoCredito(1200.00, 800.00);
    checkout.realizarCheckout(cartaoSemLimite);

    Pagamento boleto = new PagamentoBoleto(350.00, 3);
    checkout.realizarCheckout(boleto);

    Pagamento pixInvalido = new PagamentoPix(0.00, 100.00);
    checkout.realizarCheckout(pixInvalido);
}