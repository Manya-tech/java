package Recursion.SubsetSubsequenceProblems;

import java.util.ArrayList;
import java.util.List;

public class Subset {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subs(arr);
        for (List<Integer> val : ans){
            System.out.println(val);
        }

    }

    static List<List<Integer>> subs(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int val : arr){
            int n = outer.size();

            for (int i=0; i<n; i++){
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(val);
                outer.add(inner);
            }
        }

        return outer;
    }
    
}
