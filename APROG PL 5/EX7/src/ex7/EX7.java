package ex7;

import javax.swing.JOptionPane;

public class EX7 {

    public static void main(String[] args) {
        int a, b, aux, num, c, d, e, w;

        a = Integer.parseInt(JOptionPane.showInputDialog("Divisor 1"));

        b = Integer.parseInt(JOptionPane.showInputDialog("Divisor 2"));

        d = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Números"));
        e = 0;
        w=1;
        for (c = 1; c <= d; c++) {

            do {
                num = Integer.parseInt(JOptionPane.showInputDialog("Número "+w));
                w++;
            } while (num < 0);

            if (num % a == 0 && num % b == 0) {
                e++;
            }

        }

        JOptionPane.showMessageDialog(null, "A quantidade de números que são divisíveis simultaneamente : \n"
                + e);

    }

}
