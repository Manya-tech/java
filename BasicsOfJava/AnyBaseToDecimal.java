package BasicsOfJava;

import java.util.Scanner;

public class AnyBaseToDecimal {

    public static int abtod(int n, int b){
        int res = 0;
        int p = 0;
        while(n!=0){
            int r = n%10;
            n = n/10;
            res = res + r*(int)Math.pow(b,p);
            p++;
        }
        return res;
    }
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int r = abtod(n,b);
    System.out.println(r);
    }    
}
