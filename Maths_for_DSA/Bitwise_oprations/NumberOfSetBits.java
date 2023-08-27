package Maths_for_DSA.Bitwise_oprations;

public class NumberOfSetBits {

    public static void main(String[] args) {
        int num = 0;
        int c=0;
        // while(num>0){
        //     if((num&1)==1){
        //         c++;
        //     }
        //     num=num>>1;
        // }

        while(num>0){
            c++;
            num = num - (num&(-num));
        }
        System.out.print(c);
    }
    
}
