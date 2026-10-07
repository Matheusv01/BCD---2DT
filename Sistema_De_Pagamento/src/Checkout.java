public class Checkout {

    public void realizarCheckout(Pagamento pagamento) {
        IO.println("\nIniciando");

        switch (pagamento) {
            case PagamentoPix pix
                    -> IO.println("-> Processando chave PIX...");
            case PagamentoCartaoCredito cartao
                    -> IO.println("-> Conectando à operadora do cartão...");
            case PagamentoBoleto boleto
                    -> IO.println("-> Gerando linha digitável do boleto...");
        }

        pagamento.processarPagamento();
        pagamento.exibirResumo();
    }
}