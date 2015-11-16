package ex2;

import java.util.Scanner;

public class EX2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String disciplina;

        do {

            System.out.println("Escreva uma disciplina \n s para sair");
            disciplina = input.nextLine();

            metodo(disciplina);
        } while("s".equals(disciplina));

    }

    public static void metodo(String disciplina) {
        int n,p;
        
      

        Scanner input = new Scanner(System.in);
        System.out.println("Escreva o número de positivass");
        p=input.nextInt();
        System.out.println("Escreva o número de negativas");
        n=input.nextInt();
        
        
            
            System.out.println("Disciplina: " + disciplina);
            System.out.print("- Positivas:");
            
            for (int j = 0; j <p; j++) {
                System.out.print("*");
              
            }
            
            System.out.println("");
            System.out.print("- Negativas");
            
            for (int i = 0; i < n; i++) {
                
                System.out.print("*");
            
        }
            
            System.out.println("\n");
            
        
    }

}
