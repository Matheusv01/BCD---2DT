public class Vendedor extends Funcionario{

    private double totalVendido;

    //Construtor
    public Vendedor(String nome, String cpf, double salario, double totalVendido) {
        super(nome, cpf, salario);
        this.totalVendido = totalVendido; //este atributo é desta classe
    }

    public double calcularComissao(){
        return this.totalVendido * 0.05;
    }
    @Override
    public double calcularBonificacao() {
        return getSalario() * 0.05 + calcularComissao();
    }

    @Override
    public  String getDados(){
        return super.getDados() + "Vendas: R$:" + totalVendido;
    }
}
