package controle;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        // if (...) sentença; ou {}
        // while (...) sentença; ou {}
        // for (...; ...; ...) sentença; ou {}

        // do sentença; ou {} while (...);

        Scanner entrada = new Scanner(System.in);

        String texto;

        do {
            System.out.println("Digite: ");
            texto = entrada.nextLine();
        } while(!texto.equalsIgnoreCase("exit"));

        entrada.close();
    }
}
