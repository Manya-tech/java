package BasicsOfJava;

import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int sp = 1;
        int st = (n/2)+1;

        for (int i = 1; i<=n; i++){
            System.out.println(st+","+sp);
            if(i<=n/2){
                st--;
                sp+=2;
            }
            else{
                st++;
                sp-=2;
            }
        }
    
    
    
    }
    
}
