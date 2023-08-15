package BasicsOfJava;

import java.util.Scanner;

public class AnyBaseSubtraction {

    public static int anbs(int b, int n1, int n2){
        int res = 0;
        int c = 0;
        int p=1;
        while (n1!=0){
            int x = n1%10;
            int y = n2%10;
            n1 = n1/10;
            n2 = n2/10;
            x=x+c;
            if(x<y){
                x=x+b;
                c=-1;
            } 
            res = res+(x-y)*p;
            p*=10;
        }
        return res;
    }

     public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    int r = anbs(b,n1,n2);
    System.out.println(r);
    }
    
    
}
