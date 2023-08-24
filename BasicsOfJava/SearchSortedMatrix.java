package BasicsOfJava;

import java.util.Arrays;

public class SearchSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 9)));
    }

    // search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious, matrix may be empty
        if (cols == 0){
            return new int[] {-1,-1};
        }
        if (rows == 1) {
            return binarySearch(matrix,0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }

    // a method by me
    // static int[] searchsa(int[][] arr, int k){

    //     int r = 0;
    //     int c=arr.length-1;
    //     while(r<arr.length && c>=0){
    //         int s = arr[r][c];
    //         if(k==s){
    //             return new int[]{r,c};
    //         }else if(k>s){
    //             r++;
    //         }else{
    //             c--;
    //         }
        
    //     }
    //     return new int[] {-1,-1};
    // }
    

    // another method by me
    // static int[] search(int[][] arr, int k){
    //     int re=arr.length-1;
    //     int rs=0;
    //     int c = arr[0].length-1;
    //     int[] res = {-1,-1};
    //     int rm=0;
    //     while(c>=0 && rs<=re){
    //         rm=rs+(re-rs)/2;
    //         int s = arr[rm][c];
    //         if(k==s){
    //             return new int[]{rm,c};
    //         }else if(k>s){
    //             rs=rm+1;
    //         }else if(k<s && k>=arr[rm][0]){
    //             break;
    //         }else{
    //             re=rm-1;
    //         }
    //     }

    //     res = bins(arr,k, rm);

    //     return res;


    // }

    // static int[] bins(int[][]arr, int k, int r){
    //     int cs=0;
    //     int ce= arr[0].length-1;

    //     while(cs<=ce){
    //         int m = cs+(ce-cs)/2;
    //         if(k==arr[r][m]){
    //             return new int[]{r,m};
    //         }else if(k<arr[r][m]){
    //             ce=m-1;
    //         }else{
    //             cs=m+1;
    //         }
    //     }
    //     return new int[]{-1,-1};
    // }
}
