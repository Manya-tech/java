import java.util.Scanner;

public class ReverseArray {

    public static void rev(int[] x,int n, int m)
    {
        if (n>=m){
            return ;
        }
        int temp=x[n];
        x[n]=x[m];
        x[m]=temp;
        rev(x,n+1,m-1);
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n;i++){
            a[i] = scn.nextInt();
        }
        System.out.println();
        rev(a, 0, a.length-1);
        for(int i: a){
            System.out.println(i);
        }
       
    }
    
}
