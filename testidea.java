import java.util.Arrays;

public class testidea {
    static int c=0;
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }

    
    public static int numberOfSteps(int num) {
        
        if(num==0){
            return c;
        }
        
        if((num&1)==0){
            c++;
            return numberOfSteps(num/2);
        }
        c++;
        return numberOfSteps(num-1);
        
    }
    
}
