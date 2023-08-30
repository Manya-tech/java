package Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {4,2,5,3,1};
        qsort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        
    }

    static void qsort(int[] nums, int l, int h){
        if(l>=h){
            return ;
        }

        int s=l;
        int e=h;
        int m = s+(e-s)/2;
        int pivot = nums[m];

        while(s<=e){
        while(nums[s]<pivot){
            s++;
        }
        while(nums[e]>pivot){
            e--;
        }

        if(s<=e){
            int temp = nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }

    qsort(nums,l,e);
    qsort(nums,s,h);

    }

    // static int part(int[] nums, int l , int h){
    //     int s=l;
    //     int e = h;
    //     int pivot = nums[s];
    //     while(s<e){
    //     do{
    //         s++;
    //     }while(nums[s]<pivot);

    //     do{
    //         e--;
    //     }while(nums[e]>pivot);

    //      if(s<e){
    //         int temp = nums[s];
    //         nums[s]=nums[e];
    //         nums[e]=temp;
    //      }
    //     }

    //     int temp = nums[l];
    //     nums[l]=nums[e];
    //     nums[e]=temp;

    //     return e;
    // }

    // static void qsort2(int [] nums, int l, int h){
    //     while(l<h){
    //         int p = part(nums,l,h);
    //         qsort(nums,l,p);
    //         qsort(nums,p+1,h);
    //     }
    // }
    
}
