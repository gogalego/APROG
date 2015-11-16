package pl8.ex.pkg4;

import javax.swing.JOptionPane;

public class PL8Ex4 {

    public static void main(String[] args) {
        int n_co;
        int n_li;

        n_li = Integer.parseInt(JOptionPane.showInputDialog("Quantas linhas deseja?"));
        n_co = Integer.parseInt(JOptionPane.showInputDialog("Quantas colunas deseja?"));

        while (n_co <= 0 || n_li <= 0) {
            JOptionPane.showMessageDialog(null, "Erro !! \nInserir uma matriz válida ");
            n_li = Integer.parseInt(JOptionPane.showInputDialog("Quantas linhas deseja?"));
            n_co = Integer.parseInt(JOptionPane.showInputDialog("Quantas colunas deseja?"));
        }

        int mat[][] = new int[n_li][n_co];

        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("1- Inserir número \n"
                    + "2- Listar Matriz\n"
                    + "3- Listar Repetições de Númeroos\n"
                    + "0- Sair"));

            switch (op) {

                case 1:
                    inserir(mat);
                    break;
                case 2:
                    mostrar(mat);
                    break;
                    
                case 3:
                    listar(mat);
                    break;

                case 0:
                    break;

            }

        } while (op != 0);

    }

    private static void inserir(int[][] mat) {

        int l = 1;

        for (int i = 0; i < mat.length; i++) {
            int c = 1;
            for (int j = 0; j < mat[i].length; j++) {

                mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Inserir número " + l + "x" + c));

                c++;
            }
            l++;
        }

    }

    private static void listar(int[][] mat) {
        int max;
        int num;
        int cont = 0; // conta quantas x , encontrou um determinado número no pesquisar
        int p = 0;  // 
        int a = 0; // conta o quantidade  de números diferentes
        max = (mat.length) * (mat[1].length);

        int vec1[] = new int[max];  // vetor dos número
        int vec2[] = new int[max];  // vetor da frequencia

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {
                p = 0;
                num = mat[i][j];

                cont = pesquisar(mat, num);
                for (int k = 0; k <=a; k++){
                    if (num == vec1[k]) {
                        p = 1;
                    }
                }
                    if (p == 0) {
                        vec1[a] = num;
                        vec2[a] = cont;
                        a++;
                        
                    }
                }

            }

        
        String linha1="Matriz    : ";
        String linha2="Repetições: ";
        
        for (int i = 0; i < a; i++) {
            linha1=linha1+vec1[i]+ " ";
            linha2=linha2+vec2[i]+ " ";
            
        }
        System.out.println(linha1);
        System.out.println(linha2);
        
        

    }

    private static int pesquisar(int[][] mat, int num) {
        int cont = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                if (num == mat[i][j]) {
                    cont++;
                }

            }
        }

        return cont;
    }

    private static void mostrar(int[][] mat) {
       
        System.out.println("\nMatriz: ");
        
        for (int i = 0; i < mat.length; i++) {
            String linha="";
            for (int j = 0; j < mat[i].length; j++) {
                
                linha=linha+mat[i][j]+ " ";
            }
            System.out.println(linha);
        }
        
    }
}
