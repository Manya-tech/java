package Maths_for_DSA.Bitwise_oprations;

public class IsPowerOfTwo {
    
    public static void main(String[] args) {
        int num=11;
       if((num&(num-1))==0){
        System.out.print(true);
       }else{
         System.out.print(false);
       }
    }
    
}
