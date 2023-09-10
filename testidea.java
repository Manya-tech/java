import java.util.ArrayList;
import java.util.Arrays;

public class testidea {
    public static void main(String[] args) {
//         [4,0,0,0,0,0]
// 1
// [1,2,3,5,6]
// 5
        int[] a = {1,2,3,0,0,0};
        int[] b= {2,5,6};
        merge(a,3,b,3);
        System.out.println(Arrays.toString(a));
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] a = new int[m];
        for(int i=0; i<m; i++){
            a[i]=nums1[i];
        }
        
        int i=0;
        int j=0;
        int k=0;
        while(j<n && i<m){
            
            if(a[i]<=nums2[j]){
                nums1[k]=a[i];
                i++;
            }else{
                nums1[k]=nums2[j];
                j++;
            }
            k++;
        }
        
        while(j<n){
            
            nums1[k]=nums2[j];
            k++;
            j++;
        }
        while(i<m){
            
            nums1[k]=a[i];
            i++;
            k++;
        }

        
        // System.out.println(Arrays.toString(nums2));
    }
    
}
