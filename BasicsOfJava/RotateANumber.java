package BasicsOfJava;

import java.util.Scanner;

public class RotateANumber {

    public static void main(String[] args) {
    
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();                                                    

        int d = 0;
        int temp = n;

        while (temp!=0) {
        d+=1;
        temp = temp/10; } 
        
    if (k>0 & k<d ){
        
        int t = n;
        
        for (int i=0; i<k; i++){
            t=t/10;
        }  
        int t2 =n ;
       int  s = d-k;
        int div = (int)Math.pow(10,d-1);
        for (int i=0; i<s; i++){
            t2 = t2%div;
            div=div/10;
        }
        for (int i=0; i<k; i++){
            int q = t2/div;
            System.out.print(q);
            t2 = t2%div;
            div=div/10;}
            
        div = (int)Math.pow(10,s-1);
        for (int i=0; i<s; i++){
            int q=t/div;
            System.out.print(q);
            t=t%div;
            div=div/10;
            

        }
    }

    else if (k<0 & k<d){
        int t = n;
        int s = d-k;
        for (int i=0; i<s; i++){
            t=t/10;
        } 
        System.out.println(t);

    }

    
}
}