package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

    public static void main(String[] args) {

        double a = 1; // conversão implícita de int para double
        System.out.println(a);

        float b = (float) 1.12345; // conversão explícita (CAST)
        System.out.println(b);

        int c = 256;
        byte d = (byte) c; // para converter de um tipo maior para um tipo menor tem que explicitar
        System.out.println(d);

        double e = 1.9999;
        int f = (int) a; // explícita (CAST)
        System.out.println(f);
    }
}
