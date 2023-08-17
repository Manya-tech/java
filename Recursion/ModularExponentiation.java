package Recursion;

import java.util.Scanner;

public class ModularExponentiation {

    public static int mexp(int x,int n, int m){
        if (n==0){
            return 1;
        }
        else if(n%2==0){
            int y = mexp(x,n/2,m)%m;
            return (y*y)%m;
        }
        else{
            return ((x%m)*mexp(x,n-1,m))%m;
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int m = scn.nextInt();
        int res = mexp(x,n,m);
        System.out.println(res); 
    }
    
}
