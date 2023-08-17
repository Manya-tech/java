package Recursion;

import java.util.Scanner;

public class Exponential {

    public static int exp(int x,int n){
        if (n==0){
            return 1;
        }
        else if(n%2==0){
            int y = exp(x,n/2);
            return y*y;
        }
        else{
            return x*exp(x,n-1);
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int res = exp(x,n);
        System.out.println(res); 
    }
    
}
