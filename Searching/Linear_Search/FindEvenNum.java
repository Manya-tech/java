package Searching.Linear_Search;

public class FindEvenNum {
    public static void main(String[] args) {
        int [] arr = {12,345,2,6,7896,11,22,4,7,99};
        System.out.println(findNumbers(arr));
    }
    
    static int findNumbers(int[] nums) {
        int count=0;
        for (int element : nums){
            if (even(element)){
                count++;
            }
        }

        return count;
    }

    static int digits(int num){
        if (num<0){
            num=num*-1;
        }

        return (int)Math.log10(num)+1;
    }
    
    static boolean even(int num){

        return digits(num)%2==0;
    }
}
