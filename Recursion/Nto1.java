package Recursion;

public class Nto1 {
    public static void main(String[] args) {
        int n = 10; 
        print(n);
    }

    static void print(int n){
        if(n==0){
            return ;
        }
        System.out.print(n+" ");
        print(--n);
    }
    
}
