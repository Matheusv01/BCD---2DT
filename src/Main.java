import static java.lang.IO.*;
void main() {

    Scanner teclado = new Scanner(System.in);

    List<Pessoa> banco = new LinkedList<>();
    banco.add(new Pessoa(1, "João", 22));
    banco.add(new Pessoa(2, "fiama", 22));
    banco.add(new Pessoa(3, "danilo", 22));
    banco.add(new Pessoa(4, "Henrique", 22));
    banco.add(new Pessoa(5, "Atila", 22));

    List<Pessoa> cache = new LinkedList<>();
    int limiteCache = 10;

    String opcao = "";

    do {
        println(" ==== SISTEMA DE CADASTRO E BUSCA ====\n 1 - cadastrar pessoa, 2 - buscar pessoa e 0 - sair do sistema");
        opcao = readln("digite a opçcao que deseja");

        switch (opcao) {

            case "1":
                Pessoa p = new Pessoa();
                p.setId(Integer.parseInt(IO.readln("Digite o ID \n")));
                p.setNome(IO.readln("Digite o nome \n"));
                p.setIdade(Integer.parseInt(IO.readln("Digite sua idade \n")));
                banco.add(p);
                break;

            case "2":
                int procurarId = Integer.parseInt(readln("qual o id da pessoa que deseja encontrar? : "));
                Pessoa pessoaCache = buscarId(cache, procurarId);

                if (pessoaCache != null){
                    println("pessoa encontrada!! " + pessoaCache);
                } else{
                    Pessoa pessoaBanco = buscarId(banco, procurarId);

                    if (pessoaBanco != null){
                        println("pessoa encontrada!! " + pessoaBanco);
                        if (cache.size() >= limiteCache){
                            cache.remove(0);
                        }
                        cache.add(pessoaBanco);
                        println("pessoa encontrada e cadastrada no cache!!!");
                    } else {
                        println("pessoa n encontrada!!");
                    }
                }break;

            case "0":
                println("Encerrando o sistema!!");
                break;
        }
    } while (!opcao.equals("0"));
}

    Pessoa buscarId(List<Pessoa> lista, int id) {
        for (Pessoa p : lista) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }



