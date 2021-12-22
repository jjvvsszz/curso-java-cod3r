package fundamentos;

public class TipoString {

    public static void main(String[] args) {
        // em valores literais sempre é possível chamar funcionalidades de uma String
        System.out.println("Olá mundo".charAt(2)); // charAt chama um caractere específico na String

        String s = "Boa noite";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("boa")); // nesse caso o resultado será falso pois o "B" da String é maiúsculo
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.endsWith("noite"));
        System.out.println(s.endsWith("noite!"));
        System.out.println(s.toUpperCase().endsWith("NOITE"));
        System.out.println(s.length());
        System.out.println(s.equals("boa noite"));
        System.out.println(s.toLowerCase().equals("boa noite"));
        System.out.println(s.equalsIgnoreCase("boa noite"));

        var nome = "João";
        var sobrenome = "Victor";
        var idade = 33;
        var salario = 12345.987;

        // \n quebra linha
        System.out.println("\n\nNome: " + nome
                + "\nSobrenome: " + sobrenome
                + "\nIdade: " + idade
                + "\nSalario: " + salario
                + "\n\n"); // não é interessante fazer uma sentença com muitas concatenações

        //usando String
        String frase1 = "Nome: " + nome
                + "\nSobrenome: " + sobrenome
                + "\nIdade: " + idade
                + "\nSalario: " + salario
                + "\n\n";
        System.out.println(frase1);

        // usando printf
        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario); // printf é um print formatado

        // usando String.format
        String frase2 = String.format("\n\nO senhor %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario);
        System.out.println(frase2);
    }
}
