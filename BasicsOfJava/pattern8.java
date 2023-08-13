package BasicsOfJava;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int i=0; i<n; i++){
            for (int j =1; j<n-i; j++){
                System.out.print(" ");

            }
            System.out.print("*\n");
        }

    }
    
}
