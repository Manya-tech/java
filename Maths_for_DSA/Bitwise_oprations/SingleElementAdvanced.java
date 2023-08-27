package Maths_for_DSA.Bitwise_oprations;

public class SingleElementAdvanced {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1,2,3,4,4,4};
        System.out.println(singleElement(arr));
    }

    static int singleElement(int[] arr){
        int sum=0;
        for (int num: arr){
            sum+=num;
        }

        return (sum%3);
    }
    
}
