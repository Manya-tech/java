package BasicsOfJava;

import java.util.Scanner;
import java.lang.Math;

public class DecimalToAnyBase {

    public static int dtab(int n, int b){
        int res = 0;
        int p = 0;
        while (n!=0){
            int r = n%b;
            n=n/b;
            int num = (int)Math.pow(10,p);
            res = res + r*num;
            p++;
        }
        return res;
    }
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int b = scn.nextInt();
        int r = dtab(n,b);
        System.out.println(r);
    }
}
