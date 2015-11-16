
package pl.pkg8.ex.pkg1;

import javax.swing.JOptionPane;

public class PL8Ex1 {

    public static void main(String[] args) {
        int n = 0;
        int op = 0;
        int ntotal = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Insira o número máximo de número\n"
                + "que pretende utilizar "));
        if (n <= 0) {
            do {
                JOptionPane.showMessageDialog(null, "Número inválido !! \nTente novamente");
                n = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de números que pretende utilizar "));
            } while (n <= 0);
        }

        int vec1[] = new int[n];

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir Números\n"
                    + "2 - Listar o Maiores números\n"
                    + "0 - Sair"));

            switch (op) {

                case 1:
                    ntotal = inserir(vec1, n, ntotal);
                    ordenar(vec1, n, ntotal);
                    break;
                case 2:
                    listar(vec1, n, ntotal);
                    break;

                case 0:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Número inválido");

            }

        } while (op != 0);

    }

    private static int inserir(int[] vec1, int n, int ntotal) {
        String num = "";
        int pos = ntotal + 1;

        JOptionPane.showMessageDialog(null, "Nota!! \n\n"
                + "Utilize a palavra Fim para terminar de inserir números");
        do {
            num = JOptionPane.showInputDialog("Número inserido nº" + pos);

            if (!(num.equalsIgnoreCase("Fim"))) {

                vec1[ntotal] = Integer.parseInt(num);

                ntotal++;
                pos++;
            }

        } while (!(num.equalsIgnoreCase("Fim")) && ntotal < n);

        return ntotal;
    }

    private static void ordenar(int[] vec1, int n, int ntotal) {
        int aux;

        for (int i = 0; i < ntotal - 1; i++) {

            for (int j = i + 1; j < ntotal; j++) {

                if (vec1[i] < vec1[j]) {
                    aux = vec1[i];
                    vec1[i] = vec1[j];
                    vec1[j] = aux;

                }

            }

        }

    }

    private static void listar(int[] vec1, int n, int ntotal) {
        int m;
        int x;

        if(ntotal!=0){
            
        
        do {
            m = Integer.parseInt(JOptionPane.showInputDialog("Qual é quantidade de números quer ver por ordem decrescente"));

            if (m < 0 || m > ntotal) {
                JOptionPane.showMessageDialog(null, "Número inválido!!\n"
                        + "O número inserido não está dentro dos parâmetro ");
            }

        } while (m > ntotal);
        
         System.out.println("Lista: ");
        for (int i = 0; i < m; i++) {
            x=vec1[i];
            
            System.out.println("- "+x);
            
        }
        }else{
            JOptionPane.showMessageDialog(null, "Tem de inserir primeiro os números");
        }
        

    }
}
