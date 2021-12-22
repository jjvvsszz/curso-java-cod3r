package fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!\n\n");

        System.out.println("Bom"); // println é um print que quebra linha ao final da impressão no console
        System.out.println("dia!");

        System.out.printf("Megassena: %d %d %d %d %d %d\n\n",
                1, 2, 3, 4, 5, 6);
        System.out.printf("Salário: %.2f\n", 1234.5678);
        System.out.printf("Nome: %s\n", "João");

        Scanner entrada = new Scanner(System.in); // define um Scanner System.in na variável "entrada"

        System.out.print("Digite seu nome: ");
        // cria a String nome e o conteúdo dela será informado pelo usuário através do System.in (console)
        // acima definido na variável entrada utilizada aqui
        String nome = entrada.nextLine(); // usa o comando nextLine que retorna uma String

        // repete a mesma coisa acima para o sobrenome
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        // no caso de uma variável int utiliza-se o comando nextInt que retorna um inteiro
        int idade = entrada.nextInt();

        System.out.print("Digite seu salario: ");
        // no caso de uma variável double utiliza-se o comando nextDouble que retorna um inteiro
        double salario = entrada.nextDouble();

        String frase = String.format("O senhor %s %s tem %d anos e tem um salário de %.2f!",
                nome, sobrenome, idade, salario);
        System.out.println(frase);

        entrada.close();
    }
}
