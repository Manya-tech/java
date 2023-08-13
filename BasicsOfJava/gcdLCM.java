package BasicsOfJava;

import java.util.Scanner;

public class gcdLCM {

    public static void main(String[] args){
    
        Scanner scn = new Scanner(System.in);
        System.out.print("enter a ");
        int n1 = scn.nextInt();
        System.out.print("enter b ");
        int n2 = scn.nextInt();

        // int n = a>b?b:a;
        // int gcd=1;
        //  for (int i = n/2; i>=1; i--){
        //     if (a%i==0 && b%i==0){
        //         gcd = i;
        //         break;
        //     }
        //  }
        
        int temp1 = n1;
    int temp2 = n2;
    

    while (n1 % n2 != 0)
    {
      int remainder = n1 % n2;
      n1 = n2;
      n2 = remainder;
    }
    int gcd = n2;
    int lcm = (temp1 * temp2) / gcd;

    System.out.println(gcd);
    System.out.println(lcm);
    }

    
}
