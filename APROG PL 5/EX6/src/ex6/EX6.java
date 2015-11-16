
package ex6;

import javax.swing.JOptionPane;


public class EX6 {

    public static void main(String[] args) {
       int apares, bpares,num;
       
       apares=0;
       bpares=0;
       do{
           
          num=Integer.parseInt(JOptionPane.showInputDialog("Sequência 1 \n"
                  + "Inserir número \n \n" 
                  + "Nota: Para sair insira o valor 0 (zero)"));
          if(num%2==0){
              apares++;
          }
           
       }while(num!=0);
        
        do{
           
          num=Integer.parseInt(JOptionPane.showInputDialog("Sequência 2 \n"
                  + "Inserir número \n \n"
                  + "Nota: Para sair insira o valor 1 (menos 1)"));
          if(num%2==0){
              bpares++;
          }
           
       }while(num!=-1);
        
        if(apares==bpares){
            JOptionPane.showMessageDialog(null, "As duas sequências de númeos têm a mesma"
                    + " quantidade de números pares");
        }else{
            if(apares>bpares){
                JOptionPane.showMessageDialog(null, "A primeira sequência de números tem "
                        + "mais quantidade de números pares");
            }else{
                JOptionPane.showMessageDialog(null, "A segunda sequência de números tem"
                        + "maior quantidade de números pares");
            }
        }
            
        
        
        
        
        
        
        
        
        
    }
    
}
