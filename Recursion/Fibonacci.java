package Recursion;

import java.util.Scanner;

public class Fibonacci {

    public static int[] fib = new int[100];

    public static int fibi(int n){
        int a=0;
        int b=1;
        int c=0;
        for(int i =2; i<=n; i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }

    public static int fibr(int n){
        if(n<=1){
            fib[n]=n;
            return fib[n];
        }
        else if(fib[n]!=-1){
            return fib[n];
            
        }
        fib[n]= fibr(n-1)+fibr(n-2);
        
        return fib[n];
    }

        public static void main(String[] args){

            for (int i=0; i<100; i++){
                fib[i]=-1;
            }

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int res = fibr(n);
        System.out.println(res); 
        scn.close();
    }
    
}
