public abstract class Plano {

    private String nomeAluno;
    private String cpf;
    private double valorBase;

    public Plano(String nomeAluno, String cpf, double valorBase) {
        this.nomeAluno = nomeAluno;
        this.cpf = cpf;
        this.valorBase = valorBase;
    }

    public abstract double calcularMensalidade();

    public String getNomeAluno() {
        return nomeAluno;
    }
    public String getCpf() {
        return cpf;
    }
    public double getValorBase() {
        return valorBase;
    }

    public String informacoesAluno () {
        return " informações do aluno:\n " +
                "nome do aluno : \n" + nomeAluno +
                "cpf do aluno : \n" + cpf +
                " valor base pago por aluno :" + valorBase;
    }
}