package Recursion.SubsetSubsequenceProblems;

public class SubsequenceWithASCII {

    public static void main(String[] args) {

        subS("abc","");
        
    }

    static void subS(String str, String p){
        if(str.isEmpty()){
            System.out.println(p);
            return ;
        }

        char ch = str.charAt(0);

        subS(str.substring(1), p+ch);
        subS(str.substring(1), p);
        subS(str.substring(1), p+(ch+0));
    }
    
}
