package Recursion;

import java.util.ArrayList;

public class LetterCombonationsPhoneNumber {

    public static void main(String[] args) {
        System.out.print(padc("","12"));
    }

    static ArrayList<String> pad(String p, String up){

        if(up.isEmpty()){

            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();

        for (int i = (digit-1)*3 ; i<digit*3; i++){
            char ch = (char) ('a' + i);

             ans.addAll((pad(p+ch , up.substring(1))));
        }

        return ans;
    }

    static int padc(String p, String up){

        if(up.isEmpty()){
            return 1;
        }

        int digit = up.charAt(0) - '0';
        int c=0;
        for (int i = (digit-1)*3 ; i<digit*3; i++){
            char ch = (char) ('a' + i);

             c = c+padc(p+ch , up.substring(1));
        }

        return c;
    }
    
}
