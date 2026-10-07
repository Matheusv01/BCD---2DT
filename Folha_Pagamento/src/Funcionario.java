abstract class Funcionario {

    //atributos
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    //Metodo para consultar todos os dados
    public String getDados(){
        return "Nome: " + nome + " - CPF: " + cpf + " - Salario: " + salario;
    }

    //Metodo para ler o valor do salario
    public double getSalario(){
        return salario;
    }

    abstract double calcularBonificacao();

    public double calcularRemuneracaoTotal(){
        return salario + calcularBonificacao();
    }

    public void exibirHolerite(){
        IO.println("\nFuncionário: " + nome);
        IO.println("Cargo: " + getClass().getSimpleName());
        IO.println("Salário: " + salario);
        IO.println("Bonificação: " + calcularBonificacao());
        IO.println("Remuneração: " + calcularRemuneracaoTotal());
    }
}
