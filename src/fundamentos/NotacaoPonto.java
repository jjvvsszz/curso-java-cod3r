package fundamentos;

public class NotacaoPonto {

    public static void main(String[] args) {

        String s  = "teste de String X"; // definindo String "s"
        s = s.replace("X", "curso Udemy"); // substituindo a letra "X" por "curso Udemy" na String "s"
        s = s.toUpperCase(); // deixando todas letras da String "s" maiúsculas
        s = s.concat("!!!"); // adicionando "!!!" no final da String "s"

        System.out.println(s);

        String x = "teste".toUpperCase(); // notações ponto podem ser aplicadas na própria String
        System.out.println(x);

        String y = "teste x"
                // pode quebrar linhas entre as notações
                .replace("x", "chamadas String")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);

        // Tipos primitivos não tem o operador "."
        int a = 3;
        System.out.println(a);
    }
}
