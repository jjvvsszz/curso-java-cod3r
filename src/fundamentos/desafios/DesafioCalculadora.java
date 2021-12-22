package fundamentos.desafios;

import javax.swing.*;

public class DesafioCalculadora {


    public static void main(String[] args) {

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número"));
        String op = JOptionPane.showInputDialog("Qual operação?");
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número"));

        double resultado = op.equals("+") ? num1 + num2
                : op.equals("-") ? num1 - num2
                : op.equals("/") ? num1 / num2
                : op.equals("*") ? num1 * num2
                : op.equals("%") ? num1 % num2
                : op.equals("^") ? Math.pow(num1, num2)
                : op.equals("raiz") ? Math.pow(num1, 1 / num2)
                : 0;

        JOptionPane.showMessageDialog(null , num1 + op + num2 + "=" + resultado
                , "resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
