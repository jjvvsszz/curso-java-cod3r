package classe.desafio;

public class Pessoa {

    String nome;
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida c) {
        if (c != null) {
            System.out.println(nome + " está comendo " + c.comida);
            peso += c.peso / 1000;
        }
    }

    String dados () {
        return String.format("O Sr(a). %s pesa atualmente %.3f.", nome, peso);
    }
}
