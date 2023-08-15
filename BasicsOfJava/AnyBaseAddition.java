package BasicsOfJava;

import java.util.Scanner;

public class AnyBaseAddition {

    public static int aba(int b, int n1, int n2){
        int c = 0;
        int res = 0;
        int p = 1;
        while (n1!=0 || n2!=0 || c>0){
            int x = n1%10;
            int y = n2%10;
            n1 = n1/10;
            n2=n2/10;
            int d = x+y+c;
            c=d/b;
            d=d%b;
            res = res+d*p;
            p=p*10;

        }

        return res;
    }

    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    int r = aba(b,n1,n2);
    System.out.println(r);
    }
    
}
