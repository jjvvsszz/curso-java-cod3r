package classe;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto () {

    }

    Produto (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    double precoFinal () {
        return preco * (1 - desconto);
    }

    double precoFinal (double descontoAdicional) {
        return (preco * (1 - desconto)) - descontoAdicional;
    }
}
