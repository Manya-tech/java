package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        ipmergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergeSort(int[] arr){

        if(arr.length==1){
            return arr;
        }

        int m = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,m));
        int[] right = mergeSort(Arrays.copyOfRange(arr, m, arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] first, int[] second){

        int[] ans = new int[first.length+second.length];



        int i=0; int j=0; int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){  //add = for stability
                ans[k]=first[i];
                i++;
            }else{
                ans[k]=second[j];
                j++;
            }
               k++;
        }

        while(i<first.length){
            ans[k]=first[i];
            i++; k++;
        }

        while(j<second.length){
            ans[k]=second[j];
            j++; k++;
        }

        return ans;
    }
    

    static void ipmergeSort(int[] arr, int s, int e){

        if(e-s==1){
            return ;
        }

        int m = (e+s)/2;

        ipmergeSort(arr, s, m);
        ipmergeSort(arr, m, e);

        merge2(arr,s,m,e);
    }

    static void merge2(int[] arr, int s, int m, int e){

        int[] ans = new int[e-s];



        int i=s; int j=m; int k=0;
        while(i<m && j<e){
            if(arr[i]<arr[j]){  //add = for stability
                ans[k]=arr[i];
                i++;
            }else{
                ans[k]=arr[j];
                j++;
            }
               k++;
        }

        while(i<m){
            ans[k]=arr[i];
            i++; k++;
        }

        while(j<e){
            ans[k]=arr[j];
            j++; k++;
        }

        for(int l=0; l<ans.length; l++){
            arr[s+l]=ans[l];
        }


      
    }
}
