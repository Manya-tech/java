package Recursion.SubsetSubsequenceProblems;

public class countPermutations {
    public static void main(String[] args) {
        String str =  "abc";
        System.out.println(perm("",str));
    }

    static int perm(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for(int i =0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String l = p.substring(i,p.length());
            count = count + perm(f+ch+l, up.substring(1));
        }

        return count;
    }
    
}
