package fundamentos.desafios.operadores;

public class DesafioLogicos {

    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        boolean trab1 = true;
        boolean trab2 = true;

        boolean tv50 = trab1 && trab2;
        boolean tv32 = trab1 ^ trab2;
        boolean sorvete = tv32 || tv50;
        boolean saude = !sorvete;

        System.out.println("comprou tv de 50 pol "
                + Boolean.toString(tv50).replace("true", "sim").replace("false", "não"));
        System.out.println("comprou tv de 32 pol "
                + Boolean.toString(tv32).replace("true", "sim").replace("false", "não"));
        System.out.println("tomou sorvete "
                + Boolean.toString(sorvete).replace("true", "sim").replace("false", "não"));
        System.out.println("ficou mais saudável "
                + Boolean.toString(saude).replace("true", "sim").replace("false", "não"));
    }
}
