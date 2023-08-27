package Maths_for_DSA.Bitwise_oprations;

public class ResetithBit {
    public static void main(String[] args) {
        int num = 13;
        System.out.println(resetithBit(num, 2));
        
    }

    static int resetithBit(int num, int i){
        return (num&(~(1<<(i-1))));
    }
}
