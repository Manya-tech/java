package BasicsOfJava;

import java.util.Scanner;

public class AnyBaseToAnyBase {

    public static int abtab(int n, int b1, int b2){
        int res = 0;
        int p = 0;
        while(n!=0){
            int r = n%b2;
            n = n/b2;
            res = res + r*(int)Math.pow(b1,p);
            p++;
        }
        return res;
    }

    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int b2 = scn.nextInt();
    int r = abtab(n,b,b2);
    System.out.println(r);
    }
    
}
