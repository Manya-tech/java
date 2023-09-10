package Recursion;

import java.util.Scanner;

public class Exponential {

    public static int exp(int x,int n){
        if (n==0){
            return 1;
        }
       
        int half = exp(x,n/2);
        int res = half*half;
        if(n%2!=0){
            res*=x;
        }

        return res;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int res = exp(x,n);
        System.out.println(res); 
    }
    
}
