package pl.pkg8.ex.pkg3;

import javax.swing.JOptionPane;

public class PL8Ex3 {

    public static void main(String[] args) {
        int n_li;

        n_li = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanha do quadrado que pretende utilizar"));
        if (n_li < 2) {

            do {

                JOptionPane.showMessageDialog(null, "Erro insira um valor válido");

                n_li = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanha do quadrado que pretende utilizar"));

            } while (n_li < 2);
        }
        int mat[][] = new int[n_li][n_li];

        int op = 0;
        do {
            
            

            op = Integer.parseInt(JOptionPane.showInputDialog("1- Inserir\n"
                    + "2- Verificar quadrado mágico\n"
                    + "0- Sair"));

            switch (op) {

                case 1:
                    inserir(mat, n_li);
                    break;

                case 2:
                    verficar(mat, n_li);
                    break;
                case 0:
                    break;

            }

        } while (op != 0);

    }

    private static void inserir(int[][] mat, int n_li) {
        int c = 1;
        int l = 1;

        for (int i = 0; i < n_li; i++) {
            c = 1;
            for (int j = 0; j < n_li; j++) {

                mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Posição: " + l + "x" + c));
                c++;
            }
            l++;
        }

    }

    private static void verficar(int[][] mat, int n_li) {
        int c = n_li;
        int l = n_li;
        int soma = 0;
        int x;
        int validador = 0;

        // linhas
        x = 0;
        for (int j = 0; j < n_li; j++) {
            x = x + mat[0][j];

        }
        soma = x;

        for (int i = 1; i < n_li; i++) {
            x = 0;
            for (int j = 0; j < n_li; j++) {

                x = x + mat[i][j];

            }

            if (soma != x) {
                validador = 1;
            }
        }

        // colunas
        if (validador == 0) {

            for (int i = 0; i < n_li; i++) {
                x = 0;
                for (int j = 0; j < n_li; j++) {

                    x = x + mat[j][i];

                }

                if (soma != x) {
                    validador = 1;
                }
            }
            // diagonal esquerda direita
        } else if (validador == 0) {
            x = 0;
            for (int i = 0; i < n_li; i++) {
                x = x + mat[i][i];
            }
            if (soma != x) {
                validador = 1;
            }

            //diagonal direita esquerda    
        } else if (validador == 0) {
            x = 0;
            int pos = n_li - 1;
            for (int i = 0; i < n_li; i++) {
                x = x + mat[i][pos];

                pos--;
            }
            if (soma != x) {
                validador = 1;
            }

        }
        
        
        if (validador == 0) {
            JOptionPane.showMessageDialog(null, "A matriz apresentada é um quadrado mágico");
            
        }else{
            JOptionPane.showMessageDialog(null, "A matriz apresentada não é quadrado mágico");
        }
        

    }

}
