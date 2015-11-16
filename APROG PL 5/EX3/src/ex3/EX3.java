package ex3;

import javax.swing.JOptionPane;

public class EX3 {

    public static void main(String[] args) {
        String nome;
        int idade;
        double perc, total, maiores;

        total = 0;
        maiores = 0;
        perc = 0;

        nome = JOptionPane.showInputDialog("Inserir Nome");
        while (!(nome.equals("zzz"))) {
            do {
                idade = Integer.parseInt(JOptionPane.showInputDialog("Inserir Idade"));
            } while (idade <= 0);

            total = total + 1;
            if (idade >= 18) {
                maiores = maiores + 1;
            }

            System.out.println("Nome:" + nome + " " + idade + "anos");
            nome = JOptionPane.showInputDialog("Inserir Nome");
        }
        perc = (maiores / total) * 100;

        JOptionPane.showMessageDialog(null, "A percentagem de pessoas maior de idade é " + perc+"%" );

    }

}
