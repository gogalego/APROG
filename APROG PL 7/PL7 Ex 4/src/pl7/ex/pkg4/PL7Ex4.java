package pl7.ex.pkg4;

import javax.swing.JOptionPane;

public class PL7Ex4 {

    public static void main(String[] args) {
        int n;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Qual é o tamanho do vetor pretendido?"));
        } while (n == 0);

        int v[] = new int[n];

        int op = 0;
        do {

            op = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir Números no vetor \n"
                    + "2 - Inversão da ordem do vetor\n"
                    + "3 - Apresentação do vetor invertido\n"
                    + "4 - Rotação do vetor \n"
                    + "5 - Apresentação do vetor rodado \n"
                    + "6 - Listar \n"
                    + "0 - Sair"));

            switch (op) {

                case 1:

                    inserir(v, n);
                    break;

                case 2:
                    inversao(v, n);
                    break;
                case 3:
                    linversao(v, n);
                    break;
                case 4:
                    rotaçao(v,n);
                    
                    break;
                case 5:
                    lrotação(v,n);
                    
                    break;
                case 6:
                    listar(v,n);
                    break;

                case 0:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Número Inválido");

            }

        } while (op != 0);

    }

    public static void inserir(int v[], int n) {
        int pos;

        for (int i = 0; i < n; i++) {
            pos = i + 1;

            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Número " + pos));

        }

    }

    public static void inversao(int v[], int n) {
        int pos = n - 1;

        int iv[] = new int[n];

        for (int i = 0; i < n; i++) {

            iv[i] = v[i];

        }

        for (int i = 0; i < 10; i++) {

            v[i] = iv[pos - i];

        }

    }

    public static void linversao(int v[], int n) {
        int pos = n - 1;

        System.out.println("Vetor invertido");
        for (int i = pos; i >= 0; i--) {

            System.out.println(v[i]);

        }

    }

    private static void rotaçao(int[] v, int n) {
        int pos = n - 1;
        int r[] = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = v[i];
        }
         
         
         for (int i = 1; i <=pos; i++) {
            v[i]=r[i-1];
            
        }
         v[0]=r[pos];
         
    }

    private static void lrotação(int[] v, int n) {
        int pos=n-1;
        int r[] = new int[n];
        for (int i = 0; i <n; i++) {
            r[i] = v[i];
        }
        int aux=r[pos];
        System.out.println("Vetor com rotação para a direita");
        System.out.println(r[pos]);
        for (int i = 0; i <pos; i++) {
           
            
            
            System.out.println(v[i]);
        }
        
        
    }

    private static void listar(int[] v, int n) {
        
        
        System.out.println("Lista :");
        for (int i = 0; i < n; i++) {
            
            System.out.println(v[i]);
            
            
            
        }
        
        
    }
    
}
