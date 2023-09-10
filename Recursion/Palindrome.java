package Recursion;

public class Palindrome {

    public static void main(String[] args) {
        int n = 1221;
        int s = (int)Math.log10(n);
        System.out.print(isPalindrome(n, (int)Math.pow(10,s)));
    }

    static int rev(int n){
            if(n==0){
                return 0;
            }
            // int d = (int)Math.log10(n);
            int pow = (int)Math.pow(10,(int)(Math.log10(n)));
            return (n%10)*pow+rev(n/10);
        }

    static boolean isPalindrome(int n, int p){
        return n==rev(n);
    }
    
}
