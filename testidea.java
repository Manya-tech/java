import java.util.Arrays;

public class testidea {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    public  static int mySqrt(int x) {
        
        int s=2;
        int e = x/2;
        System.out.println(e);
        while(s<=e){
            int m =s+(e-s)/2;
            System.out.println(m);
            if(m*m==x || (m*m<x && (m+1)*(m+1)>x)){
                return m;
            }else if(m*m<x){
                s=m+1;
            }else if(m*m>x){
                e=m-1;
            }
        }
        
        return 1;
        
    }
    
}
