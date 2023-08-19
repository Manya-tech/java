package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {

    public static void main(String[] args){

        int[][] a = {{1,2,3,4},{5,6},{7,8,9}};
        Scanner scn = new Scanner(System.in);

        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                a[i][j]=scn.nextInt();
            }
        }

        // for (int i=0; i<a.length; i++){
        //     System.out.println(Arrays.toString(a[i]));
        // }

        for (int[] e:a){
            System.out.println(Arrays.toString(e));
        }


    }
    
}
