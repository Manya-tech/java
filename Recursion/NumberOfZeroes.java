package Recursion;

public class NumberOfZeroes {

    static int c=0;

    public static void main(String[] args) {
        int n = 0;
        
        System.out.println(countZero(n));
    }

    // static void countZero(int n){
    //     if(n%10==n){
    //         if(n==0){
    //             c++;
    //             return ;
                 
    //         }else{
    //             return ;
    //         }
    //     }
    //     if(n%10==0){
    //         c++;
    //     }
    //     countZero(n/10);
    // }

    static int countZero(int n){
        return helper(n, 0);
    }

    static int helper(int n, int c){

        if(n==0){
            return c;
        }

        if(n%10==0){
            return helper(n/10,++c);
        }

        return helper(n/10,c);
    }
    
}
