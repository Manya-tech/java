package Recursion;

import java.util.Scanner;

public class Factorial {

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int res = fact(n);
        System.out.println(res); 
    }
}
