package classe;

public class Data {

    int dia;
    int mes;
    int ano;

    Data () {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    Data (int diaInf, int mesInf, int anoInf) {
        dia = diaInf;
        mes = mesInf;
        ano = anoInf;
    }

    String dataFormatada () {
        return String.format("%d/%d/%d", dia, mes, ano);
    }

    void imprimirDataFormatada () {
        System.out.println(dataFormatada());
    }
}
