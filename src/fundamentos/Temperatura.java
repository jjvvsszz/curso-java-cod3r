package fundamentos;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        // (F - 32) x 5/9 = C

        // definindo constantes para formula
        final int CONS1 = 32;
        final double CONS2 = 5.0/9.0;

        // definindo variaveis para formula
        double f = 212;
        double c = (f - CONS1) * CONS2;

        // imprimindo o resultado no console
        System.out.println(f + " graus Fahrenheit = " + c + " graus Celsius");

        // calculando outro valor
        f = 86;
        c = (f - CONS1) * CONS2;

        // imprimindo o novo resultado no console
        System.out.println(f + " graus Fahrenheit = " + c + " graus Celsius");

        // a partir daqui não faz parte dessa aula
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n\nDigite os graus Fahrenheit: ");
        f = entrada.nextDouble();
        System.out.println();
        c = (f - CONS1) * CONS2;
        System.out.println(f + " graus Fahrenheit = " + c + " graus Celsius");
        entrada.close();
    }
}
