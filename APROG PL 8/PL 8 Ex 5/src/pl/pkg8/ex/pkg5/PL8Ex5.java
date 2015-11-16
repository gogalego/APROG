
package pl.pkg8.ex.pkg5;

import javax.swing.JOptionPane;

public class PL8Ex5 {

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
        
        int mat1[][]=new int [n_li][n_co]; // matriz original   
        int mat2[][]=new int [n_li][n_co]; // matriz das somas de cada posição do E
        
        boolean passar=false;
        
        int op=0;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("1- Inserir números na Matriz \n"
                    + "2- Apresentar\n"
                    + "0- Sair"));
            
            switch (op){
                case 1:
                    passar=inserir(mat1);
                    
                    break;
                    
                case 2:
                    if(passar==true){
                    int soma_Max=csoma(mat1,mat2);
                    pesquisar(mat2,soma_Max);}
                    else{
                        JOptionPane.showMessageDialog(null, "Necessita de preencher primeiro o vetor!!");
                    }
                    break;
                    
                case 0:
                break;
                
            }
            
        }while(op!=0);
        
        
    }

    private static boolean inserir(int[][] mat1) {
       int num;
       int c;
       int l=1;
       
       
        for (int i = 0; i < mat1.length; i++) {
            c=1;
            for (int j = 0; j < mat1[i].length; j++) {
                
                mat1[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Número "+l+"x"+c));
                
                
              c++;  
            }
            l++;
        }
        
       
         return true;       
    }

    private static int csoma(int[][] mat1, int[][] mat2) {
        int soma_Max=0;   // soma máxima
        int soma_Total=0;  // soma da matriz  toda
        int soma=0;  // soma para cada um
        int c=0;   //colunas
        int l=0;   //linhas
        
        
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                
                soma_Total=soma_Total+mat1[i][j];
                     
            }
             
        }
        
       
        
        do{
            
            soma=0;
            
            // linhas
            for (int i = 0; i < mat1.length; i++) {
                
              soma=soma+mat1[i][c];
                
                
            }
            //colunas
            for (int i = 0; i < mat1[0].length; i++) {
                soma=soma+mat1[l][i];
            }
            soma=soma+mat1[l][c];
            int soma1=soma_Total-soma;
            
            mat2[l][c]=soma1;
            
            if (soma1>soma_Max) {
                 soma_Max=soma;
            }
            
            c++;
            l++;
            
        }while(c!=mat1[0].length && l!=mat1.length);
        
           
        return soma_Max;
    }

    private static void pesquisar(int[][] mat2, int soma_Max) {
        int c=1;
        int l=1;
        
        System.out.println("Posições das somas máximas("+soma_Max+"):");
        
        for (int i = 0; i < mat2.length; i++) {
            c=1;
            for (int j = 0; j < mat2[i].length; j++) {
                
                
                if (soma_Max==mat2[i][j]) {
                    
                    System.out.println("- "+l+"x"+c);
                    
                }
                c++;
            }
            l++;
        }
        
        
        
        
        
        
        
    }
    
}
