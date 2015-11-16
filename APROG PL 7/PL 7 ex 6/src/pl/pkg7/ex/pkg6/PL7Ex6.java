aspackage pl.pkg7.ex.pkg6;

import javax.swing.JOptionPane;

public class PL7Ex6 {

    public static void main(String[] args) {
        String visi[] = new String[100];
        int op = 0;
        int n_visi = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("1- Inserir Visitante\n"
                    + "2- Listar todos os visitantes \n"
                    + "3- Atualizar nome de visitante \n"
                    + "4- Eliminar visitante da lista \n"
                    + "5- Listar nomes começados por uma letra \n"
                    + "6- Listar nomes repetidos\n"
                    + "0- Sair"));

            switch (op) {
                case 1:
                    n_visi = inserir(visi, n_visi);
                    break;
                case 2:
                    listar(visi, n_visi);
                    break;
                case 3:
                    atualizar(visi, n_visi);
                    break;
                case 4:
                    n_visi = eliminar(visi, n_visi);
                    break;
                case 5:
                    listar_l(visi, n_visi);
                    break;
                case 6:
                    listar_r(visi, n_visi);
                    break;
                case 0:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Número inválido");
            }

        } while (op != 0);

    }

    private static int inserir(String[] visi, int n_visi) {
        String nome;
        int pos = n_visi + 1;
        JOptionPane.showMessageDialog(null, "Inserir Nome de visitante \n"
                + "Utilize a palavra FIM para parar");
        nome = JOptionPane.showInputDialog("Visitante número: " + pos);
        nome = nome.trim();
        if (!(nome.equalsIgnoreCase("FIM"))) {
            do {

                nome = nome.trim();
                visi[n_visi] = nome;
                n_visi++;
                pos++;
                nome = JOptionPane.showInputDialog("Visitante número: " + pos);
            } while (!(nome.equalsIgnoreCase("FIM")));
        }

        return n_visi;

    }

    private static void listar(String[] visi, int n_visi) {

        if (n_visi != 0) {
            System.out.println("Lista de Visitantes:");
            for (int i = 0; i < n_visi; i++) {

                System.out.println("- " + visi[i]);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ainda não inseriu visitantes");
        }

    }

    private static void atualizar(String[] visi, int n_visi) {
        String nome;
        int pos;
        int a;

        if (n_visi != 0) {
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Pretende ver a lista de Visitantes?\n"
                    + "Sim - > 0\n"
                    + "Não - > Qualquer número"));
            if (a == 0) {
                System.out.println("Lista de Visitantes:");
            }
            for (int i = 0; i < n_visi; i++) {

                System.out.println("- " + visi[i]);

            }

        } else {
            JOptionPane.showMessageDialog(null, "Ainda não inseriu visitantes");
        }

        nome = JOptionPane.showInputDialog(null, "Qual é nome que pretende atualizar?");
        if (n_visi != 0) {
            for (int j = 0; j < n_visi; j++) {
                if (nome.equalsIgnoreCase(visi[j])) {
                    visi[j] = JOptionPane.showInputDialog("Para qual nome pretende alterar?");

                }

            }

        }

    }

    private static int eliminar(String[] visi, int n_visi) {
        String nome;
        String aux;
        int pos;
        int a;

        if (n_visi != 0) {
            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Pretende ver a lista de Visitantes?\n"
                    + "Sim - > 0\n"
                    + "Não - > Qualquer número"));
            if (a == 0) {
                System.out.println("Lista de Visitantes:");
            }
            for (int i = 0; i < n_visi; i++) {

                System.out.println("- " + visi[i]);

            }
            nome = JOptionPane.showInputDialog(null, "Qual é nome que pretende eliminar da lista?");

            for (int i = 0; i < n_visi; i++) {

                if (nome.equalsIgnoreCase(visi[i])) {
                    for (int j = (i + 1); j < n_visi; j++) {
                        visi[i] = visi[j];
                    }
                    n_visi--;
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ainda não inseriu visitantes");
        }

        return n_visi;
    }

    private static void listar_l(String[] visi, int n_visi) {
        String letra;
        String apresentar = "Lista: \n";

        if (n_visi != 0) {

            letra = JOptionPane.showInputDialog("Qual é a letra?");
            if (letra.length() == 1) {
                for (int i = 0; i < n_visi; i++) {

                    if (("" + visi[i].charAt(0)).equals(letra)) {

                        apresentar = apresentar + visi[i] + "\n";
                    }

                }

                System.out.println(apresentar);
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao inserir a letra");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ainda não inseriu visitantes");
        }

    }

    private static void listar_r(String[] visi, int n_visi) {
        String repetidos = "Lista : \n";
        String nome;
        

        for (int i = 0; i < n_visi; i++) {
            nome = visi[i];
            for (int j = i + 1; j < n_visi; j++) {
                if (nome.equals(visi[j])) {
                    repetidos = repetidos + nome + "\n";
                    
                }

            }

        }
        System.out.println(repetidos);

    }
}
