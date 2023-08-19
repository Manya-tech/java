package Array;

import java.util.Arrays;

public class test {
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        int min = arr[l];
        int id = 0;
        
        for (int i=1; i<=k-1; i++){
            for (int j=l; j<=r; j++){
                if (arr[j]<min && arr[j]!=-1){
                    min=arr[j];                    id=j;
                }
            }
            arr[id] = -1;
            min=arr[l];
            System.out.println(Arrays.toString(arr));
        }

        for (int i=l; i<=r; i++){
            if (arr[i]<min && arr[i]!=-1){
                min=arr[i];
            }
        }
        return min;
    } 

    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
        int res = kthSmallest(arr,0,arr.length-1,3);
        System.out.println(res);

    }
    
}
