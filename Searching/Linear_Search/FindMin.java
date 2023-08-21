package Searching.Linear_Search;

public class FindMin {

    public static void main(String[] args) {
        int[] arr = {1,6,3,88,99,55,45,90,-1};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int m = arr[0];

        for (int i=0; i<arr.length; i++){
            if (m> arr[i]){
                m=arr[i];
            }
        }
        return m;
    }
    
}
