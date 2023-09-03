package Recursion.Backtracking;

import java.util.Arrays;

// import java.util.Arrays;

public class AllDirWithLevel {

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = 0;
            }
        }
        allPath(arr,"",0,0,1);
    }

    static void allPath(int[][] arr,String p, int r, int c, int l){
        
        if(r==arr.length-1 && c==arr[0].length-1){
            System.out.println(p);
            arr[2][2] = l;
            for (int[] row : arr){
            System.out.println(Arrays.toString(row));
            }
            System.out.println();

            return ;
        }

        if(arr[r][c]!=0){
            return ;
        }

        arr[r][c]=l;
        

        if(r<arr.length-1){
            allPath(arr, p+"d", r+1, c,l+1);
        }

        if(c<arr[0].length-1){
            allPath(arr, p+"r", r, c+1,l+1);
        }

        if(r>0){
            allPath(arr, p+"u", r-1, c,l+1);
        }

        if(c>0){
            allPath(arr, p+"l", r, c-1,l+1);
        }

        
        arr[r][c]=0;
        
    }
    
}
