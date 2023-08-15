package BasicsOfJava;

import java.util.Scanner;

public class AnyBaseMultiplication {

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
public static int pwd(int b, int y, int d){
    int temp = y;
    int rev=0;
    int p=1;int c=0;
     while(temp!=0||c>0){
                int u = temp%10;
                temp/=10;
                int mul = u*d+c;
                c=mul/b;
                int val = mul%b;
                rev=rev+val*p;
                p*=10;
            }
            return rev;
            
        }


    public static int abm(int b,int x, int y){
        int res=0;
        int p=1;
        while(y!=0){
            int d = y%10;
            y=y/10;
            int prod = pwd(b,x,d);
            res = aba(b,res,prod*p);
            p=p*10;
        }
        return res;
    }

    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    int r = abm(b,n1,n2);
    System.out.println(r);
    }
    
    
}
