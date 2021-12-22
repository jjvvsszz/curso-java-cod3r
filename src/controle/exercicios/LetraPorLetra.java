package controle.exercicios;

import java.util.Scanner;

public class LetraPorLetra {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira uma palavra: ");
        String palavra = entrada.next();
        int tamanho = palavra.length();

        System.out.println();

        for (int i = 0; i < tamanho; i++) {
            System.out.println(palavra.charAt(i));
        }

        entrada.close();
    }
}
