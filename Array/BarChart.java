package Array;

import java.util.Scanner;

public class BarChart {

    public static void main(String[] args){
    
        Scanner scn = new Scanner(System.in);
        System.out.print("enter n ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Enter element:");
            arr[i] = scn.nextInt();
        }

        int max=arr[0];
        for (int i=0;i<arr.length; i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }

        for (int i=max; i>=1; i--){
            for (int j =0; j<arr.length; j++){
                if (arr[j]<i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
            
        }

        scn.close();
    
        
    }

    
}
