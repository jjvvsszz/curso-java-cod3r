package fundamentos;

public class Inferencia {

    public static void main(String[] args) {

        double a = 4.5; // definindo uma variavel real
        System.out.println(a);

        var b = 4.5; // var define o tipo da variavel automaticamente, nesse caso double
        System.out.println(b);

        var c = "text"; // aqui a variavel sera definida como string
        System.out.println(c);

        c = "another text";
        System.out.println(c);

        /*
        nao é possivel mudar o tipo de uma variável mesmo que ela tenha sido definida
        com o comando var

        por exemplo, nesse codigo eu nao poderia dar o comando
        c = 4.5
         */

        var f = 12; // variavel sera definida como int
        /*
        aqui nesse caso nao seria possivel, por exemplo, definir a variavel f como
        12.1 porque uma variavel int armazena apenas numeros inteiros
         */
        System.out.println(f);
    }
}
