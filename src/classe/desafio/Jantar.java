package classe.desafio;

public class Jantar {

    public static void main(String[] args) {
        Pessoa jao = new Pessoa("Jão", 55.8);
        Pessoa qualquer = new Pessoa("Pessoa Qualquer", 63);
        Pessoa vegana = new Pessoa("Pessoa Vegana", 60.1);

        Comida arroz = new Comida("Arroz", 250);
        Comida feijao = new Comida("Feijão", 200);
        Comida carne = new Comida("Carne", 120);

        System.out.println(jao.dados());
        jao.comer(arroz);
        jao.comer(carne);
        System.out.println(jao.dados());
        System.out.println();

        System.out.println(qualquer.dados());
        qualquer.comer(arroz);
        qualquer.comer(feijao);
        qualquer.comer(carne);
        System.out.println(qualquer.dados());
        System.out.println();

        System.out.println(vegana.dados());
        vegana.comer(arroz);
        vegana.comer(feijao);
        System.out.println(vegana.dados());
    }
}
