package Maths_for_DSA.Bitwise_oprations;

public class SingleElementInArray {

    public static void main(String[] args) {
        int[] arr = {3,3,7,7,10,11,11};

        System.out.println(singleElement(arr));
    }

    static int singleElement(int[] arr){
        int single=0;
        
        for (int num : arr){
            
            single^=num;
            
        }
        
        return single;
    }
    
}
