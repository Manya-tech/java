package Searching.Linear_Search;

import java.util.Arrays;

public class SearchIn2DArrays {

    public static void main(String[] args) {
        int[][] arr = {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,102}
        };

        int k=1;
        int [] ans=lins(arr,k);
        System.out.println(Arrays.toString(ans));
        System.out.println(maxval(arr));
        String s = 1764+" ";
        System.out.println(Arrays.toString(s.toCharArray()));
        
    }

    static int[] lins(int[][] arr, int k){
        if (arr.length==0){
            return new int[]{-1,-1};
        }

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if (arr[i][j]==k){
                    return new int[]{i,j};
                }  //array was not declared so initialised it like this
            }
        }
        return new int[]{-1,-1};
    }

    static int maxval(int[][] arr){
        int max=arr[0][0];
        for (int [] iarr: arr){
            for (int val: iarr){
                if (max<val){
                    max=val;
                }  //array was not declared so initialised it like this
            }
        }
        return max;

    }
    
}
