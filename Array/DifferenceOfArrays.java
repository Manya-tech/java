package Array;

import java.util.Scanner;

public class DifferenceOfArrays {

        public static void main(String[] args){
    
        Scanner scn = new Scanner(System.in);
        System.out.print("enter n ");
        int n = scn.nextInt();
        int[] a1 = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Enter element:");
            a1[i] = scn.nextInt();
        }

        System.out.print("enter n ");
        int m = scn.nextInt();
        int[] a2 = new int[m];
        for (int i=0; i<m; i++){
            System.out.print("Enter element:");
            a2[i] = scn.nextInt();
        }

        int[] diff = new int[m];
        int c=0;
        int i=n-1;
        int j=m-1;
        int k=m-1;

        while(k>=0){
            a2[j]=c+a2[j];
            int a1v = i>=0?a1[i]:0;
                if(a2[j]<a1v){
                a2[j]+=10;
                a2[j] = a2[j]-a1v;
                c=-1;
            }
            else{
                a2[j] = a2[j]-a1v;        
                c=0;        
            }
            diff[k]=a2[j];
            k--; i--; j--;

        }

        for (int x=0; x<m; x++){
            if (diff[x]==0){
                continue;
            }
            else{System.out.println(diff[x]);}
        }
    
    }
}
