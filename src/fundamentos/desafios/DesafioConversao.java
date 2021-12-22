package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Digite o salário do mês 1: ");
        String mes1 = input.nextLine();
        mes1 = mes1.replace(",", ".");

        System.out.print("Digite o salário do mês 2: ");
        String mes2 = input.nextLine();
        mes2 = mes2.replace(",", ".");

        System.out.print("Digite o salário do mês 3: ");
        String mes3 = input.nextLine();
        mes3 = mes3.replace(",", ".");

        input.close();

        double sal1 = Double.parseDouble(mes1);
        double sal2 = Double.parseDouble(mes2);
        double sal3 = Double.parseDouble(mes3);
        //System.out.println("mes1 = " + mes1 + "\nmes2 = " + mes2 + "\nmes3 = " + mes3);
        double media =  (sal1 + sal2 + sal3) / 3;
        System.out.println("A média salarial é R$" + media);
    }
}
