package Searching.Binary_Search;

import java.util.Arrays;

public class SearchInRowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        int k = 39;
        int[] ans = search(arr,k);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int k){
        int r=0;
        int c = arr.length-1;
        while(c>=0 && r<arr.length){
            int s = arr[r][c];
            if(k==s){
                return new int[]{r,c};
            }else if(k<s){
                c--;
            }else{
                r++;
            }
        }


        return new int[]{-1,-1};

    }
    
}
