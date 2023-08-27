package Maths_for_DSA.Bitwise_oprations;

public class ithBitOfNum {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(ithBit(num, 3));
        //System.out.println((1<<3));
        
    }

    static int ithBit(int num , int i){
        return ((num&(1<<i-1))>>(i-1));
    }
    
}
