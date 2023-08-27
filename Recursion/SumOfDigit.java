package Recursion;

public class SumOfDigit {

    public static void main(String[] args) {
        int n = 20022; 
        System.out.println(sumd(n));
    }

    static int sumd(int n){
        if(n==0){
            return 0;
        }
        // int d = n%10;
        return (n%10)+sumd(n/10);
    }
    
}
