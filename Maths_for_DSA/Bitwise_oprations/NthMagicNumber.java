package Maths_for_DSA.Bitwise_oprations;

public class NthMagicNumber {
    public static void main(String[] args) {
         int num = 4;
    System.out.println(magicNumber(num));
        
    }

    static int magicNumber(int num){
        int ans = 0;
        int p=1;
        while(num>0){
        int n = num&1;
        num=num>>1;
        ans+=n*(int)Math.pow(5,p);
        p++;}
        return ans;

    }
   
    
}
