package Searching.Binary_Search;

public class ElementInInfinite {

    public static void main(String[] args) {
        int[] arr = {1,4,6,8,9,10,33,65,78,99,100,101,105,209,300,500,600};
        int k = 78;
        int ans = ans(arr,k);
        System.out.println(ans);
    }

    static int ans(int[] arr, int k){
        int s=0;
        int e=1;

        while(k>arr[e]){
            int ns=e+1;
            e = e+(e-s+1)*2;
            s=ns;
        }
        return binarys(arr,k,s,e);
    }

    static int binarys(int[] arr, int k, int s, int e){
        // int[] index = ans(arr,k);
        // int s = 0;
        // int e = index[1];
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
        return -1; 
    }
    
}
