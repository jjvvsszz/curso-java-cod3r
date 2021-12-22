package controle.desafios;

public class DesafioFor {

    public static void main(String[] args) {

        for (String valor = "#"; valor.equals("#") ||
                valor.equals("##") ||
                valor.equals("###") ||
                valor.equals("####") ||
                valor.equals("#####"); valor += "#") {
            System.out.println(valor);
        }

        for (String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }
    }
}
