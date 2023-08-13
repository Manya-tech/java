package BasicsOfJava;

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int i = 1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if (j==i || j==n-i+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    

    }
    
}
