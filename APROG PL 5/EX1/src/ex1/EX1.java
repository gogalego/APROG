
package ex1;

import javax.swing.JOptionPane;


public class EX1 {

    public static void main(String[] args) {
        int soma, num, x, n, per;
        double média, cont;
        
        soma=0;
        cont=0;
        
        n= Integer.parseInt(JOptionPane.showInputDialog("Qual é quantidade de números a adicionar"));
        
        for(x=1;x<=n;x++){
            num= Integer.parseInt(JOptionPane.showInputDialog("Inserir número"));
            
            if (num%2==0){
            cont++;
            soma=soma+num;
            }
        }
        
        if(cont!=0){
            média=soma/cont;
           JOptionPane.showMessageDialog(null,"A média calculada é: " + média + "e a percentagem de algarismos pares é: " + 
                   (cont/n)*100 + "%");
        }else{
            JOptionPane.showMessageDialog(null, "A média não existe pois nao foram inseridos valores pares");
        }
        
        
        
        
        
        
            
        
        
        
        
        
        
    }
    
}
