import static java.lang.IO.*;

void main() {
    //1. Leitura dos dados dos funcionarios

    println("Cadastro Gerente");
    String nome_gerente = readln("Digite o nome do Gerente: ");
    if (nome_gerente != null && !nome_gerente.isEmpty()){
    }
    String cpf_gerente = readln("Digite o CPF do Gerente: ");
    if (cpf_gerente < 10){
        println("cpf invalido");
    }
    double salario_gerente = Double.parseDouble(readln("Digite o salário do Gerente: "));

    println("\nCadastro Desenvolvedor");
    String nome_desenvolvedor = readln("Digite o nome do Desenvolvedor: ");
    String cpf_desenvolvedor = readln("Digite o CPF do Desenvolvedor: ");
    double salario_desenvolvedor = Double.parseDouble(readln("Digite o salário do Desenvolvedor: "));

    println("\nCadastro Vendador");
    String nome_vendedor = readln("Digite o nome do Vendedor: ");
    String cpf_vendedor = readln("Digite o CPF do Vendedor: ");
    double salario_vendedor = Double.parseDouble(readln("Digite o salário do Vendedor: "));
    double totalVendido_vendedor = Double.parseDouble(readln("Digite o valor de vendas: "));

    //Vamos instanciar o Gerente
    Funcionario gerente = new Gerente(nome_gerente, cpf_gerente, salario_gerente);
    gerente.exibirHolerite();

    //Instanciar Desenvolvedor
    Funcionario desenvolvedor = new Desenvolvedor(nome_desenvolvedor,cpf_desenvolvedor, salario_desenvolvedor);
    desenvolvedor.exibirHolerite();

    //Instanciar Vendedor
    Funcionario vendedor = new Vendedor(nome_vendedor, cpf_vendedor, salario_vendedor, totalVendido_vendedor);
    vendedor.exibirHolerite();


}
