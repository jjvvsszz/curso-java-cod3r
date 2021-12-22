package controle;

public class For1 {

    public static void main(String[] args) {

//        int contador = 20;
//
//        while (contador > 0) {
//            System.out.printf("i = %d\n", contador);
//            --contador;
//        }

        for (int contador = 10; contador > 0; --contador) {
            System.out.printf("i = %d\n", contador);
        }

        int x = 2;
        for (; x < 10;) {
            System.out.println("x = " + x);
            x++;
        }

//      for (;;) {
//          System.out.println("Laço infinito");
//      }
    }
}
