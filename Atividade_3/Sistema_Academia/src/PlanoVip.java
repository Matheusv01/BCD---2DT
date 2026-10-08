public class PlanoVip extends Plano implements Fidelizavel {
    private int mesesContratados;
    private boolean querPersonal;

    public PlanoVip(String nomeAluno, String cpf, double valorBase, int mesesContratados, boolean querPersonal) {
        super(nomeAluno, cpf, valorBase);
        this.mesesContratados = mesesContratados;
        this.querPersonal = querPersonal;
    }

    @Override
    public double aplicarDesconto(int meses) {
        if (meses >= 12) {
            return 0.20; // 20% de desconto no plano de 1 ano
        } else if (meses >= 6) {
            return 0.10; // 10% de desconto no plano de 6 meses
        }
        return 0.0;
    }

    @Override
    public double calcularMensalidade() {
        double valor = getValorBase();

        // Adiciona valor do personal se escolheu sim
        if (querPersonal) {
            valor = valor + 50.0;
        }

        // Aplica o desconto
        double desconto = aplicarDesconto(mesesContratados);
        return valor * (1.0 - desconto);
    }
}