package Searching.Linear_Search;

import java.util.Scanner;

public class SearchInRange {

    public static void main(String[] args) {
        int[] arr = {1,6,3,88,99,55,45,90,-1};
        Scanner scn = new Scanner(System.in);
        int s = scn.nextInt();
        int e = scn.nextInt();
        int res = lri(arr,1,s,e);
        System.out.println(res);


    }

    static int lri(int[] arr, int k,int start, int end){
        if (arr.length==0){
            return -1;
        }

        for (int i=start; i<=end; i++){
            if (arr[i]==k){
                return i;
            }
        }

        return -1;
    }

    
}
