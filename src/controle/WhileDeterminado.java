package controle;

public class WhileDeterminado {

    public static void main(String[] args) {

        int contador = 20;

        while (contador > 0) {
            System.out.printf("i = %d\n", contador);
            --contador;
        }
    }
}
