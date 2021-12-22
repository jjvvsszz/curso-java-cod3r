package controle.desafios;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {
        String entradaTexto;
        double entradaNota = 0;
        double somaNotas = 0;
        int quantidadeNotas = 0;
        int notaN;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quando terminar coloque a nota -1");

        while (entradaNota != -1) {
            notaN = quantidadeNotas + 1;
            System.out.print("Digite a nota " + notaN + ": ");
            entradaTexto = entrada.next();
            entradaTexto = entradaTexto.replace(",", ".");
            entradaNota = Double.parseDouble(entradaTexto);
            if (entradaNota >= 0 && entradaNota <= 10) {
                somaNotas += entradaNota;
                ++quantidadeNotas;
            } else if (entradaNota != -1) {
                System.out.println("Nota inválida!\nInsira uma nota válida");
            }
        }

        entrada.close();

        boolean plural = quantidadeNotas > 1;
        String pluralS = plural ? " notas " : " nota ";
        String pluralS2 = plural ? " dessas " : " dessa ";

        System.out.println("A média" + pluralS2 + quantidadeNotas + pluralS + " é " + somaNotas / quantidadeNotas);

    }
}
