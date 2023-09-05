package Array;

import java.util.Arrays;
import java.util.Scanner;


public class MutabilityInArray {

     public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
    
        change(arr);
        System.out.print(Arrays.toString(arr));
        scn.close();
     }

     static void change(int[] a){
        a[2]=2;
     }
}
