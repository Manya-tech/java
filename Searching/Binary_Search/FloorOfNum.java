package Searching.Binary_Search;

public class FloorOfNum {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,9,10,33,65,78,99};
        int k = 80;
        int ans = floor(arr,k);
        System.out.println(ans);
    }

    static int floor(int[] arr, int k){

        int s = 0;
        int e = arr.length-1;

        while(s<=e){
            int m = s + (e-s)/2;
            if(arr[m]==k){
                return m;
            }else if(k<arr[m]){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        
        return e;
    }
    
}
