package fundamentos;

public class Wrappers {

    public static void main(String[] args) {

        /*
        Para cada tipo primitivo tem um tipo orientado a objeto.
        O objetivo de usar um tipo orientado a objeto é poder utilizar notações ponto.
        Para usar o tipo orientado a objeto basta colocar a primeira letra em maiúsculo
        (ex: tipo primitivo long → tipo orientado a objeto Long)
        (com exceção do int que orientado a objeto fica Integer)
         */
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Float f = 123.1F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character c = '#';
        System.out.println(c + "...");
    }
}
