package Recursion;

public class OneToN {

    public static void main(String[] args) {
        int n = 10; 
        both(n);
    }

    static void print(int n){
        if(n==0){
            return ;
        }
        print(n-1);
        System.out.print(n+" ");
        
    }

    static void both(int n){
        if(n==0){
            return ;
        }
        System.out.print(n+" ");
        both(n-1);
        System.out.print(n+" ");
    }

    
}
