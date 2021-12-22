package fundamentos;

import java.util.Date; // importar funções fora de java.lang

public class Import {

    public static void main(String[] args) {
        String s = "Bon dia";
        System.out.println(s);

        Date d = new Date(); // função utilizada a partir de importação de java.util
        System.out.println(d);
    }
}
