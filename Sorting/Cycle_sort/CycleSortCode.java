package Sorting.Cycle_sort;

import java.util.Arrays;

public class CycleSortCode {
    
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2,5,6,7};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
//  my approach
    // static void cycleSort(int[] arr){
    //     for (int i=0; i<arr.length; i++){
    //         while(i!=arr[i]-1){
    //             int temp = arr[i];
    //             arr[i]=arr[temp-1];
    //             arr[temp-1]=temp;
    //         }
    //     }
    // }

    static void cycleSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIn = arr[i]-1;
            if(arr[i]!=arr[correctIn]){
                swap(arr,i,correctIn);
            }else{
                i++;
            }
            System.out.println(Arrays.toString(arr));

        }
    }

    static void swap(int[] arr, int f, int l){
        int temp = arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
    }


}
