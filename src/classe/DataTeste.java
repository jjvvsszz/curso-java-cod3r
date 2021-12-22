package classe;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data (14,6,2002);
        Data d2 = new Data (20,12,2021);

        Data d3 = new Data (27, 12, 2021);
        Data d4 = new Data ();

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());
        System.out.println(d3.dataFormatada());
        System.out.println(d4.dataFormatada());

//        d1.imprimirDataFormatada();
//        d2.imprimirDataFormatada();
//        d3.imprimirDataFormatada();
//        d4.imprimirDataFormatada();
    }
}
