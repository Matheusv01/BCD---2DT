import java.util.Scanner;

import static java.lang.IO.*;

void main() {
    Scanner teclado = new Scanner(System.in);
    Plano aluno = null;
    String opcao = "";


    do {
        println("\n=== SISTEMA DA ACADEMIA ===\n 1- cadastrar pessoa em plano basico\n 2- cadastrar pessoa em plano vip\n 3- ver matriculados\n 0- sair do sistema");
        opcao = readln("escolha uma opcao para iniciar");

        switch (opcao) {
            case "1":
                String nomeBasico = Validador.lerTexto(teclado, "Nome do Aluno: ");
                String cpfBasico = Validador.lerTexto(teclado, "CPF do Aluno: ");
                double valorBaseBasico = Validador.lerNumeroDouble(teclado, "Valor Base do Plano (R$): ");
                aluno = new PlanoBasico(nomeBasico, cpfBasico, valorBaseBasico, 15.0);
                break;

            case "2":
                String nomeVip = Validador.lerTexto(teclado, "Nome do Aluno: ");
                String cpfVip = Validador.lerTexto(teclado, "CPF do Aluno: ");
                double valorBaseVip = Validador.lerNumeroDouble(teclado, "Valor Base do Plano (R$): ");
                int meses = Validador.lerNumeroInteiro(teclado, "Quantidade de Meses (1 a 24): ");

                int personalOpcao = Validador.lerNumeroInteiro(teclado, "Incluir Personal (+ R$ 50)? [1-Sim / 2-Nao]: ");
                boolean querPersonal = (personalOpcao == 1);
                aluno = new PlanoVip(nomeVip, cpfVip, valorBaseVip, meses, querPersonal);
                println("-> Plano VIP cadastrado com sucesso!");
                break;

            case "3":
                if (aluno == null) {
                    println("Aviso: Nenhum aluno cadastrado ainda!");
                } else {
                    println("\n--- COMPROVANTE DE MATRICULA ---");
                    println("Aluno: " + aluno.getNomeAluno());
                    println("CPF: " + aluno.getCpf());
                    println("Valor Mensal Final: R$ " + aluno.calcularMensalidade());
                    println("--------------------------------");
                    break;
                }

            case "0":
                System.out.println("Saindo do sistema... Ate logo!");
                break;
        }
    }while (!opcao.equals("0"));
}