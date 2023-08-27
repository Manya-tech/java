package Maths_for_DSA.Bitwise_oprations;

public class XOR {
    public static void main(String[] args) {
        int a=10;
        System.out.print(xor(a));
    }
    static int xor(int a){
        if (a%4==0){
            return a;
        }else if(a%4==1){
            return 1;
        }else if(a%4==2){
            return a+1;
        }
        return 0;
    }
    
}
