package Searching.Binary_Search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        //int[] arr = {1,4,6,8,9,10,33,65,78,99};
        int[] arr = {99,87,64,50,33,12,10,6,4};
        int k = 33;
        int ans = oragbs(arr,k);
        System.out.println(ans);
    }

    static int oragbs(int[] arr, int k){

        int s = 0;
        int e = arr.length-1;
        boolean isAsc = arr[s]<arr[e];

        while(s<=e){
            int m = s+ (e-s)/2;

            if(arr[m]==k){
                return m;
            }
            else if(isAsc){
                if(k<arr[m]){
                    e=m-1;
                }else{
                    s=m+1;
                }
            }else{
                if(k>arr[m]){
                    e=m-1;
                }else{
                    s=m+1;
                }
            }
        }
        return -1;
    }
    
}
