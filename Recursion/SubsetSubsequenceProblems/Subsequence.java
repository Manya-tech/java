package Recursion.SubsetSubsequenceProblems;

import java.util.ArrayList;

public class Subsequence {

    public static void main(String[] args) {

        System.out.println(subSa("abc",""));
        
    }

    static void subS(String str, String p){
        if(str.isEmpty()){
            System.out.println(p);
            return ;
        }

        char ch = str.charAt(0);

        subS(str.substring(1), p+ch);
        subS(str.substring(1), p);
    }

    static ArrayList<String> subSa(String str, String p){


        if(str.isEmpty()){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        char ch = str.charAt(0);

        ArrayList<String> left = subSa(str.substring(1), p+ch);
         ArrayList<String> right = subSa(str.substring(1), p);
         
         left.addAll(right);

         return left;
    }
    
}
