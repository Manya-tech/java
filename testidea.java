import java.util.Arrays;

public class testidea {
    public static void main(String[] args) {
        
    int[] arr = {4,2,5,3,1};
    qsort(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));

        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        
    }

    static void qsort(int[] nums, int l, int h){

        if(l>=h){
            return ;
        }

        int s = l;
        int e = h;
        int m = s+(e-s)/2;
        int pivot = nums[m];

        while(s<=e){

            while(nums[s]<pivot){
                s++;
            }

            while(nums[e]>pivot){
                e--;
            }

            if(s<=e){
                int temp = nums[s];
                nums[s]=  nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }

        qsort(nums,l,e);
        qsort(nums,s,h);
    }
    
}
