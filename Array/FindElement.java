package Array;

import java.util.Scanner;

public class FindElement {

    public static void main(String[] args){
    
        Scanner scn = new Scanner(System.in);
        System.out.print("enter n ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Enter element:");
            arr[i] = scn.nextInt();
        }
        
        System.out.print("Enter element to be searched:");
        int s = scn.nextInt();

        for (int i = 0; i<arr.length; i++){
            if (arr[i]==s){
                System.out.print(i);
                break;
            }
        }
    }    
}
