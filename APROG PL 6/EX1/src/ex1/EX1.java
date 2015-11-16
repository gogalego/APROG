package ex1;

import javax.swing.JOptionPane;

public class EX1 {

    public static void main(String[] args) {
        String pal;
        int cont;
        boolean res;
        cont = 0;
        do {
            do {
                pal = JOptionPane.showInputDialog("Inserir Palavra");
            } while (pal.length() < 2);
            cont++;
            res = metodo(pal);
        } while (res == false);
        cont--;

        JOptionPane.showMessageDialog(null, "O número de palavras inseridas até \n"
                + "encontrar o palíndromo " + cont + " palavras");
    }

    public static boolean metodo(String pal) {
        boolean res = true;
        pal = pal.toLowerCase();
        int tamanho = pal.length();
        for (int i = 0; i < tamanho / 2; i++) {
            if (pal.charAt(i) != pal.charAt(tamanho - 1 - i)) {
                res = false;
                break;
            }
        }
        return res;

    }

}
