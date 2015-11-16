package pl7.ex5;

import javax.swing.JOptionPane;

public class PL7Ex5 {

    public static void main(String[] args) {
        String nomes[] = new String[100];
        String v2[] = new String[100];
        double perc = 0;
        int v_2 = 0;
        int n = 0;
        int pos = 0;
        do {
            pos = Integer.parseInt(JOptionPane.showInputDialog("1- Mostrar Apelido de um Nome\n"
                    + "2- Inserir nomes para vetor\n"
                    + "3- Listar todos os nomes \n"
                    + "4- Preencher vetor com os nomes começados por S\n"
                    + "5- Percentagem Apelidos começados por S \n"
                    + "0- Sair"));

            switch (pos) {

                case 1:
                    mostrarapelido();
                    break;
                case 2:
                    n = inserir(nomes, n);
                    break;
                case 3:
                    listar(nomes, n);
                    break;

                case 4:

                    perc = listarS(nomes, n, v2, v_2);
                    break;
                case 5:
                    perc = listarS(nomes, n, v2, v_2);
                    if(n!=0){
                       listagem(perc,n); 
                    }
                   
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Número Inválido");
                    
            }

        } while (pos != 0);

    }

    private static int inserir(String[] nomes, int n) {
        String nome;
        int a = n;
        int pos = n + 1;
        JOptionPane.showMessageDialog(null, "Inserir nomes completos \n"
                + "Utilize a palabra FIM para terminar");
        if (a < 100) {

            do {
                nome = JOptionPane.showInputDialog("Nome nº" + pos);
                if (!(nome.equalsIgnoreCase("FIM"))) {
                    nomes[a] = nome.trim();
                    a++;
                    pos++;
                }

            } while (!(nome.equalsIgnoreCase("FIM")) && a < 100);

        }
        return a;
    }

    private static double listarS(String[] nomes, int n, String[] v2, int v_2) {
        String nome;
        int bingo=1;

        int a = 0; // contador para verificar todos os nomes
        int qt = 0; // quantidade de apelidos com "S"
        int pos; //posição do S do apelido

        if (n != 0) {

            for (int i = 0; i < n; i++) {
                nome = nomes[i];

                pos = nome.lastIndexOf(' ');
                pos++;
                if (("" + nome.charAt(pos)).equalsIgnoreCase("S")) {

                    v2[v_2] = nome;
                    v_2++;

                }

            }

            if (v_2 == 0) {
                JOptionPane.showMessageDialog(null, "Não inseriu nenhum nome com apelido começado\n"
                        + "pela letra S");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ainda não inseriu nomes");
            bingo=0;
        }
        double percentagem = 0;
        double CF = v_2 ;
        double CP = n + 1;

        percentagem = (CF / CP) * 100;
        return percentagem;

    }

    private static void mostrarapelido() {
        String nome;
        String apelido = "";
        int tamanho;
        nome = JOptionPane.showInputDialog("Inserir Nome");
        nome = nome.trim();
        tamanho = nome.length();
        if (tamanho != 0) {
            for (int i = 0; i < tamanho; i++) {

                int pos = nome.lastIndexOf(' ');
                apelido = nome.substring(pos);

            }
            System.out.println("0 apelido do nome " + nome + " é :\n " + apelido);
        }

    }

    private static void listar(String[] nomes, int n) {
        System.out.println("Nomes: ");
        for (int i = 0; i < n; i++) {

            System.out.println("* " + nomes[i]);
        }

    }

    private static void listagem(double perc, int n) {
        
        System.out.println("A percentagem de nomes que têm \n"
                + "apelido começado por S é: "+perc+ "%.");
        
        
    }

    

   
}
