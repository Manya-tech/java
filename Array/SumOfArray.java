package Array;

import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args){
    
        Scanner scn = new Scanner(System.in);
        System.out.print("enter n ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Enter element:");
            arr[i] = scn.nextInt();
        }

        System.out.print("enter n ");
        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for (int i=0; i<m; i++){
            System.out.print("Enter element:");
            arr2[i] = scn.nextInt();
        }

        int[] sum = new int[n>m?n:m];
        int c=0;
        int i = sum.length-1;
        int j=arr.length-1;
        int k=arr2.length-1;
        while(i>=0){
            int d = c;

            if(j>=0){
                d+=arr[j];
            }

            if (k>=0){
                d+=arr2[k];
                        }
            c = d/10;
            sum[i]=d%10;
            k--;
            i--;
            j--;
        }   

        if (c!=0){
            System.out.println(c);         }

        for (int x=0; x<=sum.length; x++){
            System.out.println(sum[x]);
        }
       
    }
    
}
