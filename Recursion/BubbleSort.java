package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr, arr.length, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int n, int c){

        if(n==0){
            return ;
        }
        if(c<n-1){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
                
            }
                bubbleSort(arr, n, c+1);
            
        }else{
            bubbleSort(arr, n-1, 0);
        }


    }
}
