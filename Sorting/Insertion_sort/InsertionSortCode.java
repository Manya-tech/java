package Sorting.Insertion_sort;

import java.util.Arrays;

public class InsertionSortCode {
    public static void main(String[] args) {
        int[] arr = {8,7,-1,5,5,0,-2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void insertionSort(int[] arr){
        for (int i=0; i<=arr.length-2;i++){
            int j = i+1;
            while(j>0){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
                }else{
                    break;
                }
            }
        }
    }
}
