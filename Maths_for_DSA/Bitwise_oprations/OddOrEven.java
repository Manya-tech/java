package Maths_for_DSA.Bitwise_oprations;

public class OddOrEven {

    public static void main(String[] args) {
        int num = 999;
        System.out.println(isOdd(num));
        
    }

    static boolean isOdd(int num){
        return ((num&1)==1);    
    }
    
}
