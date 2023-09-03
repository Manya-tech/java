package Recursion;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Scanner scn = new Scanner(System.in);
        int k=scn.nextInt();
        int res = bs(arr,0,arr.length, k);
        System.out.print(res);
        scn.close();
     }
    
     static int bs(int[] a, int s,int e, int k){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;

        if(k==a[m]){
            return m;
        }
        else if(k<a[m]){
            e=m-1;
        }
        else{
            s=m+1;
        }
        return bs(a,s,e,k);

     }
     
}
