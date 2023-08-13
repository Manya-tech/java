package BasicsOfJava;

import java.util.Scanner;

public class rotateANumberII {

    public static void main(String[] args){
    
        Scanner scn = new Scanner(System.in);
        System.out.print("enter n ");
        int n = scn.nextInt();
        

        int temp = n;
        int d = 0;
        while(temp!=0){
            d++;
            temp = temp/10;
        }

        int c = 1;
        while(c==1){
            System.out.print("GO on? ");
            c = scn.nextInt();
            System.out.print("enter k ");
            int k = scn.nextInt();  
        if (k<d){

            if (k>0){
                int div = (int)Math.pow(10,k);
                int q = n/div;
                int r = n%div;
                r = r*((int)Math.pow(10,d-k));
                r=r+q;
                System.out.println(r);
            }

            else{
                int div = (int)Math.pow(10,d+k);
                int q = n/div;
                int r = n%div;
                r = r*((int)Math.pow(10,-1*k));
                r=r+q;
                System.out.println(r);
            }
        }

        else{
            
             if (k>0){
                k = k-d;
                int div = (int)Math.pow(10,k);
                int q = n/div;
                int r = n%div;
                r = r*((int)Math.pow(10,d-k));
                r=r+q;
                System.out.println(r);
            }

        }

    }
}
    
}
