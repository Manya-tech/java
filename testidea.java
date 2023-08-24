import java.util.Arrays;

public class testidea {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3,4},
                {5, 6,7,8},
                {9, 10, 11, 12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(search(arr,10)));
    }

    static int[] search(int[][] arr, int k){
        int re=arr.length-1;
        int rs=0;
        int c = arr[0].length-1;
        int[] res = {-1,-1};
        int rm=0;
        while(c>=0 && rs<=re){
            rm=rs+(re-rs)/2;
            int s = arr[rm][c];
            if(k==s){
                return new int[]{rm,c};
            }else if(k>s){
                rs=rm+1;
            }else if(k<s && k>=arr[rm][0]){
                break;
            }else{
                re=rm-1;
            }
        }

        res = bins(arr,k, rm);

        return res;


    }

    static int[] bins(int[][]arr, int k, int r){
        int cs=0;
        int ce= arr[0].length-1;

        while(cs<=ce){
            int m = cs+(ce-cs)/2;
            if(k==arr[r][m]){
                return new int[]{r,m};
            }else if(k<arr[r][m]){
                ce=m-1;
            }else{
                cs=m+1;
            }
        }
        return new int[]{-1,-1};
    }
    
}
