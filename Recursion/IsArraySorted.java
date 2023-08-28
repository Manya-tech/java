package Recursion;

public class IsArraySorted {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,6,7,8};
        System.out.print(isSorted(arr,0));
    }

    // static boolean isSorted(int[] arr, int s){

    //     if(s+1<arr.length){
    //         if(arr[s]<arr[s+1]){
    //             return isSorted(arr, s+1);
    //         }else{
    //             return false;
    //         }
    //     }

    //     return true;
    // }

    static boolean isSorted(int[] arr, int s){

        if(s+1<arr.length){
          
                return arr[s]<arr[s+1] && isSorted(arr, s+1);
        }

        return true;
    }
    
}
