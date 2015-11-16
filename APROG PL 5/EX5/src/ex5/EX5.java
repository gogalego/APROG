
package ex5;

import javax.swing.JOptionPane;


public class EX5 {

    
    public static void main(String[] args) {
        int num, d, aux, res;
        res=0;
        aux=1;
        
        num=Integer.parseInt(JOptionPane.showInputDialog("Inserir número"));
        
        while (num!=0){
            d=num%10;
            if(d%2==1){
             res=res+d*aux;
             aux=aux*10;
            }
            num=num/10;
            
        }
        JOptionPane.showMessageDialog(null,"O resultado é: "+ res);
        
        
        
        
        
        
        
        
        
        
    }
    
}
