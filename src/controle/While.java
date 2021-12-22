package controle;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        boolean verify = true;
        String texto = "";

        while (verify) {
            System.out.print("Digite: ");
            texto = entrada.nextLine();
            verify = !texto.equalsIgnoreCase("exit")
                    && !texto.equalsIgnoreCase("sair");
//            System.out.println(verify);
        }

        entrada.close();
    }
}
