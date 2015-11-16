package ex2;

import javax.swing.JOptionPane;

public class EX2 {

    public static void main(String[] args) {
        int temp, x;

        do {
            temp = Integer.parseInt(JOptionPane.showInputDialog("Inserir Temperatura pretendida"));

            if (temp >= -30 && temp < 9) {
                JOptionPane.showMessageDialog(null, "Muito Frio");

            } else if (temp >= 9 && temp < 15) {
                JOptionPane.showMessageDialog(null, "Frio");

            } else if (temp >= 15 && temp < 20) {
                JOptionPane.showMessageDialog(null, "Ameno");
            } else if (temp >= 20 && temp < 30) {
                JOptionPane.showMessageDialog(null, "Quente");
            } else if (temp >= 30 && temp < 50) {
                JOptionPane.showMessageDialog(null, "Muito Quente");
            } else {
                JOptionPane.showMessageDialog(null, "Temperatura Extrema");

            }
            do {
                x = Integer.parseInt(JOptionPane.showInputDialog(null, "Pretende continuar? \n"
                        + "Sim - Insira o valor 1 \n"
                        + "Não - Insira o valor 0 "));

            } while (x != 0 && x != 1);

        } while (x == 1);

    }

}
