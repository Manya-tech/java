package BasicsOfJava;

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int sp = 1;
        for (int i=2; i<=n-1; i++){
            sp+=2;
        }
        System.out.println(sp);
        
        for (int i=1; i<=n; i++){
            int val = 1;
            
            for (int j=1; j<=i; j++){
                System.out.print(val);
                val++;
            }
            for (int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            sp-=2;
            if (i==n){
                val--;
                for (int j=1; j<i; j++){
                    val--;
                    System.out.print(val);
                    
                }
            }
            else{
            for (int j=1; j<=i; j++){
                val--;
                System.out.print(val);
            } }    
    System.out.println();
        }

    }
    
}
