package ex.pkg3;

import java.util.Scanner;


public class Ex3 {
    
    
       public static double angint (double a, double b, double c) {
        
       double ang = Math.acos((Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,2))/(2*a*b));
        
       return Math.toDegrees(ang);         
                
         }
         
      public static void main (String [] args){
        
        Scanner ler = new Scanner (System.in);
        double a,b,c;
        
        System.out.println ("Insira o lado A do triângulo");
        a = ler.nextDouble();
        
        System.out.println ("Insira o lado B do triângulo");
        b = ler.nextDouble();
        
        System.out.println ("Insira o lado C do triângulo");
        c = ler.nextDouble();
        
        if (a>0 && b>0 && c>0 && (a<b+c) && (b<c+a) && (c<b+a)){
            
             System.out.println ("Ângulo AB:" + angint(a,b,c));
             System.out.println ("Ângulo AC:" + angint(a,c,b));
             System.out.println ("Ângulo BC:" + angint(b,c,a));

         } else {
            System.out.println("Os lados fornecidos não formam um triângulo.");
        }
        
      
        
}
}