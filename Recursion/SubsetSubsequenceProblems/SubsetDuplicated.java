package Recursion.SubsetSubsequenceProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetDuplicated {

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = subs(arr);
        for (List<Integer> val : ans){
            System.out.println(val);
        }

    }

    static List<List<Integer>> subs(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
       
        int s=0;
        int e = 0;
        for(int j=0; j<arr.length; j++){
            s=0;
            if(j>0 && arr[j]==arr[j-1]){
                s = e+1;
            }
            e = outer.size()-1;
            int n = outer.size();

            for (int i=s; i<n; i++){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(arr[j]);
                outer.add(inner);
            }
        }

        return outer;
    }

    // static List<List<Integer>> subsetDuplicate(int[] arr) {
    //     Arrays.sort(arr);
    //     List<List<Integer>> outer = new ArrayList<>();
    //     outer.add(new ArrayList<>());
    //     int start = 0;
    //     int end = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         start = 0;
    //         // if current and previous element is same, s = e + 1
    //         if (i > 0 && arr[i] == arr[i-1]) {
    //             start = end + 1;
    //         }
    //         end = outer.size() - 1;
    //         int n = outer.size();
    //         for (int j = start; j < n; j++) {
    //             List<Integer> internal = new ArrayList<>(outer.get(j));
    //             internal.add(arr[i]);
    //             outer.add(internal);
    //         }
    //     }
    //     return outer;
    // }
    
}
