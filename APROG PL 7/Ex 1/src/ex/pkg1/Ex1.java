package ex.pkg1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        int i, s = 0, c = 0;
        int[] v = new int[10];
        Scanner ler = new Scanner(System.in);

        for (i = 0; i < v.length; i++) {
            v[i] = ler.nextInt();
        }
        for (i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                s = s + v[i];
                c++;
            }
        }
        if (c != 0) {
            System.out.println(((double) s) / c);
        } else {
            System.out.println("Operação impossível de realizar");
        }
        
        
        int menor= metodo(v);
        
        System.out.println("O menor número do vetor é: " + v );
        
        for (int j = 0; j < 10; j++) {
            
            if (v[j]==menor){
                
                System.out.println("A posição " +j + " inclui o menor dos números");
            }
            
            
        }
        
    }
    public static int metodo(int[]v){
        int x=v[0];
        
        for (int i = 0; i < v.length; i++) {
            
            
            if(x>v[i]){
                x=v[i];
                
            }
            
        }
        
        
        return x;
    }
    
    
    
    
}
