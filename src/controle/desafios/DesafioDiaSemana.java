package controle.desafios;

import javax.swing.*;

public class DesafioDiaSemana {

    public static void main(String[] args) {

        Object[] diasDaSemana = {"Domingo", "Segunda-Feira", "Terça-Feira"
                , "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado"};
        int diaDaSemana = JOptionPane.showOptionDialog(null, "Escolha um dia", "Java"
                , JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE
                , null, diasDaSemana, "Domingo");
        ++diaDaSemana;

        JOptionPane.showMessageDialog(null, diaDaSemana, "Resultado"
                , JOptionPane.INFORMATION_MESSAGE);
        System.out.println(diaDaSemana);
    }
}
