package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

    public static void main(String[] args) {
        System.out.println("2" == "2");

        String s = new String("2");
        System.out.println("2" == s);
        System.out.println("2".equals(s));

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.next(); // next não considera espaço
        System.out.println("2" == s2);
        System.out.println("2".equals(s2));

        s2 = entrada.nextLine(); // nextLine considera espaços
        System.out.println("2" == s2);
        System.out.println("2".equals(s2.trim())); // .trim remove espaços da String

        entrada.close();
    }
}
