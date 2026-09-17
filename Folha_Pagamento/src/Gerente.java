public class Gerente extends Funcionario{

    //Construtor
    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double calcularBonificacao() {
        return getSalario() * 0.20;
    }
}
