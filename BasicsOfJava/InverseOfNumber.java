package BasicsOfJava;

import java.util.*;

  
  public class InverseOfNumber{
  
  public static void main(String[] args) {

      Scanner scn = new Scanner(System.in);
  
       // write ur code here
       
       System.out.print("Enter number:");
       int n = scn.nextInt();
       int d = 0;
       int t = n;
       while(t!=0){
        d++;
        t=t/10;
       }
       if (d==6){
       int f = n/100000;
        System.out.print(f);}
        else{
        int p = d;
        int pos = 0;
        int r = 0;
        int temp = n;
        for(int i =0; i<5; i++){
            temp=n;
            pos=0;
            while(temp!=0){
            r = temp%10;
            pos++;
            temp = temp/10;
            if (r == p){
                System.out.print(pos);
                p--;
                
                break; //621435
                  //613254  

            }
            }
            
        }
       
   }
  }
}
