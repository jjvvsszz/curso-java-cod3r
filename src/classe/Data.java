package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    /*
    variáveis de instância são inicializadas por padrão (constantes não estão incluídas):
    byte, short, int, long -> 0
    float, double -> 0.0
    boolean -> false
    char -> '\u0000'
    Objeto -> null

    variáveis definidas em métodos não são inicializadas por padrão,
    portanto, não pode ser utilizada antes de ser inicializada manualmente
     */

    Data () {
//        dia = 1;
//        mes = 1;
//        ano = 1970;
        this(1, 1, 1970);
    }

    Data (int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String dataFormatada () {
        final String formato = "%d/%d/%d"; // variável local visível apenas dentro do método
        return String.format(formato, dia, mes, ano);
    }

    void imprimirDataFormatada () {
        System.out.println(dataFormatada());
    }
}
