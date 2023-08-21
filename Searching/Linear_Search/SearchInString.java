package Searching.Linear_Search;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Manya Gupta";
        char c = 'z';
        int res = ss(name,c);

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(res);

    }

    static int ss(String s, char c){
        if(s.length()==0){
            return -1;
        }

        for (int i=0; i<s.length(); i++){
            if(s.charAt(i)==c){
                return i;
            }
        }

        return -1;

    }

    static boolean ss2(String s, char c){
        if(s.length()==0){
            return false;
        }

        for (char ch: s.toCharArray())
        { if(ch==c){
            return true;        }
            
        }

        return false;

    }
    
}
