package pl.pkg7.ex.pkg3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PL7Ex3 {

    public static void main(String[] args) {
        int n = 0;
        String nomes[] = new String[100];
        Scanner ler = new Scanner(System.in);
        String m
                = "1- Ler Nomes\n2- Enigma Nome\n3- Listar quantidade de nomes \n"
                + "\n0- Sair";

        int op;
        do {

            op = Integer.parseInt(JOptionPane.showInputDialog(m));

            switch (op) {
                case 1:
                    n = lerNomes(nomes, n);
                    break;
                case 2:

                    
                    n = enigma(nomes, n);
                    break;
                case 3:

                    listar(nomes, n);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!!");
            }
        } while (op != 0);
    }

    private static int lerNomes(String[] nomes, int n) {
        int total = n;

        String nome;
        JOptionPane.showMessageDialog(null, "Utilize o nome FIM para parar");

        if (total < 100) {
            do {

                nome = JOptionPane.showInputDialog("Inserir Nome");

                if (!(nome.equals("FIM"))) {

                    nomes[total] = nome;

                    total++;
                }

            } while (total != 100 && (!(nome.equalsIgnoreCase("FIM"))));
        }

        return total;
    }

    private static void listar(String[] nomes, int n) {
        int x;

        do {
            x = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserir quantidade de nomes iniciais \n"
                    + "que pretende listar"));
        } while (x >= n);

        for (int i = 0; i < x; i++) {

            System.out.println(nomes[i]);

        }

    }

    private static int enigma(String[] nomes, int n) {
        int i = 0;
        String nome;
        
        nome=JOptionPane.showInputDialog("Qual é nome que pretende eliminar");
        
        while (i < n && !nomes[i].equalsIgnoreCase(nome)) {
            i++;
        }
        if (i == n) {
            JOptionPane.showMessageDialog(null, "O nome inserido não se encontra na lista");
            return n;
        } else {
            for (int j = i; j < n - 1; j++) {
                nomes[j] = nomes[j + 1];
            }
            return n--;
        }
    }
}
