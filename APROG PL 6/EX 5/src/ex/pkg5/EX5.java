package ex.pkg5;

import javax.swing.JOptionPane;

public class EX5 {

    public static void main(String[] args) {
        int num1, num2, aux;
        String nume1, nume2;

        do {
            JOptionPane.showMessageDialog(null, "Inserir 2 números positivos maiores que zero");
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Inserir primeiro número"));
            num2 = Integer.parseInt(JOptionPane.showInputDialog("Inserir segundo número"));
        } while (num1 < 0 || num2 < 0);

        if (num2 > num1) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        nume1 = Integer.toString(num1);
        nume2 = Integer.toString(num2);

        int dig1 = nume1.length();
        int dig2 = nume2.length();

        int x = metodo(nume1, nume2, dig2, dig1);

        JOptionPane.showMessageDialog(null, "O número de de digitos iguais é:  " + x);

    }

    public static int metodo(String nume1, String nume2, int dig2, int dig1) {
        int cont = 0;
        int x;

        if (dig1 == dig2) {
            for (int i = dig2 - 1; i >= 0; i--) {

                if (nume1.charAt(i) == nume2.charAt(i)) {
                    cont++;

                }
            }
        } else {
            x = dig1 - dig2;

            for (int i = dig2 - 1; i >= 0; i--) {

                if (nume1.charAt(i + x) == nume2.charAt(i)) {
                    cont++;

                }

            }

        }
        return cont;
    }

}
