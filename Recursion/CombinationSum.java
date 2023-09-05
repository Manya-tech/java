package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7};
        int t=7;
        System.out.println(combinationSum(arr,t));
    }

     static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        
        if(target==0){
            return outer;
        }
//         ArrayList<Integer> inner = new ArrayList<>();
//        for(int i=0; i<candidates.length; i++){
//            if(target-candidates[i]>=0){
//                inner.add(candidates[i]);
               
               
//            }
//        }
        ArrayList<Integer> inner = new ArrayList<>();
        for(int val : candidates){
            if(target-val>=0){
                inner.add(val);
                combinationSum(candidates,target-val);
                outer.add(inner);
            }
        }
        
         return outer;
    }
    
}
