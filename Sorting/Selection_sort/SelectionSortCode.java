package Sorting.Selection_sort;

import java.util.Arrays;

public class SelectionSortCode {
    public static void main(String[] args) {
        int[] arr = {2,-1,0,6,7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void selectionSort(int[] arr){
        for (int i=0; i<arr.length; i++){
            int last=arr.length-1-i;
            int me = maxIndex(arr,0,last);
            swap(arr,me,last);
        }

    }

    static int maxIndex(int[] arr, int start, int end){
        int max = arr[0];
        int mi = 0;
        for(int i=start; i<=end; i++){
            if(arr[i]>max){
                max=arr[i];
                mi=i;
            }
        }
        return mi;
    }

    static void swap(int[] arr,int me, int se){
        int temp=arr[se];
        arr[se]=arr[me];
        arr[me]=temp;
    } 
}
