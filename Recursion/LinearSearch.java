package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2, 5,2,6,8,7,9};
        //System.out.print(lastIndex(arr,arr.length-1,2));
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print(allIndex2(arr,0,2));
    }

    static int lsearch(int[] arr, int k){
        return helper(arr,0,k);
    }

    static int helper(int[] arr, int s, int k){

        if(s==arr.length){
            return -1;
        }

        if(arr[s]==k){
            return s;
        }
        return helper(arr,s+1,k);
        
    }

    static int lastIndex(int[] arr, int s, int k){

        if(s==-1){
            return -1;
        }

        if(arr[s]==k){
            return s;
        }
        return lastIndex(arr,s-1,k);
    }

  
    static ArrayList<Integer> allIndex(int[] arr, int s, int k, ArrayList<Integer> list){

        if(s==arr.length){
            return list;
        }

        if(arr[s]==k){
            list.add(s);
        }
         return allIndex(arr,s+1,k, list);
    }

    static ArrayList<Integer> allIndex2(int[] arr, int s,int k){
        ArrayList<Integer> list = new ArrayList<>();
        if(s==arr.length){
            return list;
        }

        if(arr[s]==k){
            list.add(s);
        }

        ArrayList<Integer> ansprev = allIndex2(arr,s+1,k);

        list.addAll(ansprev);

        return list;
        
    }
    
    
}
