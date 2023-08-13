package BasicsOfJava;
import java.util.Scanner;

public class pattern5 {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int st = 1;
        int sp = n/2;
        for (int i=1; i<=n; i++)
        {
            System.out.println(sp+","+st);
            if (i<=n/2){
                sp--;
                st+=2;
            }
            else{
                sp++;
                st-=2;
            }
           
        
        }
       

    }
}


    

