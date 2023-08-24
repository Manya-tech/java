package Sorting.Bubble_sort;

import java.util.Arrays;

public class BubbleSortCode {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,5};
        int c=0;
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swap=false;
        int c=0;
        for (int i=1; i<=arr.length; i++){
            swap=false;
            for (int j=1; j<=arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            c++;
            if(!swap){
                break;
            }

        }
        System.out.println(c);
    }
    
}
