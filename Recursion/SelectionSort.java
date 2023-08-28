package Recursion;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sSort(arr, arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void sSort(int[] arr, int r, int c, int mi){

        if(r==0){
            return;
        }

        if(c<r){
            if(arr[c]>arr[mi]){
                mi=c;
            }
            sSort(arr,r,c+1,mi);
          
            }
            
        else{

        int temp = arr[mi];
        arr[mi]=arr[r-1];
        arr[r-1]=temp;
        sSort(arr,r-1,0,0);}
    }
    
}
