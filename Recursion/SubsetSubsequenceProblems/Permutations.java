package Recursion.SubsetSubsequenceProblems;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String str =  "abc";
        System.out.println(permAL("",str));
    }

    static void perm(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0);
        for(int i =0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String l = p.substring(i,p.length());
            perm(f+ch+l, up.substring(1));
        }
    }

     static ArrayList<String> permAL(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }
        ArrayList<String> fans = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i =0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String l = p.substring(i,p.length());
            fans.addAll(permAL(f+ch+l, up.substring(1)));
        }

        return fans;
    }
    
}
