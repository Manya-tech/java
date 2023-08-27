package Maths_for_DSA.Bitwise_oprations;

public class XORrange {
    public static void main(String[] args) {
        int a=5; 
        int b=10;
        System.out.println(rxor(a,b));
        // System.out.println(5^6^7^8^9^10);
    }

    static int rxor(int a, int b){
        int xor=0;
        if (b%4==0){
            xor=b;
        }else if(b%4==1){
            xor= 1;
        }else if(b%4==2){
            xor= b+1;
        }else{
            xor=0;
        }
        a=a-1;
        int fxor=0;
        if (a%4==0){
            fxor= a;
        }else if(a%4==1){
            fxor= 1;
        }else if(a%4==2){
            fxor= a+1;
        }else{
        fxor= 0;
        }

        return fxor^xor;
    }

    
    
}
