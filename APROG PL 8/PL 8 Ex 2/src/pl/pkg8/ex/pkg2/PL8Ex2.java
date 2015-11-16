package pl.pkg8.ex.pkg2;
//A funcionalidade do algoritmo é mostrar o maior número de cada linha

import javax.swing.JOptionPane;

public class PL8Ex2 {

    public static void main(String[] args) {
        int x;
        int m[][] = {{1, 4, 2, 1}, {9, 7, 2, 2}, {1, 7, 3, 5}, {2, 5, 0, 3}, {4, 7, 2, 1}};

        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("1- Mostrar Matriz \n"
                    + "2- Mostrar média de cada linha e a média global \n"
                    + "3- Mostrar  matriz transposta\n"
                    + "0- Sair"));

            switch (op) {

                case 1:
                    mostrar(m);
                    break;
                case 2:
                    media(m);
                    break;
                case 3:
                    transposta(m);
                    break;
                case 0:
                    break;

            }

        } while (op != 0);

    }

    private static void mostrar(int[][] m) {
        int num;
        System.out.println("Matriz: ");
        for (int i = 0; i < m.length; i++) {
            String linha = "";
            for (int j = 0; j < m[i].length; j++) {
                num = m[i][j];

                linha = linha + num + " ";

            }
            System.out.println(linha);
        }

    }

    private static void media(int[][] m) {
        double m1;
        double total = 0;

        System.out.println("Média: ");
        for (int i = 0; i < m.length; i++) {
            String media = "";
            m1 = 0;
            for (int j = 0; j < m[i].length; j++) {
                m1 = m1 + m[i][j];
            }
            m1 = m1 / m[i].length;
            int q = i + 1;
            media = "linha " + q + ": " + m1;
            System.out.println(media);
            total = total + m1;
        }
        m1 = total / (m.length);
        System.out.println("Média global = " + m1);

    }

    private static void transposta(int[][] m) {
        int num=0;
        System.out.println("Matriz transposta :");

        int colunas=m[1].length;
        int linhas = m.length;
        
        for (int i = 0; i < colunas; i++) {
            
            String mostrar= "";
            for (int j = 0; j < linhas; j++) {
                num=m[j][i];
                
                mostrar=mostrar + num + " ";
                
            }
            System.out.println(mostrar);
        }
        
           
    }

}
