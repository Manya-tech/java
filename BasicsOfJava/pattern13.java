package BasicsOfJava;

import java.util.Scanner;

public class pattern13 {
    
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        
        
       
        for(int i =0; i<n; i++){
            int y =1;
            for(int j = 0; j<=i; j++){
                System.out.print(y+" ");
                int y1 = y*(i-j)/(j+1);
                y=y1;
            }
            
            System.out.println();
        }

    }
}
