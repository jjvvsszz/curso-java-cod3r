package controle;

import java.util.Locale;

public class SwitchSemBreak {

    public static void main(String[] args) {

        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Faixa preta...");
            case "marrom":
                System.out.println("Faixa marrom...");
            case "roxa":
                System.out.println("faixa marrom...");
            case "verde":
                System.out.println("Faixa verde...");
                break;
            default:
                System.out.println("Nenhum anterior...");
        }
    }
}
