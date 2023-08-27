package Recursion;

public class ReverseANumber {

    static int sum=0;
    public static void main(String[] args) {
        int n = 1234; 
        rev(n);
        System.out.println(sum);
        
        
    }

    // static String rev(int n){
    //     if(n==0){
    //         return "";
    //     }
        
    //     return n%10+""+rev(n/10);
    // }
    
    // static int rev(int n){
    //     if(n==0){
    //         return 0;
    //     }
    //     // int d = (int)Math.log10(n);
    //     int pow = (int)Math.pow(10,(int)(Math.log(n)/Math.log(10)));
    //     return (n%10)*pow+rev(n/10);
    // }

    // kunal first way
    static void rev(int n){
        if(n==0){
            return ;
        }
        int rem  = n%10;
        sum = sum*10 + rem;
        rev(n/10);
        
    }
}
