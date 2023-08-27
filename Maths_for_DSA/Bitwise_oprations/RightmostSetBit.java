package Maths_for_DSA.Bitwise_oprations;

public class RightmostSetBit {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(rightmostSetBit(num));
        
    }

    static int rightmostSetBit(int num){
        return (num&(-num));
    }

    // static int rightmostSetBit(int num){
    //     int c=0;
    //     int i=0;
    //     while(c!=1){
    //         if((num&(1<<i))==1){
    //             c++;
    //         }else{
    //             i++;
    //         }
    //     }
    //     return c;
    //}
    
}
