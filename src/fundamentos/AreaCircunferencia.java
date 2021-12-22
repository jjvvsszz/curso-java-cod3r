package fundamentos;

public class AreaCircunferencia {

    public static void main(String[] args) {
        // double = variavel real
        double raio = 3.4;
        final double PI = 3.14159; // colocar final antes da variavel o torna uma constante

        double area = PI * raio * raio;

        System.out.println(area);

        // para alterar o valor de uma variavel nao especificar o tipo da variavel antes
        // apenas colocar a variavel = novo valor
        raio = 10;
        area = PI * raio * raio;
        System.out.println(area);
    }
}
