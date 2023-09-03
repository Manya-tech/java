package Recursion;

    import java.util.Arrays;

public class BubbbleSortwithBreak {




    public static void main(String[] args) {
        int[] arr = {1,4,2,3,5};
        bubbleSort(arr, arr.length, 0, false);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr, int n, int c, boolean swap){

        if(n==0){
            return ; 
        }

        if(c<n-1){
             if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
                swap=true;
             }

             bubbleSort(arr, n, c+1,swap);
        }
        else{
            
        System.out.println(1);
            if(!swap){
                return ;
            }
            bubbleSort(arr, n-1, 0,false);

        }

    }
    
}
    

