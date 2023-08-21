package Searching.Linear_Search;


public class linear_search {

    public static void main(String[] args) {
        int[] arr = {1,6,3,88,99,55,45,90,-1};

        int res = lri(arr,1);
        int r2 = lre(arr,-1);
        boolean r3 = lrb(arr,55);
        int r4 = lre(arr,33);
        System.out.println(res);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);


    }

    static int lri(int[] arr, int k){
        if (arr.length==0){
            return -1;
        }

        for (int i=0; i<arr.length; i++){
            if (arr[i]==k){
                return i;
            }
        }

        return -1;
    }

    static int lre(int[] arr, int k){
        if (arr.length==0){
            return Integer.MAX_VALUE;
        }

        for (int e : arr){
            if (e==k){
                return e;
            }
        }

        return Integer.MAX_VALUE;
    }

    static boolean lrb(int[] arr, int k){
        if (arr.length==0){
            return false;
        }

        for (int e : arr){
            if (e==k){
                return true;
            }
        }

        return false;
    }


    
}
