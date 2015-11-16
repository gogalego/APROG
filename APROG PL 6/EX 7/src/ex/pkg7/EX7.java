package ex.pkg7;

import javax.swing.JOptionPane;

public class EX7 {

    public static void main(String[] args) {
        int num;
        double num2 = 0;
        String num1;
        Boolean veri;
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserir número"));

        veri = verificar(num);

        if (veri == true) {

            num2 = converter(num);

            JOptionPane.showMessageDialog(null, "O número inserido (em octal) " + num + "\n em decimal é:  " + num2);

        } else {
            JOptionPane.showMessageDialog(null, "O número inserido não é octal");
        }

    }

    public static boolean verificar(int num) {
        int aux = num;
        int dig;
        boolean veri = true;
        String nume = Integer.toString(num);

        do {
            dig = aux % 10;
            if (dig == 8 || dig == 9) {
                veri = false;
                break;
            }
            aux = aux / 10;

        } while (aux != 0);

        return veri;
    }

    public static double converter(int num) {
        double soma = 0;
        double aux = num;
        double x = 0, y = 0;
        String nume = Integer.toString(num);
        int dig = nume.length();

        do {

            x = aux % 10;

            soma = soma + x * (Math.pow(8, y));

            aux = aux / 10;
            y = y + 1;
        } while (aux>0);

        return soma;
    }
}
