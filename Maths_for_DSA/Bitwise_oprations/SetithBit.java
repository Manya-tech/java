package Maths_for_DSA.Bitwise_oprations;

public class SetithBit {
    public static void main(String[] args) {
        int num = 13;
        System.out.println(setithBit(num, 2));
        
    }

    static int setithBit(int num, int i){
        return (num|(1<<(i-1)));
    }
    
}
