package controle.exercicios;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = entrada.nextInt();
        boolean primo = true;

        for (int i = num - 1; i > 1; i--) {
            System.out.printf("[%d / %d]\n", num, i);
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        if (primo) {
            System.out.println("Número primo!!");
        } else {
            System.out.println("Número não é primo.");
        }

        entrada.close();
    }
}
