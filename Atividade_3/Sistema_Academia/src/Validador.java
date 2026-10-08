import static java.lang.IO.*;
import java.util.Scanner;
public class Validador {

    public static String lerTexto(Scanner scanner, String mensagem) {
        println(mensagem);
        String texto = scanner.nextLine();

        while (texto.trim().equals("")) {
            println("digite um texto valido");
            println(mensagem);
            texto = scanner.nextLine();
        }
        return texto;
    }

    public static int lerNumeroInteiro(Scanner teclado, String mensagem) {
        println(mensagem);
        while (!teclado.hasNextInt()) {
            println("Erro: Digite apenas numeros!");
            teclado.next();
            println(mensagem);
        }
        int numero = teclado.nextInt();
        teclado.nextLine();
        return numero;
    }

    public static double lerNumeroDouble(Scanner teclado, String mensagem) {
        println(mensagem);
        while (!teclado.hasNextDouble()) {
            println("Erro: Digite um valor valido (ex: 100.0)!");
            teclado.next();
            print(mensagem);
        }
        double numero = teclado.nextDouble();
        teclado.nextLine();
        return numero;
    }
}