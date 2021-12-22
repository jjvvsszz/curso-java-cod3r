package fundamentos.exercicios;

import javax.swing.*;

public class ConversaoTemperatura {

    public static void main(String[] args) {

        Object[] conversoes = {"Fahrenheit para celsius", "Celsius para fahrenheit"};
        Object qual = JOptionPane.showInputDialog(null, "Selecione", "Seleção"
                , JOptionPane.QUESTION_MESSAGE, null, conversoes, "Fahrenheit para celsius");

        String aConverter = qual.equals("Fahrenheit para celsius") ? "Fahrenheit" : "Celsius";
        double valorAConverter = Double.parseDouble(JOptionPane.showInputDialog(null
                , "Insira a temperatura em " + aConverter));

        boolean conv = qual.equals("Fahrenheit para celsius");

        double valorConvertido = conv ? (valorAConverter - 32) * 5 / 9
                : (valorAConverter * 9 / 5) + 32;

        String convertido = aConverter.equals("Fahrenheit") ? "Celsius" : "Fahrenheit";

        JOptionPane.showMessageDialog(null
                , valorAConverter + " graus " + aConverter + " são " + valorConvertido + " graus " + convertido
                , "Resultado da conversão", JOptionPane.INFORMATION_MESSAGE);
    }
}
