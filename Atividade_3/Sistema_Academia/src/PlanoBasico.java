public class PlanoBasico extends Plano {
    private double taxaInscricao;

    public PlanoBasico(String nomeAluno, String cpf, double valorBase, double taxaInscricao) {
        super(nomeAluno, cpf, valorBase);
        this.taxaInscricao = taxaInscricao;
    }

    @Override
    public double calcularMensalidade() {
        return getValorBase() + taxaInscricao;
    }
}