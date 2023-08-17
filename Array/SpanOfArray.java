package Array;

import java.util.Scanner;

public class SpanOfArray {
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
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        for (int i=0; i<arr.length; i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.print(max-min);

    }
    
}
