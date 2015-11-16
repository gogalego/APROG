package ex.pkg4;


import java.util.Scanner;
public class Ex4 {
    
    private static long factorial(long num){
        long fact=1;
        for (long i=num; i>1;i=i-1){
            fact=fact*i;
        }
        return fact;
    }
    
    public static long combinacoes(long n, long p){
        if(n<p)
        return -1;
        return factorial(n)/(factorial(p)*factorial(n-p));
    }
    
    public static void main(String[] args){

        long n1,n2,res;
        Scanner in = new Scanner(System.in);
        System.out.print("Escreva n: ");
        n1= in.nextLong();
        System.out.print("Escreva p: ");
        n2= in.nextLong();
        res=combinacoes(n1,n2);
        if(res !=-1){
            System.out.println("O resultado é " + res);
        }else{
            System.out.println("Erro!");
        }
    }
}