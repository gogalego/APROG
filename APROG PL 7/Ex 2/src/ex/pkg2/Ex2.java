package ex.pkg2;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ex2 {

    public static void main(String[] args) {
        int vencimento, nfuncionarios = 0;
        int v[] = new int[50];
        String[] nomes = new String[50];

        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Menu \n"
                    + "1 - Adicionar Funcionários \n"
                    + "2 - Listar Funcionários com salário inferior á média \n"
                    + "3 - Percentagem de salários inferiores a um dado valor \n \n"
                    + "0 - Sair"));

            switch (op) {

                case 1:

                    nfuncionarios = vencimento(nomes, v, nfuncionarios);
                    break;

                case 2:
                    double media = media1(nomes, v, nfuncionarios);

                    break;

                case 3:

                    percentagem(nomes, v, nfuncionarios);

                    break;

                case 0:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Número Inválido");

            }

        } while (op != 0);

    }

    public static int vencimento(String[] nomes, int[] v, int nfuncionarios) {
        int x = nfuncionarios;
        int a;
        String nome;
        JOptionPane.showMessageDialog(null, "Utilize o nome tt para parar");

        if (x < 50) {
            do {

                nome = JOptionPane.showInputDialog("Inserir Nome do Funcinário");

                if (!(nome.equals("tt"))) {

                    nomes[x] = nome;
                    v[x] = Integer.parseInt(JOptionPane.showInputDialog("Inserir Salário"));
                    x++;
                }

            } while (x != 50 && (!(nome.equals("tt"))));
        }

        return x;
    }

    public static double media1(String[] nomes, int[] v, int nfuncionarios) {
        double me = 0;
        double soma = 0;

        for (int i = 0; i <= nfuncionarios; i++) {
            soma = v[i] + soma;

        }

        me = soma / nfuncionarios;

        
        JOptionPane.showMessageDialog(null, "Os nomes dos funcinários com salário \n"
                + "inferior á média são: ");
        for (int i = 0; i <= nfuncionarios - 1; i++) {

            if (v[i] < me) {
                System.out.println(nomes[i]);
                
            }

        }

        return me;
    }

    public static void percentagem(String[] nomes, int[] v, int nfuncionarios) {
        double slimite = Integer.parseInt(JOptionPane.showInputDialog("Salário máximo"));
        double cfavo = 0;
        double per;

        for (int i = 0; i < nfuncionarios; i++) {

            if (v[i] < slimite) {
                cfavo++;
            }

        }

        per = (cfavo / nfuncionarios) * 100;

        JOptionPane.showMessageDialog(null, "A percentagem de funcinários com salário \n"
                + "inferior a " + slimite + " é " + per + "%");

    }

}
